package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Game;

public class Lizard implements Game {
    @Override
    public String getName() {
        return "Lizard";
    }
    
    @Override
    public boolean beats(Game other) {

        return "Spock".equalsIgnoreCase(other.getName()) ||
            "Paper".equalsIgnoreCase(other.getName());
    }
}