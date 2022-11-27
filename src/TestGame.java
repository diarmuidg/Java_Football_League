import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestGame {
    @Test
    @DisplayName("testHomeWin")
    void testToString() {
        // Create the two teams
        Team teamOne = new Team("TeamOneName", "TeamOneLocation");
        Team teamTwo = new Team("TeamTwoName", "TeamTwoLocation");
        Score testScore = new Score(1, 0);

        Game gameOne = new Game(teamOne, teamTwo, testScore);
        assertEquals("<TeamOneName> 1 - <TeamTwoName> 0; Result: Team <TeamOneName> Won;", gameOne.toString());
    }

    @Test
    @DisplayName("testAwayWin")
    void testAwayWin() {
        // Create the two teams
        Team teamOne = new Team("TeamOneName", "TeamOneLocation");
        Team teamTwo = new Team("TeamTwoName", "TeamTwoLocation");
        Score testScore = new Score(0, 1);

        Game gameOne = new Game(teamOne, teamTwo, testScore);
        assertEquals("<TeamOneName> 0 - <TeamTwoName> 1; Result: Team <TeamTwoName> Won;",
                gameOne.toString());
    }

    @Test
    @DisplayName("testDraw")
    void testDraw() {
        // Create the two teams
        Team teamOne = new Team("TeamOneName", "TeamOneLocation");
        Team teamTwo = new Team("TeamTwoName", "TeamTwoLocation");
        Score testScore = new Score(0, 0);

        Game gameOne = new Game(teamOne, teamTwo, testScore);
        assertEquals("<TeamOneName> 0 - <TeamTwoName> 0; Result: Draw", gameOne.toString());
    }

}