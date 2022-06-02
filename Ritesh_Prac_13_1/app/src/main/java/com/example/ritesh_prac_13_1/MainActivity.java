package com.example.ritesh_prac_13_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton b1 = findViewById(R.id.b1);
        ProgressBar p1 = findViewById(R.id.progrss);


        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (b1.isChecked()) p1.setVisibility(View.VISIBLE);
                if(b1.isChecked()!= true) p1.setVisibility(View.INVISIBLE);

            }
        });
    }
}