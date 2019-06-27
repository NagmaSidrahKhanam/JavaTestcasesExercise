package com.stackroute.junitwork;

public class CharCheck {
    public static String checkChar(char ch) {
        String s = "";
        if (ch >= 65 && ch <= 90) {
            s = "Uppercase letter";
        } else if (ch >= 97 && ch <= 122) {
            s = "Lowercase letter";
        } else if (ch >= 48 && ch <= 57) {
            s = "digit";
        } else if ((ch > 0 && ch <= 47) || (ch >= 58 && ch <= 64) ||
                (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 127)) {
            s = "special character";
        }
        return s;
    }
}
