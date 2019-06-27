package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class SumOfIntegeresTest {

    SumOfIntegeres obj=new SumOfIntegeres();
    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
        obj= new SumOfIntegeres();
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


    public void addingOfNumbers()
    {
        int result =obj.Adding(new int[]{10,20,30,40});
        assertEquals(100,result);
    }
    @Test
    public void checkIfRepeation()
    {
        int result =obj.Adding(new int[]{11,20,30,40});
        assertEquals(101,result);
    }
}