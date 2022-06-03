
import java.util.HashSet;
import java.util.Set;

public class Happy {

    public boolean happinessDeterminant(int n) {

        Set<Integer> uniqueSums = new HashSet<>();
        int sumOfTheSquares;
        int state;
        while (uniqueSums.add(n)) {
            sumOfTheSquares = 0;
            while (n > 0) {
                state = n % 10;
                sumOfTheSquares += state * state;
                n /= 10;
            }
            if (sumOfTheSquares == 1)
                return true;
            else
                n = sumOfTheSquares;

        }
        return false;
    }

}
