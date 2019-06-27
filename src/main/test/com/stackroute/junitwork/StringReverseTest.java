package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {
StringReverse obj=new StringReverse();
    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
        obj= new StringReverse();
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
    public void stringReverse(){
        //act
        String result=obj.stringReverse("abcd");
        //assert
        assertEquals("dcba",result);
    }



}