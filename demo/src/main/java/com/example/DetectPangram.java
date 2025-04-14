package com.example;

import java.util.ArrayList;


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
  * 1. set string to lower case
  * 2. set target / items to search for ie A-Z 
  * 3. set boolean to true incase finds target in loop
  * 3. loop through arr with results to see if all true return true
  * 4. if finds false then return false  
  */
public class DetectPangram {
   
    public static void main(String[] args) {
        String sentence = "Cwm fjord bank glyphs vext quiz";
        ArrayList<Boolean> checkAlphabet = new ArrayList<>();
        sentence.toLowerCase();
        boolean allTrue = false;
        int countTrueValues = 0;
    
        for (char i = 'a'; i <= 'z' ; i++) {
            if (sentence.contains(String.valueOf(i))) {
                checkAlphabet.add(true);
                countTrueValues++;
            }else {
                checkAlphabet.add(false);
            }
        }

        for (Boolean boolean1 : checkAlphabet) {
            //System.out.println(boolean1);
            if (countTrueValues > 25) {
                allTrue = true;
            }
        }
        System.out.println(countTrueValues);
        System.out.println(allTrue);
    }
}
