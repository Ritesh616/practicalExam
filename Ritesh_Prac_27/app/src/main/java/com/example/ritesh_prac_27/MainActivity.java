package com.example.ritesh_prac_27;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText userID, password;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userID = findViewById(R.id.userId);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);



        submit.setOnClickListener(view -> {
            if (userID.getText().toString().equals("Ritesh")){
                if (password.getText().toString().equals("Ritesh")){
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "No such user ID", Toast.LENGTH_SHORT).show();
            }

        });

    }
}