package com.epam.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class JUnitClass {
    @Test
    public void setup(){
        String str = "First JUnit program";
        assertEquals("First JUnit programs", str);
    }
}
