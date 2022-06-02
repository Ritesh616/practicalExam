package com.example.q16;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    public BluetoothAdapter BA;
    public ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BA = BluetoothAdapter.getDefaultAdapter();
        tb = findViewById(R.id.toggle);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnorOff();
            }
        });
    }


    @SuppressLint("MissingPermission")
    public void OnorOff(){
        if (tb.isChecked()){
            Intent turnon = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(turnon, 0);
        } if (!tb.isChecked()) {
            BA.disable();
        }
    }
}