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
  * 2. set target / items to search for ie A-Z 
  * set count to be equal to count of alphabet  = 26
  * 3. loop through sentense array trying to find target return true if target found then increase count
  * 4. return false if !count == 26  
  */
public class DetectPangram {
   
    public static void main(String[] args) {
        String sentence = "Cwm fjord bank glyphs vext quiz";
        boolean checkAlphabet = false;
        sentence.toLowerCase();
        
        int count = 0;
        for (char i = 'a'; i <= 'z' ; i++) {
            if (sentence.contains(String.valueOf(i))) {
                count++;
            }
        }
        if (count == 26) {
            checkAlphabet = true;
        }
        System.out.println(checkAlphabet);
    }
}
