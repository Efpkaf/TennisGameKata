public class Player {
    int score;
    String name;

    public Player(String name) {
        this.name = name;
    }

    public Integer score(){
        return score;
    }

    public void win(){
        score ++;
    }
}
