public class Forward extends HockeyPlayer {

    private int goals;

    public Forward(String paName, int paAge, int paGoals) {
        super(paName, paAge);
        this.goals = paGoals;
        this.role = Role.FORWARD;
    }

    @Override
    void addScore() {
        this.goals++;
    }

}
