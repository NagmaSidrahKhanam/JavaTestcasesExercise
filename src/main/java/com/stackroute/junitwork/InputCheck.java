package com.stackroute.junitwork;

public class InputCheck {
    public static String check_odd_even(int num){


        if(num > 0){
            if(num%2 == 0){
                if((num>20) && (num<30)){
                    return("Jerry");
                }
                else{
                    return("Number is even but doesn't lie between 20-30");
                }
            }
            else {
                if((num>20) && (num<30)){
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
