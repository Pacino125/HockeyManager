public class Goalie extends HockeyPlayer {

    private int wins;

    public Goalie(String paName, int paAge, int paGoals) {
        super(paName, paAge);
        this.wins = paGoals;
        this.role = Role.GOALIE;
    }

    @Override
    void addScore() {
        this.wins++;
    }
}
