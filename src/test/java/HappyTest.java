
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyTest {

    @Test
    public void happinessDeterminant() {

        Happy happyNumber = new Happy();
        boolean actual;
        int number = 19;
        boolean expected = true;
        actual = happyNumber.happinessDeterminant(number);
        assertEquals(expected, actual);
    }
}
