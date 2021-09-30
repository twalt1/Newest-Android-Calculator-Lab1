package com.example.androidcalculator;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

//testing commenting. - tuna
public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClr, btnMul,
    btnEql, btnDec, btnAdd, btnSub, btnDiv;

    TextView display;

    boolean add, sub, mul, div, fin, firstAT, firstST;

    double val1, val2;

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

        btn1.setOnClickListener(new View.OnClickListener() {
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

        btn2.setOnClickListener(new View.OnClickListener() {
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

        btn3.setOnClickListener(new View.OnClickListener() {
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

        btn4.setOnClickListener(new View.OnClickListener() {
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

        btn5.setOnClickListener(new View.OnClickListener() {
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

        btn6.setOnClickListener(new View.OnClickListener() {
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

        btn7.setOnClickListener(new View.OnClickListener() {
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

        btn8.setOnClickListener(new View.OnClickListener() {
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

        btn9.setOnClickListener(new View.OnClickListener() {
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

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

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

                }   else{

                    val1 = Float.parseFloat(display.getText().toString());
                    add = true;
                    display.setText("");

                }


            }

        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

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

                }   else {

                    val1 = Float.parseFloat(display.getText().toString());
                    sub = true;
                    display.setText("");

                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
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

                }   else {
                    val1 = Float.parseFloat(display.getText().toString());

                    mul = true;
                    display.setText("");

                }

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
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

                }   else {
                    val1 = Float.parseFloat(display.getText().toString());

                    div = true;
                    display.setText("");

                }
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
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

        btn0.setOnClickListener(new View.OnClickListener() {
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

        btnClr.setOnClickListener(new View.OnClickListener() {
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

        btnEql.setOnClickListener(new View.OnClickListener() {
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

                for(int i = 0; i < len; i++) {

                    if(str.charAt(i) == target) {

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

                if (add == true){

                    val2 = Float.parseFloat(display.getText().toString());

                    res = (float)(val1 + val2);

                    if(((int)res) == (res)) {

                        display.setText(Integer.toString((int)res));
                        //val1 = 0;
                        //val2 = 0;

                    }   else {

                        display.setText(String.format("%.7g%n",res));
                        //val1 = 0;
                        //val2 = 0;

                    }

                }

                if (sub == true){

                    val2 = Float.parseFloat(display.getText().toString());

                    res = (float)(val1 - val2);

                    if(((int)res) == (res)) {

                        display.setText(Integer.toString((int)res));
                        //val1 = 0;
                        //val2 = 0;

                    }   else {

                        display.setText(String.format("%.7g%n",res));
                        //val1 = 0;
                        //val2 = 0;

                    }

                }

                if (mul == true){

                    val2 = Float.parseFloat(display.getText().toString());

                    res = (float)(val1 * val2);

                    if(((int)res) == (res)) {

                        display.setText(Integer.toString((int)res));
                        //val1 = 0;
                        //val2 = 0;

                    }   else {

                        display.setText(String.format("%.7g%n",res));
                        //val1 = 0;
                        //val2 = 0;

                    }

                }

                if (div == true){

                    val2 = Float.parseFloat(display.getText().toString());

                    res = (float)(val1 / val2);

                    if(((int)res) == (res)) {

                        display.setText(Integer.toString((int)res));
                        //val1 = 0;
                        //val2 = 0;

                    }   else {

                        display.setText(String.format("%.7g%n",res));
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
}