package com.stackroute.junitwork;

import org.junit.*;
//import static org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    Palindrome obj=new Palindrome();

    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
        obj= new Palindrome();
    }

    @After
    public void tearDown(){
        System.out.println("After");
        obj=null;
    }

    @BeforeClass
    public static void tearDownAfterClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void setUPBeforeClass(){
        System.out.println("Afterclass");
    }

    @Test
    public void givenNumerShouldReturnPalindromeIfSumOfEvenNumbersLessThan25(){
        //act
        String result=obj.checkpallindrome(1001);
        //assert
        assertEquals("1001 is pallindrome and sum of even numbers is less than 25",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }

    public void givenNumerShouldReturnPalindromeIfSumOfEvenNumbersGreaterThan25(){
        //act
        String result=obj.checkpallindrome(1001);
        //assert
        assertEquals("1001 is pallindrome and sum of even numbers is greater than 25",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }
    public void givenNumberIsNotPalindrome(){
        //act
        String result=obj.checkpallindrome(1001);
        //assert
        assertEquals("1001 is not pallindrome",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }




    public void givenNumerMustReturnPalindromeIfSumOfEvenNumbersLessThan25(){
        //act
        String result=obj.checkpallindrome(1222);
        //assert
        assertEquals("1001 is not pallindrome and sum of even numbers is less than 25",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }

    public void givenNumerMustReturnPalindromeIfSumOfEvenNumbersGreaterThan25(){
        //act
        String result=obj.checkpallindrome(1222);
        //assert
        assertEquals("1222 is not pallindrome and sum of even numbers is greater than 25",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }
    public void givenNumberrIsNotPalindrome(){
        //act
        String result=obj.checkpallindrome(1222);
        //assert
        assertEquals("1222 is not pallindrome",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }

    public void givenNumerMustbeReturnPalindromeIfSumOfEvenNumbersLessThan25(){
        //act
        String result=obj.checkpallindrome(3773);
        //assert
        assertEquals("3773 is not pallindrome and sum of even numbers is less than 25",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }

    public void givenNumerMustbeReturnPalindromeIfSumOfEvenNumbersGreaterThan25(){
        //act
        String result=obj.checkpallindrome(3773);
        //assert
        assertEquals("3773 is not pallindrome and sum of even numbers is greater than 25",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }
    public void givenNumbersIsNotPalindrome(){
        //act
        String result=obj.checkpallindrome(3773);
        //assert
        assertEquals("3773 is not pallindrome",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }

}