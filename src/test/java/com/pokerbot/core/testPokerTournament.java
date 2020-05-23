package com.pokerbot.core;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class testPokerTournament {
    

    @Test
    public void testForBrokePlayers() {
        PokerTournament pokerTournament = new PokerTournament();
        ArrayList<Player> players = new ArrayList<Player>();
        ArrayList<Pot> potList = new ArrayList<Pot>();
        Pot pot = new Pot();
        potList.add(pot);
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players = pokerTournament.checkForBrokePlayers(players);
        Assert.assertEquals(players.size(), 4);
        player1.placeBet(1000000, potList);
        players = pokerTournament.checkForBrokePlayers(players);
        Assert.assertEquals(players.size(), 3);
        Assert.assertEquals(players.indexOf(player1), -1);
        Assert.assertEquals(players.indexOf(player2), 0);
        Assert.assertEquals(players.indexOf(player3), 1);
        Assert.assertEquals(players.indexOf(player4), 2);
        player3.placeBet(1000000, potList);
        players = pokerTournament.checkForBrokePlayers(players);
        Assert.assertEquals(players.indexOf(player1), -1);
        Assert.assertEquals(players.indexOf(player2), 0);
        Assert.assertEquals(players.indexOf(player3), -1);
        Assert.assertEquals(players.indexOf(player4), 1);
    }

}
