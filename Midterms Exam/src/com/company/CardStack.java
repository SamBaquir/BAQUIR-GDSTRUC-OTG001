package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;
    private int deckSize;

    public CardStack(int size)
    {
        stack = new LinkedList<Card>();
        deckSize = size;
    }

    public void push(Card card)
    {
        stack.push(card);
    }
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public int getDeckSize()
    {
        return deckSize;
    }

    public void addCardSize()
    {
        this.deckSize++;
    }

    public void subtractCardSize()
    {
        this.deckSize--;
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
