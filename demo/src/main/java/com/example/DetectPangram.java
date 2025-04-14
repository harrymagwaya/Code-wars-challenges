package com.example;

import java.util.regex.Pattern;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at
 * least once. For example, the sentence "The quick brown fox jumps over the
 * lazy dog" is a pangram, because it uses the letters A-Z at least once (case
 * is irrelevant).
 * 
 * Given a string, detect whether or not it is a pangram. Return True if it is,
 * False if not. Ignore numbers and punctuation.
 */

 //Algorithm
 /**
  * 1. turn string to array for easy looping
  * 2. set target / items to search for ie A-Z in this case should return boolean
  * set count to be equal to count of alphabet  = 26
  * 3. loop through sentense array trying to find target return true if target found
  * 4. return false f target not found 
  */
public class DetectPangram {
    // // public boolean check(String sentence){
         
    // }

    public static void main(String[] args) {
         String sentence = "The quick brown fox jumps over the lazy dog";
        String[] sentenceArray = sentence.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .toArray(String[]::new);
        boolean[] checkAlphabet = new boolean[26];
        sentence.toLowerCase();
        
        int count = 0;
        for (char i = 'a'; i <= 'z' ; i++) {
            if (sentence.contains(String.valueOf(i))) {
                count++;
        
            }
        }  
        System.out.println(count);
    }
}
