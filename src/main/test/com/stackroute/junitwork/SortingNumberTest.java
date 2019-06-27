package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class SortingNumberTest {
    SortingNumber obj=new SortingNumber();
    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
        obj= new SortingNumber();
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
    public void sortAddEvenNumbers(){
        //act
        String result=obj.sortingList(new int[]{10,20,30,40});
        //assert
        assertEquals("sum of the even numbers is100",result);
    }


}