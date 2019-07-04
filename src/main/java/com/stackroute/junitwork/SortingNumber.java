//7. Write a program which accepts a number as input from user and perform the following:
//a. sort the number in non-increasing order
//b. after sorting sum all the even numbers, the sum should be greater than 15 .
//c. if sum is more than 15,then print output as true or false.
//Input : 234534
//Output : Sorted number in non-increasing order : 544332
//Sum of even numbers : 10
//False
//------------------------------
package com.stackroute.junitwork;

public class SortingNumber {
    public static String sortingList(int[] array) {
        int i, j, swap;
        int sum = 0;
        String s;
        int n = array.length;
        //sorting sum all the even numbers
        for (i = 0; i < n - 1; i++) {
            for (j = i; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                } else if (array[j] == array[j + 1])
                {
                    array[j] = array[j];
                    array[j + 1] = array[j + 1];
                }

            }
        }

        s = "sorted list of elements";
        for (i = n - 1; i >= 0; i--)
            System.out.println(array[i]);
        System.out.println();
        for (i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        s = "sum of the even numbers is" + sum;
        if (sum > 15) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return s;
    }

}
