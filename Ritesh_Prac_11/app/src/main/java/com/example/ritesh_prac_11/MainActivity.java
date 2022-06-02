package com.example.ritesh_prac_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox java = findViewById(R.id.java);
        CheckBox python = findViewById(R.id.python);
        CheckBox c = findViewById(R.id.c);
        CheckBox php = findViewById(R.id.PHP);
        CheckBox android = findViewById(R.id.android);
        Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String output = "Selected CheckBoxes: ";
                String N_output = "You haven't selected anything";
                if(java.isChecked()||python.isChecked()||c.isChecked()||php.isChecked()){
                    if(java.isChecked()){
                        output +="\n Java";
                    }if(python.isChecked()) {
                        output += "\n Python";
                    }if(c.isChecked()){
                        output +="\n C";
                    }if(php.isChecked()){
                        output +="\n Php";
                    }if(android.isChecked()){
                        output +="\n Android";
                    }
                }else{
                    Toast.makeText(MainActivity.this, N_output, Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(MainActivity.this, output, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
