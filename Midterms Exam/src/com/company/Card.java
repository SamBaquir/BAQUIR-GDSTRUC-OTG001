package com.company;

import java.util.Objects;

public class Card {
    private char card;

    public Card(char card) {
        this.card = card;
    }

    public char getCard() {
        return card;
    }

    public void setCard(char card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Card{" +
                card +
                '}';
    }
}
