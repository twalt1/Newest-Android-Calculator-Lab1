package com.example.androidcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivityTest {

    @Test
    public void test_Subtraction() {
        double val1 = 7.0;
        double val2 = 5.6;
        double tolerance = 0.0000000001;

        MainActivity main = new MainActivity();

        double test1 = main.mathEquals(7.0, 5.6, '-');
        double test2 = main.mathEquals(-7.0, 5.6, '-');
        double test3 = main.mathEquals(7.0, -5.6, '-');
        double test4 = main.mathEquals(-7.0, -5.6, '-');
        double test5 = main.mathEquals(5.6, 7.0, '-');
        double test6 = main.mathEquals(100000, 468431, '-');
        double test7 = main.mathEquals(616151, 4641, '-');
        double test8 = main.mathEquals(1566.516156, 869.234, '-');
        double test9 = main.mathEquals(4861.328, 894.3547, '-');

        assertEquals(1.4, test1, tolerance);
        assertEquals(-12.6, test2, tolerance);
        assertEquals(12.6, test3, tolerance);
        assertEquals(-1.4, test4, tolerance);
        assertEquals(-1.4, test5, tolerance);
        assertEquals(-368431, test6, tolerance);
        assertEquals(611510, test7, tolerance);
        assertEquals(697.282156, test8, tolerance);
        assertEquals(3966.9733, test9, tolerance);

    }
}