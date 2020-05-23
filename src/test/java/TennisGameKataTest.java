import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisGameKataTest {

	private TennisGame game;

	@BeforeEach
	public void init() {
		game = TennisGame.newGame();
		game.setPlayerOne("Wojsa");
		game.setPlayerTwo("Adamczyk");
	}

	@Test
	public void shouldIncreasePointsForPlayer1(){
		game.getPlayerOne().win();
		assertEquals(PointType.FIFTEEN.ordinal(), game.getPlayerOne().score().intValue());
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
	public void shouldGiveAdamczykAdvantageWhenWinDeuce(){
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();

		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();

		assertEquals("Adamczyk advantage", game.getScore());
	}

	@Test
	public void shouldGiveWojsaAdvantageWhenWinDeuce(){
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();

		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();

		assertEquals("Wojsa advantage", game.getScore());
	}

	@Test
	public void shouldPlayer1Win(){
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();

		assertEquals("Wojsa won", game.getScore());
	}

	@Test
	public void shouldPlayer2Win(){
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();

		assertEquals("Adamczyk won", game.getScore());
	}

	@Test
	public void shouldGiveFifteenAllStringForTheSameScore(){
		game.getPlayerTwo().win();

		game.getPlayerOne().win();

		assertEquals(PointType.FIFTEEN.getTranslated() +" all", game.getScore());
	}

	@Test
	public void shouldGiveThirtyAllStringForTheSameScore(){
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();

		game.getPlayerOne().win();
		game.getPlayerOne().win();

		assertEquals(PointType.THIRTY.getTranslated() + " all", game.getScore());
	}

	@Test
	public void shouldGiveDeuceWhenEachPlayerHaveFivePoint(){
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();

		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();

		assertEquals("deuce", game.getScore());
	}

	@Test
	public void shouldGiveAdvantageWhenEachPlayerHaveMoreThan5Points(){
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();

		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();

		assertEquals("advantage", game.getScore());
	}

	@Test
	public void shouldGiveWinP2WhenEachPlayerHaveMoreThan5Points(){
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();
		game.getPlayerOne().win();

		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();
		game.getPlayerTwo().win();

		assertEquals("Adamczyk won", game.getScore());
	}
}
