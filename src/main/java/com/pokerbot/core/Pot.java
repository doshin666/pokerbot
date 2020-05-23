package com.pokerbot.core;

public class Pot {
    private int potTotal = 0;

    public int getPotTotal() {
        return potTotal;
    }

    public void addChipsToPot(int bet){
        potTotal = potTotal + bet;
    }
}
