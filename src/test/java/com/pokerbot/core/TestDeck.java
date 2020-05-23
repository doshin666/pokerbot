package com.pokerbot.core;

import org.junit.Assert;
import org.junit.Test;

public class TestDeck {

    @Test
    public void printOutDeck() {
        Deck deck = new Deck();
        while(deck.remainingCards() > 0) {
            System.out.println(deck.drawCardFromDeck().toString());
        }
    }

    @Test
    public void testDeckSizeOnConstruction() {
        Deck deck = new Deck();
        Assert.assertEquals(deck.remainingCards(), 52);
    }

    @Test
    public void testDrawingCard() {
        Deck deck = new Deck();
        Assert.assertEquals(deck.remainingCards(), 51);
    }

    @Test
    public void testReconstructDeck() {
        Deck deck = new Deck();
        deck.drawCardFromDeck();
        deck.drawCardFromDeck();
        Assert.assertEquals(deck.remainingCards(), 50);
        deck.reconstructDeck();
        Assert.assertEquals(deck.remainingCards(), 52);
    }

}
