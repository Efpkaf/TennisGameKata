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
	public void shouldGiveInitialValues() {
		assertEquals("love - love", game.getScore());
	}

	@Test
	public void shouldIncreasePointsForPlayer1(){
		game.getPlayerOne().win();
		assertEquals(PointType.FIFTEEN.getTranslated(), game.getPlayerOne().score());
	}

	@Test
	public void shouldReceiveAllStringForTheSameScore(){
		assertEquals("all love", game.getScore());
	}

}
