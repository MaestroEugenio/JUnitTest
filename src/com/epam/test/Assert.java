package com.epam.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class Assert {
    @Test
    public void testAssertions(){
        String str = new String("epam");
        String str1 = new String("epam");
        String str2 = null;
        String str3 = "epam";
        String str4 = "epam";
        int val = 5;
        int val1 = 6;
        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};
        //check for equals
        assertEquals(str, str1);
        //check for true
        assertTrue(val<val1);
        //check for false
        assertFalse(val>val1);
        //check for null
        assertNotNull(str);
        //check if it is null
        assertNull(str2);
        //check if the reference is pointed to same object
        assertSame(str3, str4);
        //check if two objects are not same
        assertNotSame(str, str1);
        //check if two arrays are equals
        assertArrayEquals(expectedArray, resultArray);
    }
}
