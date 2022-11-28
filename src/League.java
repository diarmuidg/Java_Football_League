import java.util.ArrayList;
import java.util.Collections;

public class League {
    ArrayList<Team> teams = new ArrayList<>();

    public League() {
    }

    public void addGame(Game game){
        // Add the result to both home and away teams
        int homeTeamIndex = teams.indexOf(game.getHomeTeam());
        int awayTeamIndex = teams.indexOf(game.getAwayTeam());

        //Check first that both teams are in the league
        if (homeTeamIndex == -1)
            throw new IllegalArgumentException(game.getHomeTeam().getName() + " is not in this league.");
        if (awayTeamIndex == -1)
            throw new IllegalArgumentException(game.getAwayTeam().getName() + " is not in this league.");

        Team homeTeam = teams.get(homeTeamIndex);
        Team awayTeam = teams.get(awayTeamIndex);

        if (game.getGameScore().getHomeScore() > game.getGameScore().getAwayScore())
            homeTeam.addWin();
        else if (game.getGameScore().getHomeScore() < game.getGameScore().getAwayScore())
            awayTeam.addWin();
        else {
            homeTeam.addDraw();
            awayTeam.addDraw();
        }
    }

    public void addTeam(Team team){
        if (team == null)
            throw new IllegalArgumentException("Team object is null");

        if (teams.contains(team))
            throw new IllegalArgumentException("Team already exists in the league");

        teams.add(team);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Team team : teams) {
            output.append(team.toString()).append("\n");
        }

        return output.toString();
    }

    public String orderedToString() {
        Collections.sort(teams);

        StringBuilder output = new StringBuilder();
        for (Team team : teams) {
            output.append(team.toString()).append("\n");
        }

        return output.toString();
    }
}
