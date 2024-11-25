package com.factoriaf5.rps.services;

import com.factoriaf5.rps.application.Game;
import com.factoriaf5.rps.factory.SimpleGameFactory;

public class GameService {
    private final  SimpleGameFactory factory;

    public GameService(SimpleGameFactory factory) {
        this.factory = factory;
    }

    public String play(String player1Choice, String player2Choice) {
        Game player1 = factory.createElement(player1Choice);
        Game player2 = factory.createElement(player2Choice);

        if (player1.beats(player2)) {
            return "Player 1 wins! " + player1.getName() + " beats " + player2.getName();
        } else if (player2.beats(player1)) {
            return "Player 2 wins! " + player2.getName() + " beats " + player1.getName();
        } else {
            return "It's a tie! Both chose " + player1.getName();
        }
    }
}