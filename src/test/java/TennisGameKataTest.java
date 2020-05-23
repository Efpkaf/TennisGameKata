import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisGameKataTest {

<<<<<<< HEAD
	private TennisGame game;

	@BeforeEach
	public void init() {
		game = TennisGame.newGame();
	}

	@Test
	public void shouldGive15WhenFirstPlayerWinFirstPoint() {
		assertEquals("15 - love", game.getScore());
	}

=======

    
>>>>>>> 1b36d86cdd6a2009e5958fb962ce52278cd69fdd
}
