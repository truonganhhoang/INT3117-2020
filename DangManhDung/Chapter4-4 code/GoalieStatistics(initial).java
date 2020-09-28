///java///
public class Game {
    private final double minutesPlayed;
    private final int goalsAgainst;
    private final int shotsOnGoalAgainst;
    public Game(int goalsAgainst, int shotsOnGoalAgainst, double minutesPlayed) {
        this.goalsAgainst = goalsAgainst;
        this.shotsOnGoalAgainst = shotsOnGoalAgainst;
        this.minutesPlayed = minutesPlayed;
    }
    public int getGoalsAgainst() {
        return goalsAgainst;
    }
    public int getShotsOnGoalAgainst() {
        return shotsOnGoalAgainst;
    }
    public double getMinutesPlayed() {
        return minutesPlayed;
    }
}
public class Season {
    private final List<Game> games;
    public Season(List<Game> games) {
        this.games = new ArrayList<>(games);
    }
    public Season() {
        this.games = new ArrayList<>();
    }
    public void addGame(Game game) {
        games.add(game);
    }
    public void removeGame(Game game) {
        games.remove(game);
    }
    public List<Game> getGames() {
        return games;
    }
    public GoalieStatistics getGoalieStatistics() {
        return new GoalieStatistics(this);
    }
}
public class GoalieStatistics {
    private final Season season;
    public GoalieStatistics(Season season) {
        this.season = season;
    }
    public double getGoalsAgainstAverage() {
        if (season.getGames().isEmpty()) {
            return 0.0;
        }
        else {
            List<Game> games = season.getGames();
            int tga = 0;
            double mins = 0;
            for (Game game: games) {
                tga += game.getGoalsAgainst();
                mins += game.getMinutesPlayed();
            }
            return (tga / mins) * 60;
        }
    }
    public double getSavePercentage() {
        if (season.getGames().isEmpty()) {
            return 0.0;
        }
        else {
            List<Game> games = season.getGames();
            int g = 0;
            int tsoga = 0;
            for (Game game: games) {
                g += game.getGoalsAgainst();
                tsoga += game.getShotsOnGoalAgainst();
            }
            return ((double) tsoga - g) / tsoga;
        }
    }
}