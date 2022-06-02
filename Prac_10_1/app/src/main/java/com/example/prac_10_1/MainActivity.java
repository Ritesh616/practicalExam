package com.example.prac_10_1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        EditText userID = findViewById(R.id.userId);
        EditText password = findViewById(R.id.password);
        Button submit = findViewById(R.id.submit);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (userID.getText().toString().equals("Ritesh")){
                    if (password.getText().toString().equals("Ritesh")){
                        Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(MainActivity.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "No such user ID", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}