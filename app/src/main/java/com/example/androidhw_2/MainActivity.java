package com.example.androidhw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        String number = ed1.getText().toString();
        switch (view.getId()){
            case R.id.but7:
            number += "7";
            break;
        }
        ed1.setText(number);
    }
}