/**
 * This class reprsents the JUnit test for the addition method in
 * our android studio's calculator app. To run this Junit test, right click on
 * this file and select run "addTesting"
 * javac -cp "junit-4.13.jar;hamcrest-core-1.3.jar;." addTesting.java
 * java -cp "junit-4.13.jar;hamcrest-core-1.3.jar;." addTesting
 * @author Timothy Walters 300113350 Quoc Dat Phung 300164087
 * @version 1.01 (November 14, 2021)
 *
 */

package com.example.androidcalculator;

import org.junit.Test;
import static org.junit.Assert.*;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

/**
 * The addTesting Junit class
 */
public class addTesting {

    /**
     * This Junit method tests the addition logic in the mathEquals() method.
     */
    @Test
    public void additionWorks(){
        double[] val1 = {4,1,7,3,34};
        double[] val2 = {6,12,6,86,12};

        for(int i = 0; i < 4; i++){
            assertEquals(String.format("%.7g%n", (val1[i]+val2[i])), MainActivity.toAdd(val1[i], val2[i]));
        }
    }
}
