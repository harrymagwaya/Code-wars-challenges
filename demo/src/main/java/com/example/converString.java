package com.example;

public class converString {
    public static void main(String[] args) {
        String s = "the-string";
        StringBuilder conStr = new StringBuilder(s);

        // seearch for char -
        // get indx for char
        // swap elem infront of id char
        //  rebuild string
        
        String target = "-";
        String[] strArray = s.chars()
                            .mapToObj(c-> String.valueOf((char)c))
                            .toArray(String[]:: new);
        for (int i = 0; i < strArray.length; i++) {
            // boolean heck = strArray[i].contains(target);
            // System.out.println(heck);
            conStr.append(strArray[i])
            if (strArray[i].contains(target)) {
                String temp = strArray[i];
                strArray[i] = "P";
                conStr.append(strArray[i]);
                System.out.println(strArray[i]);
            }
            
        }
       // System.out.println(conStr);
        
  
    }
}
