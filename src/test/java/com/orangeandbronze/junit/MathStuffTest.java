package com.orangeandbronze.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathStuffTest { //The test class
    //@Test
    /*void gcf_both_params_positive_and_same_value(){
        int x = 5;
        int y = 5;
        int expected = 5;
        int actual = new MathStuff().gcf(x, y); //instantiate a MathStuff object and call its gcf method
        assertEquals(expected, actual); //verify if actual is the same as expected

    }

    void gcf_both_params_positive_w_multiple_common_factors(){
        int x = 24;
        int y = 18;
        assertEquals(6, new MathStuff().gcf(x, y));
    }*/

    /*#1 TODO: Implement an additional test called gcf_both_params_positive_w_no_common_factors, wherein
    the parameters passed are both positive but have no common factors other than 1.*//*

    void gcf_both_params_positive_w_no_common_factors(){
        int x = 17;
        int y = 19;
        int expected = 1;
        int actual = new MathStuff().gcf(x, y);
        assertEquals(expected, actual);
    }*/

    /*#2 TODO: Implement an additional test called gcf_one_param_negative_w_multiple_common_factors, where
    the two parameters have multiple common factors, but one of the
    parameters is a negative number.*//*

    void gcf_one_param_negative_w_multiple_common_factors() {
        int x = -12;
        int y = 18;
        int expected = 6;
        int actual = new MathStuff().gcf(x, y);
        assertEquals(expected, actual);
    }*/

    /*#3 TODO: Edit the gcf method to use iteration instead of recursion. Verify
    the correctness of your new implementation using the unit test you
    created.*/

    /*public int gcf(int x, int y) {
        if (x == 0 || y == 0) {
            throw new IllegalArgumentException("Cannot find GCF of zero.");
        }
        x = Math.abs(x);
        y = Math.abs(y);
        while (y > 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }*/

    /*#5 TODO: Create a new test class called EnglishStuffTest, to test EnglishStuff. Be sure
    that the new class is in src/test/java, and in the same package as the class under test.
    Write two or three tests for each of the methods of EnglishStuff. Remember to use descriptive method names.*/

    public static class EnglishStuffTest {

        @Test
        void testPluralize_zero() {
            String singular = "apple";
            String plural = EnglishStuff.pluralize(singular, 0);
            assertEquals("0 apples", plural);
        }

        @Test
        void testPluralize_one() {
            String singular = "apple";
            String plural = EnglishStuff.pluralize(singular, 1);
            assertEquals("1 apple", plural);
        }

        @Test
        void testPluralize_twoOrMore() {
            String singular = "apple";
            String plural = EnglishStuff.pluralize(singular, 2);
            assertEquals("2 apples", plural);
            plural = EnglishStuff.pluralize(singular, 5);
            assertEquals("5 apples", plural);
        }

        @Test
        void testCapitalize_firstLetter() {
            String str = "orange";
            String capitalized = EnglishStuff.capitalize(str);
            assertEquals("Orange", capitalized);
        }

        @Test
        void testCapitalize_allLetters() {
            String str = "banana";
            String capitalized = EnglishStuff.capitalize(str);
            assertEquals("Banana", capitalized);
        }

        @Test
        void testCapitalize_emptyString() {
            String str = "";
            String capitalized = EnglishStuff.capitalize(str);
            assertEquals("", capitalized);
        }
    }



}
