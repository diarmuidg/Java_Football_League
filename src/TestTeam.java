import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTeam {

    @Test
    @DisplayName("Test getName")
    void testName() {
        Team team1 = new Team("TeamOneName", "TeamOneLocation");
        assertEquals("TeamOneName", team1.getName());
    }

    @Test
    @DisplayName("Test team location")
    void testLocation() {
        Team team1 = new Team("TeamOneName", "TeamOneLocation");
        assertEquals("TeamOneLocation", team1.getLocation());
    }

    @Test
    @DisplayName("Test toString")
    void testToString() {
        Team team1 = new Team("TeamOneName", "TeamOneLocation");
        assertEquals("TeamOneName from TeamOneLocation currently has 0 points.",
                team1.toString());
        team1.addDraw();
        assertEquals("TeamOneName from TeamOneLocation currently has 1 point.",
                team1.toString());
        team1.addWin();
        assertEquals("TeamOneName from TeamOneLocation currently has 4 points.",
                team1.toString());
    }

    @Test
    @DisplayName("Test addWin")
    void testAddWin() {
        Team team1 = new Team("TeamOneName", "TeamOneLocation");
        assertEquals(0, team1.getPoints());
        team1.addWin();
        assertEquals(3, team1.getPoints());
    }

    @Test
    @DisplayName("Test addDraw")
    void testAddDraw() {
        Team team1 = new Team("TeamOneName", "TeamOneLocation");
        assertEquals(0, team1.getPoints());
        team1.addDraw();
        assertEquals(1, team1.getPoints());
    }
}