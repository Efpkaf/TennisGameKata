public class TennisGame {

    private Player p1;
    private Player p2;

    private TennisGame() {
    }

    public static TennisGame newGame() {
        return new TennisGame();
    }

    public String getScore() {

        if (p1.score == p2.score && p2.score > 3) {
            return "deuce";
        } else if (p2.score() - p1.score() >= 2) {
            return p2.name + " won";
        } else if (p2.score() - p1.score() <= -2) {
            return p1.name + " won";
        } else if (p2.score().equals(PointType.ADVANTAGE.ordinal())) {
            return p2.name + " advantage";
        } else if (p1.score().equals(PointType.ADVANTAGE.ordinal())) {
            return p1.name + " advantage";
        } else if (p1.score().equals(PointType.FORTY.ordinal()) && p2.score().equals(p1.score())) {
            return "deuce";
        } else if (p2.score().equals(p1.score())) {
            return PointType.getByOrdinal(p2.score()) + " all";
        } else if(!p2.score().equals(p1.score()) && p2.score > 4) {
        	   return "advantage";
		  }

        return PointType.getByOrdinal(p2.score()) + " - " + PointType.getByOrdinal(p2.score());
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
