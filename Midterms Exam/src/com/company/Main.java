package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Instantiate all CardStack objects
        CardStack cardDeck = new CardStack(30);
	    CardStack discardedPile = new CardStack(0);
        CardStack userCards = new CardStack(0);

	    //Instantiate randomizer
        Random random = new Random();

        //Generates the card Deck
        generateCards(cardDeck, random);

        // Loops the game
        while (!cardDeck.isEmpty())
        {
            //Where the magic happens
            playRound(cardDeck, userCards, discardedPile, random);

            //Show results of each round
            roundResults(cardDeck, userCards, discardedPile);

            //Pauses the game after each round
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number to continue.");
            int input = scanner.nextInt();
            clearScreen();
        }

        //When the game ends
        System.out.println("Game Over.");
    }

    private static void generateCards(CardStack stack, Random random)
    {
        //alphabet contains the letters used for naming the card on each iteration
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < stack.getDeckSize(); i++) {
            stack.push(new Card(alphabet.charAt(random.nextInt(alphabet.length()))));
        }
    }

    private static void playRound (CardStack deck, CardStack user, CardStack pile, Random random)
    {
        //Randomizes the command and value
        int randomCommand = random.nextInt(3) + 1;
        int randomValue = random.nextInt(5) + 1;

        //The process of each turn
        if (randomCommand == 1)
        {
            System.out.println("Draw " + randomValue + " card(s) from the deck.");
            for (int i = 0; i < randomValue; i++)
            {
                if (deck.isEmpty()) return;
                user.push(deck.peek());
                user.addCardSize();
                deck.pop();
                deck.subtractCardSize();
            }
        }
        else if (randomCommand == 2)
        {
            System.out.println("Discard " + randomValue + " card(s) from the your hand.");
            for (int i = 0; i < randomValue; i++)
            {
                if (user.isEmpty()) return;
                pile.push(user.peek());
                pile.addCardSize();
                user.pop();
                user.subtractCardSize();
            }
        }
        else
        {
            System.out.println("Get " + randomValue + " card(s) from the discarded pile.");
            for (int i = 0; i < randomValue; i++)
            {
                if (pile.isEmpty()) return;
                user.push(pile.peek());
                user.addCardSize();
                pile.pop();
                pile.subtractCardSize();
            }
        }
    }

    private static void roundResults(CardStack deck1, CardStack user2, CardStack pile3)
    {
        //Prints the cards in the player's deck
        System.out.println("Number of cards in the Deck: " + deck1.getDeckSize());
        //deck1.printStack();

        //Prints the cards in the player's hands
        System.out.println("Cards in your hand: " + user2.getDeckSize());
        user2.printStack();

        //Prints the discarded pile
        System.out.println("Number of cards in the discarded pile: " + pile3.getDeckSize());
        //pile3.printStack();
    }

    private static void clearScreen()
    {
        //For clearing screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

