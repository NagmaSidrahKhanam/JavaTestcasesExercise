package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class CharCheckTest {


    CharCheck obj=new CharCheck();

    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
        obj= new CharCheck();
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
    public void checkforLowerCaseLetter()
    {
        //act
        String result=obj.checkChar('a');
        //assert
        assertEquals("Uppercase letter",result);
    }



    public void checkforUpperCaseLetter()
    {
        //act
        String result=obj.checkChar('q');
        //assert
        assertEquals("Lowercase letter",result);

    }
    public void checkforDigit()
    {
        //act
        String result=obj.checkChar('7');
        //assert
        assertEquals("digit",result);

    }
    public void checkforSymbol()
    {
        //act
        String result=obj.checkChar('@');
        //assert
        assertEquals("Special Character",result);
    }
}