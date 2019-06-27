package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class LoopNumbersTest {

    LoopNumbers obj=new LoopNumbers();

    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
        obj= new LoopNumbers();
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
    public void givenInputshouldBeAlphabets()
    {
        //act
        String result=obj.getpattern(5);
        //assert
        assertEquals("122333444455555",result);
    }




}