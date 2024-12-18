package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Game;

public class Scissors implements Game {
    @Override
    public String getName() {
        return "Scissors";
    }

    @Override
    public boolean beats(Game other) {
        
        return "Paper".equalsIgnoreCase(other.getName()) ||
            "Lizard".equalsIgnoreCase(other.getName());
    }
}
