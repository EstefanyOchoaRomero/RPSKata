package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Game;

public class Paper implements Game {
    @Override
    public String getName() {
        return "Paper";
    }

    @Override
    public boolean beats(Game other) {
    
        return "Rock".equalsIgnoreCase(other.getName()) ||
            "Spock".equalsIgnoreCase(other.getName());
    }
}