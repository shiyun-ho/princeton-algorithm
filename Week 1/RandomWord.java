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
        //initialise idx to be 0
        int idx = 0; 
        String championWord = ""; 

        //while input has next token
        while (!StdIn.isEmpty()){
            //inputWord is next token from standard input and returns as a String.
            //inputWord is now the second token (i.e. next token)
            String inputWord = StdIn.readString(); 
            
            //increase index
            //increase index again
            idx++;

            //if probability of 1.00 / 1
            //second word: if probability is 1.00 / 2
            if (StdRandom.bernoulli(1.0 / (idx))){
                //printed championWord is the word
                //printed championWord is the second word
                championWord = inputWord; 
            }

        }
        StdOut.println(championWord);
    }
}
