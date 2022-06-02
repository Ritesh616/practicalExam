package com.example.ritesh_prac_18_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number;
    Button dial;
    String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        dial = findViewById(R.id.dial);

        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = number.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+Uri.encode(num)));
                startActivity(intent);
            }
        });


    }
}