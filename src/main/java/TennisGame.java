public class TennisGame {

	private Player p1;
	private Player p2;

	private TennisGame(){
	}

	public static TennisGame newGame() {
		return new TennisGame();
	}

	public String getScore() {

		if(PointType.FORTY.equals(getPlayerOne().score()) && getPlayerTwo().score().equals(getPlayerOne().score())) {
			return "deuce";
		} else if(getPlayerTwo().score().equals(getPlayerOne().score())) {
			return getPlayerTwo().score().getTranslated() + " all";
		}

 		return getPlayerOne().score().getTranslated() + " - " + getPlayerTwo().score().getTranslated();
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
