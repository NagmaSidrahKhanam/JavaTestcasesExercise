//8. Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
//100) User should guess until the the target number is guessed correctly.
//Print separate messages for the following:
//a. Number guessed is more than original number
//b. Number guessed is less than original number
//c. Number guessed matches the original number
//-----------------------------------------------------------------------
package com.stackroute.junitwork;

import java.util.Random;

public class LimitCheck {
    public static String matchnumbers(int n) {
            int m = 51;

            String s = " ";
            if (n == m) {
                //checking the number is equal to original number
                s = "Number guessed matches the original number";
            } else if (n > m) {
                //checking the number is greater than original number

                s = "Number is greater than the original number";

            } else if (n < m) {
                //checking the number is less than original number

                s = "Number is smaller than the original number";

            }
            return s;
        }
}
