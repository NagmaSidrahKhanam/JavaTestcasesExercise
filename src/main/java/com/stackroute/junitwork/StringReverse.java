package com.stackroute.junitwork;

public class StringReverse {


        public static String  stringReverse(String str) {
            int l,i;
            String reverse = " ";
            for (i = str.length()-1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
            }
            return reverse;
        }


}
