public class TennisGame {

    private Player p1;
    private Player p2;

    private TennisGame() {
    }

    public static TennisGame newGame() {
        return new TennisGame();
    }

    public String getScore() {

//		 int ordinal = pointType.ordinal();
//		 pointType = PointType.values()[score + 1];

		 if (getPlayerTwo().score() - getPlayerOne().score() >= 2) {
			 return p2.name + " won";
		 } else if (getPlayerTwo().score() - getPlayerOne().score() <= -2) {
			 return p1.name + " won";
		 } else if (getPlayerTwo().score().equals(PointType.ADVANTAGE.ordinal())) {
			 return p2.name + " advantage";
		 } else if (getPlayerOne().score().equals(PointType.ADVANTAGE.ordinal())) {
			 return p1.name + " advantage";
		 } else if (getPlayerOne().score().equals(PointType.FORTY.ordinal()) && getPlayerTwo().score().equals(getPlayerOne().score())) {
			 return "deuce";
		 } else if (getPlayerTwo().score().equals(getPlayerOne().score())) {
			 return PointType.getByOrdinal(getPlayerTwo().score()) + " all";
		 }

        return PointType.getByOrdinal(getPlayerTwo().score()) + " - " + PointType.getByOrdinal(getPlayerTwo().score());
    }

	public void setPlayerOne(String name) {
		p1 = new Player(name);
	}

	public void setPlayerTwo(String name) {
		p2 = new Player(name);
	}

	public Player getPlayerOne() {
		return p1;
	}

	public Player getPlayerTwo() {
		return p2;
	}

}
