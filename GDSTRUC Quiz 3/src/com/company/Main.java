package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue (5);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int games = 0;

        while (games < 10)
        {
            //For queue checking
            boolean matchMade = false;

            //Pauses each iteration
            System.out.println("Enter any number to continue.");
            int input = scanner.nextInt();

            //Queue players from 1 to 7
            queuePlayers(queue, random);
            System.out.println("Queueing: ");
            queue.printQueue();

            // Evaluate and do necessary action
            matchMade = queueCheck(queue, matchMade);
            if (matchMade) games++;
            System.out.println("Games made: " + games);
            System.out.println("\n");
            clearScreen();
        }
    }

    private static void queuePlayers(ArrayQueue queue, Random random)
    {
        int randomPlayers = random.nextInt(7) + 1;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < randomPlayers; i++)
        {
            int randomID = random.nextInt (100) + 1;
            int randomLevel = random.nextInt(100) + 1;
            queue.add(new Player (randomID, alphabet.charAt(random.nextInt(alphabet.length())), randomLevel));
        }
    }

    private static boolean queueCheck (ArrayQueue queue, boolean match)
    {
        if (queue.size() < 5)
        {
            System.out.println("Match cant be made");
            return match;
        }
        System.out.println("\n");
        System.out.println("Match found! Initializing a game with the following players: ");
        for (int i = 0; i < 5 ; i++) {
            System.out.println(queue.peek());
            queue.remove();
        }
        boolean matchValid = true;
        return matchValid;
    }

    private static void clearScreen()
    {
        //For clearing screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}