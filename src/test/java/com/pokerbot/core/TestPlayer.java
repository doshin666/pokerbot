package com.pokerbot.core;

import org.junit.Assert;
import org.junit.Test;

public class TestPlayer {

    @Test
    public void testPlacingBetDeductsFromChipBalance() {
        Player player = new Player();
        int startingChips = player.getChipBalance();

        //First bet placed to half total
        player.placeBet(startingChips/2);
        Assert.assertEquals(player.getChipBalance(), startingChips/2);
        System.out.println("Chip Balance: " + player.getChipBalance());

        //Second bet placed to reduce stack to quarter size of original
        player.placeBet(startingChips/4);
        Assert.assertEquals(player.getChipBalance(), startingChips/4);
        System.out.println("Chip Balance: " + player.getChipBalance());
    }

    @Test
    public void testReceivingWinnings() {
        Player player = new Player();
        int startingChips = player.getChipBalance();

        //First Winnings
        player.receiveWinnings(5000);
        Assert.assertEquals(player.getChipBalance(), startingChips + 5000);
        System.out.println("Chip Balance: " + player.getChipBalance());

        //Second Winnings
        player.receiveWinnings(5000);
        Assert.assertEquals(player.getChipBalance(), startingChips + 10000);
        System.out.println("Chip Balance: " + player.getChipBalance());
    }
}
