/**
 * This class represents the Main Activity file for our (Group 12)'s Simple Calculator program
 * Version 1.02 update:
 * 1. Added Junit and Javadoc
 * 2. Added methods: addition, subtraction, multiplication, and division.
 * javac -cp "junit-4.13.jar;hamcrest-core-1.3.jar;." MainActivity.java
 * java -cp "junit-4.13.jar;hamcrest-core-1.3.jar;." MainActivity
 * @author Quoc Dat Phung 300164087, Jonathan Grobben 300190246, Tuna Bolukbasi 300185784, Zehan Li 300130533, Timothy Walters 300113350
 * @version 1.02 (November 22, 2021)
 * @since version 1.01
 */

package com.example.androidcalculator;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

/**
 * The Main Activity class
 */
public class MainActivity extends AppCompatActivity {
    /**
     * Attributes:
     * Buttons, textview (for display)
     * Boolean and Double values to calculate logic
     */

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClr, btnMul,
    btnEql, btnDec, btnAdd, btnSub, btnDiv;
    TextView display;
    boolean add, sub, mul, div, fin, firstAT, firstST;
    double val1, val2;

    /**
     * The onCreate method will include all the code for the calculator app.
     * @param savedInstanceState default parameter of onCreate method in Android Studio
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnEql = findViewById(R.id.btnEql);
        btnDec = findViewById(R.id.btnDec);

        btnClr = findViewById(R.id.btnClr);

        display = findViewById(R.id.textView);

        add = false;
        sub = false;
        mul = false;
        div = false;
        fin = false;

        //firstST = true;
        //firstAT = true;

        /**
         * OnClickListener method to register user's input when the button "1" is clicked on.
         */
        btn1.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for button "1".
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText("1");
                    fin = false;

                }   else {
                    display.setText(display.getText() + "1");
                }
            }
        });

        /**
         * OnClickListener method to register user's input when the button "2" is clicked on.
         */
        btn2.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for button "2".
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText("2");
                    fin = false;

                }   else {
                    display.setText(display.getText() + "2");
                }
            }
        });

        /**
         * OnClickListener method to register user's input when the button "3" is clicked on.
         */
        btn3.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for button "3".
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText("3");
                    fin = false;

                }   else {
                    display.setText(display.getText() + "3");
                }
            }
        });

        /**
         * OnClickListener method to register user's input when the button "4" is clicked on.
         */
        btn4.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for button "4".
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText("4");
                    fin = false;

                }   else {
                    display.setText(display.getText() + "4");
                }
            }
        });

        /**
         * OnClickListener method to register user's input when the button "5" is clicked on.
         */
        btn5.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for button "5".
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText("5");
                    fin = false;

                }   else {
                    display.setText(display.getText() + "5");
                }
            }
        });

        /**
         * OnClickListener method to register user's input when the button "6" is clicked on.
         */
        btn6.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for button "6".
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText("6");
                    fin = false;

                }   else {
                    display.setText(display.getText() + "6");
                }
            }
        });

        /**
         * OnClickListener method to register user's input when the button "7" is clicked on.
         */
        btn7.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for button "7".
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText("7");
                    fin = false;

                }   else {
                    display.setText(display.getText() + "7");
                }
            }
        });

        /**
         * OnClickListener method to register user's input when the button "8" is clicked on.
         */
        btn8.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for button "8".
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText("8");
                    fin = false;

                }   else {
                    display.setText(display.getText() + "8");
                }
            }
        });

        /**
         * OnClickListener method to register user's input when the button "9" is clicked on.
         */
        btn9.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for button "9".
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText("9");
                    fin = false;

                }   else {
                    display.setText(display.getText() + "9");
                }

            }
        });

        /**
         * OnClickListener method to register user's input when the "add" button is clicked on.
         */
        btnAdd.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for the "add" button.
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                val1 = MainActivity.this.addition();
                val1 = Float.parseFloat(display.getText().toString());
                add = true;
                display.setText("");
            }

        });

        /**
         * OnClickListener method to register user's input when the "subtraction" button is clicked on.
         */
        btnSub.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for the "subtraction" button.
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                val1 = MainActivity.this.subtraction();
                val1 = Float.parseFloat(display.getText().toString());
                sub = true;
                display.setText("");
            }
        });

        /**
         * OnClickListener method to register user's input when the "multiplication" button is clicked on.
         */
        btnMul.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for the "multiplication" button.
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                val1 = MainActivity.this.multiplication();
                val1 = Float.parseFloat(display.getText().toString());
                mul = true;
                display.setText("");
            }
        });

        /**
         * OnClickListener method to register user's input when the "divide" button is clicked on.
         */
        btnDiv.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for the "divide" button.
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                val1 = MainActivity.this.division();
                val1 = Float.parseFloat(display.getText().toString());
                div = true;
                display.setText("");
            }
        });

        /**
         * OnClickListener method to register user's input when the "decimal" button is clicked on.
         */
        btnDec.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for the "decimal" button.
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText(".");
                    fin = false;

                }   else {
                    display.setText(display.getText() + ".");
                }
            }
        });

        /**
         * OnClickListener method to register user's input when the button "0" is clicked on.
         */
        btn0.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for the "0" button.
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                String str = display.getText().toString();

                if (fin == true || str.equals("Please enter in a valid number first.")) {

                    display.setText("0");
                    fin = false;

                } else {
                    display.setText(display.getText() + "0");
                }
            }
        });

        /**
         * OnClickListener method to register user's input when the "clear" button is clicked on.
         */
        btnClr.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for the "clear" button.
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {
                val1 = 0;
                val2 = 0;

                fin = true;
                add = false;
                sub = false;
                div = false;
                mul = false;
                fin = false;

                //firstAT = true;
                //firstST = true;

                display.setText("");
            }
        });

        /**
         * OnClickListener method to register user's input when the "equals" button is clicked on.
         */
        btnEql.setOnClickListener(new View.OnClickListener() {
            /**
             * OnClick method for the "equals" button.
             * @param v Default view in Android Studio for the onClick method.
             */
            public void onClick(View v) {

                //String str = display.getText().toString();

                //int len = str.length();

                //String newStr = str.replaceAll("+"," ");

                //String[] parts = newStr.split(" ");

                //val1 = Float.parseFloat(parts[0]);
                //val2 = Float.parseFloat(parts[1]);

                String str = display.getText().toString();
                char target = '.';
                int counter = 0;

                int len = str.length();

                for (int i = 0; i < len; i++) {

                    if (str.charAt(i) == target) {

                        counter++;

                    }

                }

                if (len == 0 || str.equals("Please enter in a valid number first.") || counter > 1) {

                    display.setText("Please enter in a valid number first.");

                }

                if (str.equals(".")) {

                    display.setText("0");

                }

                //float aNum = Float.parseFloat(display.getText().toString());

                //if (((aNum < 1 && aNum > 0) || (aNum > -1 && aNum < 0)) && (add == false) && (sub == false) && (div = false) && (mul == false) && (aNum != null)) {

                //    display.setText(String.valueOf(aNum));

                //}

                float res;
                char operator;

                    if (add == true) {
                        operator = '+';
                        val2 = Float.parseFloat(display.getText().toString());

                        res = (float) mathEquals(val1, val2, operator);

                        if (((int) res) == (res)) {

                            display.setText(Integer.toString((int) res));
                            //val1 = 0;
                            //val2 = 0;

                        } else {

                            display.setText(String.format("%.7g%n", res));
                            //val1 = 0;
                            //val2 = 0;

                        }

                    }

                    if (sub == true) {
                        operator = '-';
                        val2 = Float.parseFloat(display.getText().toString());

                        res = (float) mathEquals(val1, val2, operator);

                        if (((int) res) == (res)) {

                            display.setText(Integer.toString((int) res));
                            //val1 = 0;
                            //val2 = 0;

                        } else {

                            display.setText(String.format("%.7g%n", res));
                            //val1 = 0;
                            //val2 = 0;

                        }

                    }

                    if (mul == true) {
                        operator = '*';
                        val2 = Float.parseFloat(display.getText().toString());

                        res = (float) mathEquals(val1, val2, operator);

                        if (((int) res) == (res)) {

                            display.setText(Integer.toString((int) res));
                            //val1 = 0;
                            //val2 = 0;

                        } else {

                            display.setText(String.format("%.7g%n", res));
                            //val1 = 0;
                            //val2 = 0;

                        }

                    }

                    if (div == true) {
                        operator = '/';
                        val2 = Float.parseFloat(display.getText().toString());

                        res = (float) mathEquals(val1, val2, operator);

                        if (val2 == 0) {
                            display.setText("Cannot divide by 0");
                        }

                        if (((int) res) == (res)) {

                            display.setText(Integer.toString((int) res));
                            //val1 = 0;
                            //val2 = 0;

                        } else {

                            display.setText(String.format("%.7g%n", res));
                            //val1 = 0;
                            //val2 = 0;

                        }

                    }

                    val1 = 0;
                    val2 = 0;
                    fin = true;
                    add = false;
                    sub = false;
                    div = false;
                    mul = false;
                    //firstAT = true;
                    //firstST = true;

                }
        });
    }

    /**
     * Addition method
     * @return the summation as a double
     */
    protected double addition(){
        String str = display.getText().toString();
        char target = '.';
        int counter = 0;

        int len = str.length();

        for(int i = 0; i < len; i++) {

            if(str.charAt(i) == target) {

                counter++;

            }

        }

        if (str.equals("") || str == null) {

            if (fin == true) {

                fin = false;

            }

            display.setText(display.getText() + "+");
            //firstAT = false;

        }   else if (str.equals("+") || str.equals(".") || str.equals("-") || str.equals("Please enter in a valid number first.") || counter > 1) {

            display.setText("Please enter in a valid number first.");

        }

        return val1;
    }

    /**
     * subtraction method
     * @return the result as a double
     */
    protected double subtraction(){
        String str = display.getText().toString();
        char target = '.';
        int counter = 0;

        int len = str.length();

        for(int i = 0; i < len; i++) {

            if(str.charAt(i) == target) {

                counter++;

            }

        }

        if (str.equals("") || str == null) {

            if (fin == true) {

                fin = false;

            }

            display.setText(display.getText() + "-");
            //firstST = false;

        }   else if (str.equals("+") || str.equals(".") || str.equals("-") || str.equals("Please enter in a valid number first.") || counter > 1) {

            display.setText("Please enter in a valid number first.");

        }
        return val1;
    }

    /**
     * multiplication method
     * @return the result as a double
     */
    protected double multiplication(){
        String str = display.getText().toString();

        char target = '.';
        int counter = 0;

        int len = str.length();

        for(int i = 0; i < len; i++) {

            if(str.charAt(i) == target) {

                counter++;

            }

        }

        if (len == 0 || str.equals(".") || str.equals("Please enter in a valid number first.") || counter > 1) {

            //mul = false;
            display.setText("Please enter in a valid number first.");

        }
        return val1;
    }

    /**
     * division method
     * @return the result as a double
     */
    protected double division(){
        String str = display.getText().toString();

        char target = '.';
        int counter = 0;

        int len = str.length();

        for(int i = 0; i < len; i++) {

            if(str.charAt(i) == target) {

                counter++;

            }

        }

        if (len == 0 || str.equals("Please enter in a valid number first.") || str.equals(".") || counter > 1) {

            //div = false;
            display.setText("Please enter in a valid number first.");

        }
        return val1;
    }

    /**
     * The method to calculate the addition, subtraction, multiplication, and division logic.
     * @param val1 first operand
     * @param val2 second operand
     * @param operator identifies the operation to be performed
     * @return the resulting value as a double
     */
    protected static double mathEquals(double val1, double val2, char operator){
        double res = 0;
        if (operator == '+'){
            res = val1 + val2;
        } else if (operator == '-'){
            res = val1-val2;
        } else if (operator == '*'){
            res = val1*val2;
        } else if (operator == '/'){
            res = val1/val2;
        }
        return res;
    }
}