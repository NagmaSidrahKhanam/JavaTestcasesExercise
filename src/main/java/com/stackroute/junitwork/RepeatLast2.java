//10. Write a program for the following condition:
//Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
//repeat n number of times in the output String.
//Input1: Stackroute
//Input2: 5
//Output1:
//Stackrouterouterouterouterouteroute
//Input1: Stackroute
//Input2: 2
//Output1:
//Stackroutetete

package com.stackroute.junitwork;

public class RepeatLast2 {
//repeat the alphabetes
    public static String Repeat_Last2alphabets(String str, int n) {
        int len = str.length();
        String s=str;
        int j =len-n;
        for (int k=0;k<n;k++){
            for (int i = j ; i<len; i++){
                s=s+str.charAt(i);
            }
        }
        return s;
    }

}
