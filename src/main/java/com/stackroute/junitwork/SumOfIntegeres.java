//5. Write a program that reads an unspecified number of integer arguments using Scanner Class
//and adds them together. The program should display total of the given input number and should
//only consider integer value.The program should display an error message if there are any non
//integer values
//Input : 12 23 2 4
//Output : 41
//---------------------

package com.stackroute.junitwork;

public class SumOfIntegeres {

        public static int Adding(int array[])
        {
            int sum = 0;
            //calculating the sum
            for (int i = 0; i< array.length; i++){
                sum = sum + array[i];
            }
            return sum;
        }
}
