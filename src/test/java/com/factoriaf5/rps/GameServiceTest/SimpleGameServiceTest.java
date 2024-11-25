package com.factoriaf5.rps.GameServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.factory.SimpleGameFactory;
import com.factoriaf5.rps.services.GameService;

class SimpleGameServiceTest {

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
    void testPaperBeatsRock() {
        String result = service.play("Paper", "Rock");
        assertEquals("Player 1 wins! Paper beats Rock", result);
    }

    @Test
    void testTie() {
        String result = service.play("Rock", "Rock");
        assertEquals("It's a tie! Both chose Rock", result);
    }
}
