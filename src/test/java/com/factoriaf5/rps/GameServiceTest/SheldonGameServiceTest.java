package com.factoriaf5.rps.GameServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.factory.SimpleGameFactory;
import com.factoriaf5.rps.services.GameService;

class SheldonGameServiceTest {

    private final SimpleGameFactory factory = new SimpleGameFactory();
    private final GameService service = new GameService(factory);

    @Test
    void testRockBeatsScissors() {
        String result = service.play("Rock", "Scissors");
        assertEquals("Player 1 wins! Rock beats Scissors", result);
    }

    @Test
    void testScissorsBeatsPaper() {
        String result = service.play("Scissors", "Paper");
        assertEquals("Player 1 wins! Scissors beats Paper", result);
    }

    @Test
    void testLizardEatsPaper() {
        String result = service.play("Lizard", "Paper");
        assertEquals("Player 1 wins! Lizard beats Paper", result);
    }

    @Test
    void testSpockVaporizesRock() {
        String result = service.play("Spock", "Rock");
        assertEquals("Player 1 wins! Spock beats Rock", result);
    }

    @Test
    void testLizardPoisonsSpock() {
        String result = service.play("Lizard", "Spock");
        assertEquals("Player 1 wins! Lizard beats Spock", result);
    }

    @Test
    void testTie() {
        String result = service.play("Spock", "Spock");
        assertEquals("It's a tie! Both chose Spock", result);
    }
}