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
	public void shouldIncreasePointsForPlayer1(){
		game.getPlayerOne().win();
		assertEquals(PointType.FIFTEEN, game.getPlayerOne().score());
	}

	@Test
	public void shouldReceiveAllStringForTheSameScore(){
		assertEquals("love all", game.getScore());
	}

	@Test
	public void shouldGiveDeuceWhenEachPlayerHaveThreePoint(){
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();

		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();

		assertEquals("deuce", game.getScore());
	}

	@Test
	public void shouldGiveP2AdvantageWhenWinDeuce(){
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();

		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();

		assertEquals("P2 advantage", game.getScore());
	}

	@Test
	public void shouldGiveP1AdvantageWhenWinDeuce(){
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();

		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();

		assertEquals("P1 advantage", game.getScore());
	}

}
