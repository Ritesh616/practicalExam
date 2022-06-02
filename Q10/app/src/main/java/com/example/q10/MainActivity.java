package com.example.q10;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String result = "Selected Checkboxes: \n";
    CheckBox java, python, php, android, c;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java = findViewById(R.id.java);
        python = findViewById(R.id.python);
        android = findViewById(R.id.android);
        php = findViewById(R.id.php);
        c = findViewById(R.id.c);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(java.isChecked()||python.isChecked()||android.isChecked()||php.isChecked()||c.isChecked()) {
                    if (java.isChecked()) {
                        result += "Java \n";
                    }
                    if (python.isChecked()) {
                        result += "Python \n";
                    }
                    if (android.isChecked()) {
                        result += "Android \n";
                    }
                    if (php.isChecked()) {
                        result += "PHP\n";
                    }
                    if (c.isChecked()) {
                        result +="C++\n";
                    }
                }

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
                java.setSelected(false);
                android.setSelected(false);
                python.setSelected(false);
                php.setSelected(false);
                c.setSelected(false);

            }
        });
    }

}