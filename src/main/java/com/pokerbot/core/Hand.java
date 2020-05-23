package com.pokerbot.core;

import java.util.ArrayList;

public class Hand {
    ArrayList<Pot> potsList = new ArrayList<Pot>();
    int indexOfButton;
    int indexOfSB;
    int smallBlindValue;
    int indexOfBB;
    int bigBlindValue;

    Deck deck = new Deck();
    private ArrayList<Card> communityCards = new ArrayList<Card>();

    public ArrayList<Player> playHand(ArrayList<Player> players, int indexOfButton) {
        Pot startingPot = new Pot();
        potsList.add(startingPot);
        workOutBlinds(players, potsList);
        preFlop(players, potsList, indexOfButton);
        preTurn(players, potsList, indexOfButton, communityCards);
        preRiver(players, potsList, indexOfButton, communityCards);
        showdown(players, potsList, indexOfButton, communityCards);
        //TODO: Work out hand logic
        return players;
    }

    public void workOutBlinds(ArrayList<Player> players, ArrayList<Pot> potsList) {
        indexOfSB = indexOfButton + 1;
        indexOfBB = indexOfButton + 2;
        players.get(indexOfSB).placeBet(smallBlindValue, potsList);
        players.get(indexOfBB).placeBet(bigBlindValue, potsList);
    }

    public void preFlop(ArrayList<Player> players, ArrayList<Pot> potsList, int indexOfButton) {
        calculateBets();
    }

    public void preTurn(ArrayList<Player> players, ArrayList<Pot> potsList, int indexOfButton, ArrayList<Card> communityCards) {
        deck.burnCard();
        communityCards.add(deck.drawCardFromDeck());
        communityCards.add(deck.drawCardFromDeck());
        communityCards.add(deck.drawCardFromDeck());
        calculateBets();
    }

    public void preRiver(ArrayList<Player> players, ArrayList<Pot> potsList, int indexOfButton, ArrayList<Card> communityCards) {
        deck.burnCard();
        communityCards.add(deck.drawCardFromDeck());
        calculateBets();

    }

    public void showdown(ArrayList<Player> players, ArrayList<Pot> potsList, int indexOfButton, ArrayList<Card> communityCards) {
        deck.burnCard();
        communityCards.add(deck.drawCardFromDeck());
        calculateBets();
    }

    public void calculateBets() {
        //TODO: WORK OUT HOW TO RECEIVE AND SEND PLAYER BETS
    }
}
