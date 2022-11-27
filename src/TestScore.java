import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestScore {

    @Test
    @DisplayName("getHomeScore")
    void getHomeScore() {
        Score testScore = new Score(0, 1);
        assertEquals(0, testScore.getHomeScore());
    }

    @Test
    @DisplayName("getAwayScore")
    void getAwayScore() {
        Score testScore = new Score(0, 1);
        assertEquals(1, testScore.getAwayScore());
    }

}