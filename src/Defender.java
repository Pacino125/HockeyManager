public class Defender extends HockeyPlayer {
    private int hits;

    public Defender(String paName, int paAge, int paGoals) {
        super(paName, paAge);
        this.hits = paGoals;
        this.role = Role.DEFENDER;
    }

    @Override
    void addScore() {
        this.hits++;
    }
}
