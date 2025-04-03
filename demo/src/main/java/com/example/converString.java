package com.example;


public class converString {
    public static void main(String[] args) {
        String s = "the-string-me";
        StringBuilder conStr = new StringBuilder();
      /**
       * 1. set the target
       * 2.turn string to array
       * 3. loop through and find target
       * 4. del target and replace char /  to upper case it
       */
        
        String target = "-";
        String[] strArray = s.chars()
                            .mapToObj(c-> String.valueOf((char)c))
                            .toArray(String[]:: new);

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].contains(target)) {
                String tempString = strArray[i + 1];
                strArray[i + 1] = tempString.toUpperCase();  
            }
            conStr.append(strArray[i]);     
        }
        System.out.println(conStr);     
    }
}
