
//6. Write a program that takes a character from the user as input and determines whether the
//character entered is a capital letter, a small case letter, a digit or a special symbol and display
//appropriately.
//Input: A
//Output: Capital letter
//----------------------------------
package com.stackroute.junitwork;

public class CharCheck {
    public static String checkChar(char ch) {
        String s = "";
        if (ch >= 65 && ch <= 90) {
            //checking for upper case charachters
            s = "Uppercase letter";
        } else if (ch >= 97 && ch <= 122) {
            //checking for lowercase charachters
            s = "Lowercase letter";
        } else if (ch >= 48 && ch <= 57) {
            //checking for digits
            //
            s = "digit";
        } else if ((ch > 0 && ch <= 47) || (ch >= 58 && ch <= 64) ||
                (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 127)) {
            //checking for special charachters
            s = "special character";
        }
        return s;
    }
}
