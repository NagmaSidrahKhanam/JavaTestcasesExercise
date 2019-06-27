package com.stackroute.junitwork;

import java.util.Random;

public class LimitCheck {
    public static String matchnumbers(int n) {
            int m = 51;
            String s = " ";
            if (n == m) {
                s = "Number guessed matches the original number";
            } else if (n > m) {
                s = "Number is greater than the original number";

            } else if (n < m) {
                s = "Number is smaller than the original number";

            }
            return s;
        }
}
