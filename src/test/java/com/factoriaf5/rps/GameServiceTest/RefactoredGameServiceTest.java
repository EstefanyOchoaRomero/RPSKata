package com.factoriaf5.rps.GameServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.factory.SimpleGameFactory;
import com.factoriaf5.rps.services.GameService;
class RefactoredGameServiceTest {

    private final SimpleGameFactory factory = new SimpleGameFactory();
    private final GameService service = new GameService(factory);

    @Test
    void testRockBeatsScissors() {
        String result = service.play("Rock", "Scissors");
        assertEquals("Player 1 wins! Rock beats Scissors", result);
    }

    @Test
    void testScissorsDecapitatesLizard() {
        String result = service.play("Scissors", "Lizard");
        assertEquals("Player 1 wins! Scissors beats Lizard", result);
    }

    @Test
    void testLizardPoisonsSpock() {
        String result = service.play("Lizard", "Spock");
        assertEquals("Player 1 wins! Lizard beats Spock", result);
    }

    @Test
    void testSpockSmashesScissors() {
        String result = service.play("Spock", "Scissors");
        assertEquals("Player 1 wins! Spock beats Scissors", result);
    }

    @Test
    void testPaperDisprovesSpock() {
        String result = service.play("Paper", "Spock");
        assertEquals("Player 1 wins! Paper beats Spock", result);
    }

    @Test
    void testTie() {
        String result = service.play("Lizard", "Lizard");
        assertEquals("It's a tie! Both chose Lizard", result);
    }
}