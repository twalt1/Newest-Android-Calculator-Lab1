package com.example.androidcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplicationTest {
    @Test
    public void ToMultiplicationTest() {

        double[] val1 = {5.4, 9.7, -5, 8.5, 80};
        double[] val2 = {7, -5, 90, 0, 10};

        assertEquals(String.format("%.7g%n", 5.4*7), MainActivity.toMul(val1[0], val2[0]));

        assertEquals(String.format("%.7g%n", 9.7*-5), MainActivity.toMul(val1[1], val2[1]));

        assertEquals(Integer.toString(-450), MainActivity.toMul(val1[2], val2[2]));

        assertEquals(Integer.toString(0), MainActivity.toMul(val1[3], val2[3]));

        assertEquals(Integer.toString(800), MainActivity.toMul(val1[4],val2[4]));

    }
}
