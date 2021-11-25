/**
 * This class reprsents the JUnit test for the subtraction method in
 * our android studio's calculator app.
 * @author Jonathan Grobben 300190246 Quoc Dat Phung 300164087
 * @version 1.01 (November 14, 2021)
 *
 */

package com.example.androidcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The Main Activity Test class
 */
public class MainActivityTest {

    /**
     * This Junit method tests the subtraction logic in the mathEquals() method.
     */
    @Test
    public void test_Subtraction() {
        double tolerance = 0.001;

        MainActivity main = new MainActivity();

        double test1 = Double.parseDouble(main.toSub(7.0, 5.6));
        double test2 = Double.parseDouble(main.toSub(-7.0, 5.6));
        double test3 = Double.parseDouble(main.toSub(7.0, -5.6));
        double test4 = Double.parseDouble(main.toSub(-7.0, -5.6));
        double test5 = Double.parseDouble(main.toSub(5.6, 7.0));
        double test6 = Double.parseDouble(main.toSub(100000, 468431));
        double test7 = Double.parseDouble(main.toSub(616151, 4641));
        double test8 = Double.parseDouble(main.toSub(1566.516156, 869.234));
        double test9 = Double.parseDouble(main.toSub(4861.328, 894.3547));

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