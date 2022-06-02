package com.example.pract_14_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    Button button;
    String arr[] = new String[15];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        button = findViewById(R.id.button);

        for (int i = 0; i < 15; i++){
            arr[i] = Integer.toString(i+1);
        }

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, R.layout.activity_main, R.id.button, arr);

        gridView.setAdapter(ad);

    }
}