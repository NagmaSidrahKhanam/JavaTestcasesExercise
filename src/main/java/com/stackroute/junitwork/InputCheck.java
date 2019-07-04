//2. Write a program which accepts an integer number as input from the user and perform the
//        following conditional checks:
//        a. Print Tom if number is odd and exists between 20 to 30
//        b. Print Jerry, if number is even and exists between 20 and 30


package com.stackroute.junitwork;

public class InputCheck {
    public static String check_odd_even(int num){


        if(num > 0){
            if(num%2 == 0){
                if((num>20) && (num<30)){

                    //return jerry if number lies between 20-30 and even
                    return("Jerry");
                }
                else{
                    return("Number is even but doesn't lie between 20-30");
                }
            }
            else {
                if((num>20) && (num<30)){
                    //return jerry if number lies between 20-30 and not even

                    return("Tom");
                }
                else{
                    return("Number is odd but doesn't lie between 20-30");
                }
            }
        }
        else
        {
            return("Please enter number greater than zero");
        }

    }
}
