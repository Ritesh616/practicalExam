package com.example.ritesh_prac_28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userID, password;
    Button submit;
    int counter  = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userID = findViewById(R.id.userId);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userID.getText().toString().equals("Ritesh")) {
                    if (password.getText().toString().equals("Ritesh")) {
                        Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(MainActivity.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                } else {
                    counter--;
                    Toast.makeText(MainActivity.this, "No such user ID", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Attempts left: "+counter, Toast.LENGTH_SHORT).show();
                    if (counter == 0) {
                        submit.setEnabled(false);
                    }
                }
            }
        });


    }
}