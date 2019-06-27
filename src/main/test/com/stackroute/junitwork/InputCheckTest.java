package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class InputCheckTest {
InputCheck obj=new InputCheck();
    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
        obj= new InputCheck();
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
    public void numberisoddandtliebetween20and30(){
        //act
        String result=obj.check_odd_even(5);
        //assert
        assertEquals("Number is odd but doesn't lie between 20-30",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }
    public void numberisevenandtliebetween20and30(){
        //act
        String result=obj.check_odd_even(6);
        //assert
        assertEquals("Number is even but doesn't lie between 20-30",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }
    public void numberenterediszero(){
        //act
        String result=obj.check_odd_even(5);
        //assert
        assertEquals("Please enter number greater than zero",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }
    public void giveninputiseven(){
        //act
        String result=obj.check_odd_even(5);
        //assert
        assertEquals("Jerry",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }
    public void giveninputisodd(){
        //act
        String result=obj.check_odd_even(5);
        //assert
        assertEquals("Tom",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }

}