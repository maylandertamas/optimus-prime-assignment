package com.optimus.prime.assignment.codecool;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testPrimeFinder1()
    {
        int expected = 10;
        assertEquals("with the range of 30 the expected result should be 10", expected, Main.findPrimes(30));
    }

    @Test
    public void testPrimeFinder2() {
        int expected = 30;
        assertEquals("with the range of 120 the expected result should be 30", expected, Main.findPrimes(120));
    }

    @Test
    public void testPrimeFinder3() {
        int expected = 29;
        assertEquals("with the range of 110 the expected result should be 29", expected, Main.findPrimes(110));
    }
}