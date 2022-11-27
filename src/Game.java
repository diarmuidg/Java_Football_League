public class Game {
    private final Team homeTeam;
    private final Team awayTeam;
    private final Score gameScore;


    public Game(Team homeTeam, Team awayTeam, Score gameScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.gameScore = gameScore;
    }

    @Override
    public String toString() {
        String resultText;
        if (gameScore.getHomeScore() == gameScore.getAwayScore())
            resultText = "Result: Draw";
        else {
            String winnerName = gameScore.getHomeScore() > gameScore.getAwayScore() ? homeTeam.getName() : awayTeam.getName();
            resultText = "Result: Team <" + winnerName + "> Won;";
        }
        return "<" + homeTeam.getName() + "> " + gameScore.getHomeScore() + " - " +
                "<" + awayTeam.getName() + "> " + gameScore.getAwayScore() + "; " +
                resultText;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Score getGameScore() {
        return gameScore;
    }
}
