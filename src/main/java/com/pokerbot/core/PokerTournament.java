package com.pokerbot.core;

import java.util.ArrayList;

public class PokerTournament {
    ArrayList<Player> players = new ArrayList<Player>();
    int indexOfButton;

    public void addNewPlayer(Player player){
        players.add(player);
        while (players.size() > 1){
            Hand hand = new Hand();
            players = hand.playHand(players, indexOfButton);
        }
    }


}
