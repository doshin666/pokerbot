package com.pokerbot.core;

import java.util.ArrayList;

public class PokerTournament {
    ArrayList<Player> players = new ArrayList<Player>();
    int indexOfButton;

    public void addNewPlayer(Player player) {
        players.add(player);

    }

    public void playGame(){
        while (players.size() > 1){
            Hand hand = new Hand();
            players = hand.playHand(players, indexOfButton);
            players = checkForBrokePlayers(players);
        }
    }

    public ArrayList<Player> checkForBrokePlayers(ArrayList<Player> players) {
        for (int i = 0; i < players.size(); i++) {
            if(players.get(i).getChipBalance() == 0){
                players.remove(i);
            }
        }
        return players;
    }



}
