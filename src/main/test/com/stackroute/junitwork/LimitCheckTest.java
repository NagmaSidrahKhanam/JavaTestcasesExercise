package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class LimitCheckTest {
    LimitCheck obj=new LimitCheck();
    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
        obj= new LimitCheck();
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
    public void checkNumberMatches(){
        //act
        String result=obj.matchnumbers(50);
        //assert
        assertEquals("Number guessed matches the original number",result);
    }
    public void checkNumberGreater(){
        //act
        String result=obj.matchnumbers(75);
        //assert
        assertEquals("Number is greater than the original number",result);
    }

    public void checkIfNumberIsSmaller()
    {
        //act
        String result=obj.matchnumbers(40);
        //assert
        assertEquals("Number is smaller than the original number",result);
    }

}