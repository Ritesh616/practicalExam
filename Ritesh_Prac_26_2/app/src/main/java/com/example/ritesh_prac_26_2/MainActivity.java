package com.example.ritesh_prac_26_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userID, password;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        userID = findViewById(R.id.userId);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (userID.getText().toString().equals("Suyog")){
                    if (password.getText().toString().equals("Suyog")){
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