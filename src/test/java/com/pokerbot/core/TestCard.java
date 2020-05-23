package com.pokerbot.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCard {

    private static String[] testRanks = { "Ace" , "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King" };

    @Test
    public void testRankAsString() {
        for (int i =0; i < 13; i++){
            String rankAsString = Card.rankAsString((short)i);
            assertEquals(testRanks[i], rankAsString);
        }
    }
}
