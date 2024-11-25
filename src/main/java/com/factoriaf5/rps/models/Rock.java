package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Game;


public class Rock implements Game {
    @Override
    public String getName() {
        return "Rock";
    }

    @Override
    public boolean beats(Game other) {
        
        return "Lizard".equalsIgnoreCase(other.getName()) ||
            "Scissors".equalsIgnoreCase(other.getName());
    }
}
