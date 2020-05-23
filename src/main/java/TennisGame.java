public class TennisGame {

	private Player p1;
	private Player p2;

	private TennisGame(){
	}

	public static TennisGame newGame() {
		return new TennisGame();
	}

	public String getScore() {
 		return getPlayerOne().score() + " - " + getPlayerTwo().score();
	}

	public Player getPlayerOne(){
		if(p1 == null) {
			p1 = new Player();
		}
		return p1;
	}

	public Player getPlayerTwo(){
		if(p2 == null) {
			p2 = new Player();
		}
		return p2;
	}


}
