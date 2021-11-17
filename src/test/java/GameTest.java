import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {


    @Test
    void isFailedCase1() {
        SpeedyGame speedyGame = new SpeedyGame(false, 2);

        boolean actual = speedyGame.isFailed(8);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isFailedCase2() {
        SpeedyGame speedyGame = new SpeedyGame(false, 6);

        boolean actual = speedyGame.isFailed(4);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isFailedCase3() {
        SpeedyGame speedyGame = new SpeedyGame(false, 6);

        boolean actual = speedyGame.isFailed(-5);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isFailedCase4() {
        SpeedyGame speedyGame = new SpeedyGame(true, 4);

        boolean actual = speedyGame.isFailed(0);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isFailedCase5() {
        SpeedyGame speedyGame = new SpeedyGame(true, 4);

        boolean actual = speedyGame.isFailed(8);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
}