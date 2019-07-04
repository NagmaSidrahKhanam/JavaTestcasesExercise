//9. Write a program to reverse any string without using String Buffer.
//Input : london
//Output : nodnol
package com.stackroute.junitwork;

public class StringReverse {


        public static String  stringReverse(String str) {
            int l,i;
            String reverse = " ";
            //reverse the string
            for (i = str.length()-1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
            }
            return reverse;
        }


}
