package com.stackroute.junitwork;

public class LoopNumbers {
    public static String getpattern(int n) {
        int i, j;
        String s = "";
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                s = s + i;
            }

        }
        return s;
    }
}
