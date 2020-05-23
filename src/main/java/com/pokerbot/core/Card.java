package com.pokerbot.core;

public class Card {
    private short suit;
    private short rank;

    private static String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
    private static String[] ranks = { "Ace" , "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King" };

    public short getRank() {
        return rank;
    }

    Card(short suit, short rank)
    {
        this.rank=rank;
        this.suit=suit;
    }

    public short getSuit() {
        return suit;
    }

    public static String rankAsString(short rank) {
        return ranks[rank];
    }

    @Override
    public String toString() {
        return ranks[rank] + " of " + suits[suit];
    }
}
