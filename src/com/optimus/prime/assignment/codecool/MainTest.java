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

    @Test
    public void testPrimeFinder5() {
        int expected = 31;
        assertEquals("with the range of 130 the expected result should be 31", expected, Main.findPrimes(130));
    }

    @Test
    public void testPrimeFinder6() {
        int expected = 62;
        assertEquals("with the range of 300 the expected result should be 62", expected, Main.findPrimes(300));
    }

    @Test
    public void testPrimeFinder7() {
        int expected = 190;
        assertEquals("with the range of 1151 the expected result should be 190", expected, Main.findPrimes(1151));
    }
}