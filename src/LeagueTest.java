import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeagueTest {
    @Test
    @DisplayName("testLeagueOne")
    void testLeagueOne() {
        // Create the teams
        League leagueOne = new League();
        Team teamA = new Team("Team A", "TeamALocation");
        Team teamB = new Team("Team B", "TeamBLocation");
        Team teamC = new Team("Team C", "TeamCLocation");
        Team teamD = new Team("Team D", "TeamDLocation");

        leagueOne.addTeam(teamA);
        leagueOne.addTeam(teamB);
        leagueOne.addTeam(teamC);
        leagueOne.addTeam(teamD);

        // Check that the league does indeed contain four teams
        assertEquals(4, leagueOne.teams.size());

        // Add a home win
        Score scoreOne = new Score(1, 0);
        Game gameOne = new Game(teamA, teamB, scoreOne);
        leagueOne.addGame(gameOne);

        assertEquals("""
                Team A from TeamALocation currently has 3 points.
                Team B from TeamBLocation currently has 0 points.
                Team C from TeamCLocation currently has 0 points.
                Team D from TeamDLocation currently has 0 points.
                """, leagueOne.toString());

        // Add a draw
        Score scoreTwo = new Score(1, 1);
        Game gameTwo = new Game(teamC, teamD, scoreTwo);
        leagueOne.addGame(gameTwo);

        assertEquals("""
                Team A from TeamALocation currently has 3 points.
                Team B from TeamBLocation currently has 0 points.
                Team C from TeamCLocation currently has 1 point.
                Team D from TeamDLocation currently has 1 point.
                """, leagueOne.toString());

        assertEquals("""
                Team A from TeamALocation currently has 3 points.
                Team C from TeamCLocation currently has 1 point.
                Team D from TeamDLocation currently has 1 point.
                Team B from TeamBLocation currently has 0 points.
                """, leagueOne.orderedToString());

    }
}