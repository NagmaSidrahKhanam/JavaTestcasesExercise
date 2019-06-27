package com.stackroute.junitwork;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelOrConsonentTest {


    VowelOrConsonent obj=new VowelOrConsonent();

    @Before
    public void setUp(){
        System.out.println("Before");
        //arrange
        obj= new VowelOrConsonent();
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
    public void givenInputshouldNotBeNumber(){
        //act
        String result=obj.count_Vowels("rsdf8");
        //assert
        assertEquals(result,"Error number: Please enter only alphabets");
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }

    public void givenInputshouldNotBeAlphabet(){
        //act
        String result=obj.count_Vowels("rsdf@");
        //assert
        assertEquals("Error special character: Please enter only alphabets",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }
    public void givenInputHave(){
        //act
        String result=obj.count_Vowels("rsdf");
        //assert
        assertEquals("consonent consonent consonent consonent",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }



    public void givenInputshouldNotBeNumberformat(){
        //act
        String result=obj.count_Vowels("aeiou2");
        //assert
        assertEquals("Error number: Please enter only alphabets",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }

    public void givenInputshouldNotBeAlphabetformat(){
        //act
        String result=obj.count_Vowels("aeiou#");
        //assert
        assertEquals("Error special character: Please enter only alphabets",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }
    public void givenInputHas(){
        //act
        String result=obj.count_Vowels("aeiou");
        //assert
        assertEquals("vowel vowel vowel vowel",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }

    public void givenInputshouldNotBeNumbers(){
        //act
        String result=obj.count_Vowels("ateiw4");
        //assert
        assertEquals("Error number: Please enter only alphabets",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }

    public void givenInputshouldNotBeAlphabets(){
        //act
        String result=obj.count_Vowels("asdf$");
        //assert
        assertEquals("Error special character: Please enter only alphabets",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }
    public void givenInputIs(){
        //act
        String result=obj.count_Vowels("asdf");
        //assert
        assertEquals("vowel consonent vowel vowel consonent",result);
//        assert("1001 is pallindrome and sum of even numbers is less than 25",result);
    }


}