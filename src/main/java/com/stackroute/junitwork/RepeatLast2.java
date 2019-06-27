package com.stackroute.junitwork;

public class RepeatLast2 {

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
