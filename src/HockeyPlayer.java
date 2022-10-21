public abstract class HockeyPlayer {

    private final String name;
    private int age;
    protected Role role;

    public HockeyPlayer(String paName, int paAge) {
        this.name = paName;
        this.age = paAge;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Role getRole() {
        return this.role;
    }

    public void addYear() {
        this.age++;
    }

    abstract void addScore();
}
