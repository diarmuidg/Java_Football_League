import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeagueTest {
    @Test
    @DisplayName("testLeagueOne")
    void testLeagueOne() {
        // Create the two teams
        League leagueOne = new League();
        Team teamOne = new Team("TeamOneName", "TeamOneLocation");
        Team teamTwo = new Team("TeamTwoName", "TeamTwoLocation");
        Team teamThree = new Team("TeamThreeName", "TeamThreeLocation");
        Team teamFour = new Team("TeamFourName", "TeamFourLocation");

        leagueOne.addTeam(teamOne);
        leagueOne.addTeam(teamTwo);
        leagueOne.addTeam(teamThree);
        leagueOne.addTeam(teamFour);

        // Check that the league does indeed contain four teams
        assertEquals(4, leagueOne.teams.size());

        // Add a home win
        Score scoreOne = new Score(1, 0);
        Game gameOne = new Game(teamOne, teamTwo, scoreOne);
        leagueOne.addGame(gameOne);

        assertEquals("""
                TeamOneName from TeamOneLocation currently has 3 points.
                TeamTwoName from TeamTwoLocation currently has 0 points.
                TeamThreeName from TeamThreeLocation currently has 0 points.
                TeamFourName from TeamFourLocation currently has 0 points.
                """, leagueOne.toString());

        // Add a draw
        Score scoreTwo = new Score(1, 1);
        Game gameTwo = new Game(teamThree, teamFour, scoreTwo);
        leagueOne.addGame(gameTwo);

        assertEquals("""
                TeamOneName from TeamOneLocation currently has 3 points.
                TeamTwoName from TeamTwoLocation currently has 0 points.
                TeamThreeName from TeamThreeLocation currently has 1 point.
                TeamFourName from TeamFourLocation currently has 1 point.
                """, leagueOne.toString());

    }
}