/* 
 * Function reads a sequence of words from standard input 
 * Prints one of the words uniformly at random
 * Use Knuth's method: When reading the ith word, 
 * select with 1/i probability to be the champion
 * and replace the previous champion. 
 * 
 * After reading all the words, print the surviving champion. 
*/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String result = "";

        for (int i = 0; !StdIn.isEmpty() ; i++) {
            String value = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / i)) {
                result = value;
            }
        }

        StdOut.println(result);
    }
}
