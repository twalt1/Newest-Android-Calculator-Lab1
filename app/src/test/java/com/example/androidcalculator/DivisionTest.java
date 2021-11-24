package com.example.androidcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

    @Test
    public void ToDivisionTest() {

        double[] val1 = {5.4, 9.7, -5, 8.5, 80};
        double[] val2 = {7, -5, 90, 0, 10};

        assertEquals(String.format("%.7g%n", 0.7714285714), MainActivity.toDivision(val1[0], val2[0]));

        assertEquals(String.format("%.7g%n", -1.940000000), MainActivity.toDivision(val1[1], val2[1]));

        assertEquals(String.format("%.7g%n", -0.055555555), MainActivity.toDivision(val1[2], val2[2]));

        assertEquals("Cannot be divided by zero", MainActivity.toDivision(val1[3], val2[3]));

        assertEquals(Integer.toString(8), MainActivity.toDivision(val1[4],val2[4]));

    }

}