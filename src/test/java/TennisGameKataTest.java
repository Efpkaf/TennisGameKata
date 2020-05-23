import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisGameKataTest {

	private TennisGame game;

	@BeforeEach
	public void init() {
		game = TennisGame.newGame();
	}

	@Test
	public void shouldGive15WhenFirstPlayerWinFirstPoint() {
		assertEquals("15 - love", game.getScore());
	}
}
