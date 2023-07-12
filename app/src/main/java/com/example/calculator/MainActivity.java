package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.function.ToIntBiFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus(View v){
        EditText e1,e2,e3;
        e1=(EditText) findViewById(R.id.txt_1);
        e2=(EditText) findViewById(R.id.txt_2);
        int num1= Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        e3=(EditText) findViewById(R.id.txt_result);
        e3.setText(String.valueOf(num1+num2));
    }
    public void minus(View v){
        EditText e1,e2,e3;
        e1=(EditText) findViewById(R.id.txt_1);
        e2=(EditText) findViewById(R.id.txt_2);
        int num1= Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        e3=(EditText) findViewById(R.id.txt_result);
        e3.setText(String.valueOf(num1-num2));
    }

}