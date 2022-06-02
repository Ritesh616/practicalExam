package com.example.q15;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggle;
    WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggle = findViewById(R.id.toggle);

        wifiManager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        if(toggle.isChecked()){
            wifiManager.setWifiEnabled(true);
        }else{
            wifiManager.setWifiEnabled(false);
        }
    }
}