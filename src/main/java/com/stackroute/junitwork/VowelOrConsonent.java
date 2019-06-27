package com.stackroute.junitwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelOrConsonent {


    public static String count_Vowels(String str)
    {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*"); //regex pattern to check if string has any special character or not
        Matcher matcher = pattern.matcher(str);
        var check= str.matches(".*\\d.*"); //regex pattern to check if string has any digit or not

        if(check == true){

            return("Error number: Please enter only alphabets"); //error message

        }else if(!matcher.matches()){
           return("Error special character: Please enter only alphabets"); //error message

        }else{
            String s=" ";
            for(int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                {
                    s =s+" vowel ";
                }
                else
                {
                    s = s +" consonent ";
                }
            }
//            String res = count_Vowels(str); // calling method to check vowel and consonant
            return(" Result is: " + s+"\n");
        }


    }
}
