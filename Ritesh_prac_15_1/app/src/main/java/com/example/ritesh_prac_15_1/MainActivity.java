package com.example.ritesh_prac_15_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
class ToastExample extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_example);
        Button showBtn = findViewById(R.id.showToastBtn);
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater = getLayoutInflater();
                View toastLayout =
                        layoutInflater.inflate(R.layout.my_toast, (ViewGroup)
                                findViewById(R.id.toastLayoutID));
                Toast toastObject = new Toast(getApplicationContext());
                toastObject.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toastObject.setDuration(Toast.LENGTH_SHORT);
                toastObject.setView(toastLayout);
                toastObject.show();
            }
        });
    }
}
