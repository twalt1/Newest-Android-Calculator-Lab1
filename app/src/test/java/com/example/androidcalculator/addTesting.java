package com.example.androidcalculator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class addTesting {

    @Test
    public void additionWorks(){
        char operator = '+';
        int val1 = 0;
        int val2 = 0;
        int upperBound = 9;
        double result;

        Random randGen = new Random();

        for(int i = 0; i < 5; i++){
            val1 = randGen.nextInt(upperBound);
            val2 = randGen.nextInt(upperBound);
            double trueresult = (val1+val2);
            result = (float)MainActivity.mathEquals(val1, val2, operator);
            assertEquals(trueresult, result, (0.5));
        }
    }
}
