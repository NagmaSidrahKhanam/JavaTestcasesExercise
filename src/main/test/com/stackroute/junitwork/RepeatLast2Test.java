package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class RepeatLast2Test {
    RepeatLast2 obj=new RepeatLast2();
    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
        obj= new RepeatLast2();
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
        String result=obj.Repeat_Last2alphabets("hello",3);
        //assert
        assertEquals("hellollollollo",result);
    }




}