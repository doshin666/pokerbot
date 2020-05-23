package com.pokerbot.core;

import edu.emory.mathcs.backport.java.util.Collections;
import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;
    private ArrayList<Card> drawnCards;
    short numberOfSuits = 4;
    short numberOfRanks = 13;
    Card tempCard;

    Deck () {
        cards = new ArrayList<Card>();
        drawnCards = new ArrayList<Card>();
        for (int suit = 0; suit < (int)numberOfSuits; suit++) {
            for (int rank = 0; rank < (int)numberOfRanks; rank++) {
                cards.add(new Card((short)suit, (short)rank));
            }
        }
        shuffleDeck(cards);
    }

    private void shuffleDeck (ArrayList<Card> cards) {
        Collections.shuffle(cards);
    }

    public int remainingCards() {
        return cards.size();
    }

    public Card drawCardFromDeck() {
        drawAndRemoveCard();
        return tempCard;
    }

    private void drawAndRemoveCard() {
        tempCard = new Card(cards.get(0).getSuit(), cards.get(0).getRank());
        drawnCards.add(tempCard);
        cards.remove(0);
    }

    public void reconstructDeck() {
        cards.addAll(drawnCards);
        shuffleDeck(cards);
    }

    public void burnCard() {
        drawAndRemoveCard();
    }

}
