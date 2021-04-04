package com.example.androidhw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String oldNumber = "";
    String operator = "+";
    boolean isNewOperator = true;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if (isNewOperator)
            ed1.setText("");
        isNewOperator = false;

        String number = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.but1:
                number += "1";
                break;
            case R.id.but2:
                number += "2";
                break;
            case R.id.but3:
                number += "3";
                break;
            case R.id.but4:
                number += "4";
                break;
            case R.id.but5:
                number += "5";
                break;
            case R.id.but6:
                number += "6";
                break;
            case R.id.but7:
                number += "7";
                break;
            case R.id.but8:
                number += "8";
                break;
            case R.id.but9:
                number += "9";
                break;
            case R.id.but0:
                number += "0";
                break;
            case R.id.dot:
                number += ".";
                break;
            case R.id.plusMinus:
                number = "-" + number;
                break;
        }
        ed1.setText(number);
    }

    public void operatorEvent(View view) {
        isNewOperator = true;
        oldNumber = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.divide:
                operator = "/";
                break;
            case R.id.multiply:
                operator = "*";
                break;
            case R.id.plus:
                operator = "+";
                break;
            case R.id.minus:
                operator = "-";
                break;
        }
    }

    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch (operator) {
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
        }
        ed1.setText(result + "");
    }

    public void acEvent(View view) {
        ed1.setText("0");
        isNewOperator = true;

    }

    public void percentEvent(View view) {
        double num = Double.parseDouble(ed1.getText().toString()) / 100;
        ed1.setText(num + "");
        isNewOperator = true;
    }
}