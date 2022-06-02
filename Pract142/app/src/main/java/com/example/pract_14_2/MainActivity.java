package com.example.pract_14_2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView tv;
    ToggleButton tButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);
        tv = findViewById(R.id.tv);
        tButton = findViewById(R.id.tButton);

        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tButton.isChecked()){
                    img.setImageResource(R.drawable.img);
                    tv.setText("BMW");
                }else{
                    img.setImageResource(R.drawable.img_1);
                    tv.setText("AUDI");
                }
            }
        });

    }
}