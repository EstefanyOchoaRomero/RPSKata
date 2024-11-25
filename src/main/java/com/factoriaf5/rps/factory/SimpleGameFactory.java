package com.factoriaf5.rps.factory;

import com.factoriaf5.rps.application.Game;
import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class SimpleGameFactory  {

    public Game createElement(String elementName) {
    switch (elementName.toLowerCase()) {
        case "rock" -> {
            return new Rock();
            }
        case "paper" -> {
            return new Paper();
            }
        case "scissors" -> {
            return new Scissors();
            }
        case "lizard" -> {
            return new Lizard();
            }
        case "spock" -> {
            return new Spock();
            }
        default -> throw new IllegalArgumentException("Unknown element: " + elementName);
    }
}
}