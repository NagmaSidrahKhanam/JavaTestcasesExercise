//4. Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
//        6 6 . . . nth iteration.
//        Input: 5
//        Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5

package com.stackroute.junitwork;

public class LoopNumbers {
    public static String getpattern(int n) {
        int i, j;
        String s = "";
        //repetition of numbers based on the input
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                s = s + i;
            }

        }
        return s;
    }
}
