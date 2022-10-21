public class Main {
    public static void main(String[] args) {
        HockeyManager hockeyManager = new HockeyManager();
        hockeyManager.AddNewDefender("BARTEK, Filip", 31, 120);
        hockeyManager.AddNewForward("BODKER, Martin", 24, 29);
        hockeyManager.AddNewGoalie("DONAGH, Cody", 26, 4);
        hockeyManager.AddNewGoalie("DRABBER, Michael", 21, 18);
        hockeyManager.AddNewGoalie("ERKAMPS, Macoy", 26, 8);
        hockeyManager.AddNewGoalie("HOLEŠINSKÝ, Adrián", 26, 4);
        hockeyManager.AddNewGoalie("HONZÍK, David", 29, 118);
        hockeyManager.PrintNameAndAgeOfTheYoungestGoalie();
    }
}