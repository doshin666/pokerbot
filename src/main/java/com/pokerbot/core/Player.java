package com.pokerbot.core;

import java.util.ArrayList;

public class Player {
    private int chipBalance = 1000000;
    private ArrayList<Card> cardsInHand;
    private boolean folded = false;
    private boolean allIn = false;

    public void receiveCardFromDealer(Card card) {
        cardsInHand.add(card);
    }

    public void playerFolds() {
        this.folded = true;
    }

    public int getChipBalance() {
        return chipBalance;
    }

    public int placeBet(int bet, ArrayList<Pot> potsList) {
        int betPlaced;
        if (chipBalance >= bet){
            chipBalance = chipBalance - bet;
            potsList.get(potsList.size()-1).addChipsToPot(bet);
            betPlaced = bet;
        } else {
            betPlaced = chipBalance;
            potsList.get(potsList.size()-1).addChipsToPot(betPlaced);
        }
        return betPlaced;
    }

    public void receiveWinnings(int winnings) {
        chipBalance = chipBalance + winnings;
    }
}
