
import java.util.HashSet;

public class Morse {

    public static int numberOfDifferentTransformations(String[] words) {


        String [] morseAlphabet = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> uniqueMorse = new HashSet<>();
        StringBuilder morse;
        int indexOfElements;

        for (String word : words) {
            morse = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                indexOfElements = ((int) word.charAt(j)) - 97;
                morse.append(morseAlphabet[indexOfElements]);
            }
            uniqueMorse.add(morse.toString());
        }

        return uniqueMorse.size();

    }


}
