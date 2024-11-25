package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Game;

public class Spock implements Game {
    @Override
    public String getName() {
        return "Spock";
    }

    @Override
    public boolean beats(Game other) {
        
        return "Scissors".equalsIgnoreCase(other.getName()) ||
            "Rock".equalsIgnoreCase(other.getName());
    }
}
