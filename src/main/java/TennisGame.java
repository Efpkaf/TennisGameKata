public class TennisGame {

    private Player p1;
    private Player p2;

    private TennisGame() {
    }

    public static TennisGame newGame() {
        return new TennisGame();
    }

    public String getScore() {

        if (getPlayerTwo().score >= PointType.values().length && getPlayerOne().score >= PointType.values().length) {
            return "deuce";
        }
        if (getPlayerTwo().score() - getPlayerOne().score() >= 2) {
            return "P2 won";
        } else if (getPlayerTwo().score() - getPlayerOne().score() <= -2) {
            return "P1 won";
        } else if (getPlayerTwo().score().equals(PointType.ADVANTAGE.ordinal())) {
            return "P2 advantage";
        } else if (getPlayerOne().score().equals(PointType.ADVANTAGE.ordinal())) {
            return "P1 advantage";
        } else if (PointType.FORTY.getTranslated().equals(PointType.getByOrdinal(getPlayerOne().score())) && getPlayerTwo().score().equals(getPlayerOne().score())) {
            return "deuce";
        } else if (getPlayerTwo().score().equals(getPlayerOne().score())) {
            return PointType.getByOrdinal(getPlayerTwo().score()) + " all";
        }

        return PointType.getByOrdinal(getPlayerTwo().score()) + " - " + PointType.getByOrdinal(getPlayerTwo().score());
    }

    public Player getPlayerOne() {
        if (p1 == null) {
            p1 = new Player();
        }
        return p1;
    }

    public Player getPlayerTwo() {
        if (p2 == null) {
            p2 = new Player();
        }
        return p2;
    }


}
