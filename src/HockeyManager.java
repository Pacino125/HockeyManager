import java.util.ArrayList;

public class HockeyManager {

    private final ArrayList<HockeyPlayer> players;

    public HockeyManager() {
        this.players = new ArrayList<>();
    }

    public void AddNewForward(String name, int age, int goals) {
        players.add(new Forward(name, age, goals));
    }

    public void AddNewDefender(String name, int age, int hits) {
        players.add(new Defender(name, age, hits));
    }

    public void AddNewGoalie(String name, int age, int wins) {
        players.add(new Goalie(name, age, wins));
    }

    public void PrintNameAndAgeOfTheYoungestGoalie() {
        HockeyPlayer youngest = null;
        for (HockeyPlayer player: this.players) {
            if (player.getRole() == Role.GOALIE) {
                if (youngest == null) {
                    youngest = player;
                }
                if (player.getAge() < youngest.getAge()) {
                    youngest = player;
                }
            }
        }
        if (youngest == null) {
            System.out.println("There is no goalie in the system!");
            return;
        }
        System.out.println("Name: " + youngest.getName() + "\nAge: " + youngest.getAge());
    }
}
