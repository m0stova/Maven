import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseTest {

    @Test
    public void numberOfDifferentTransformations() {

        Morse morse = new Morse();
        String[] words = {"gin", "zen", "gig", "msg"};
        int original = Morse.numberOfDifferentTransformations(words);
        int expected = 2;
        assertEquals(original, expected);

    }
}
