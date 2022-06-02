package com.example.ritesh_prac_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText userID = findViewById(R.id.userId);
        EditText password = findViewById(R.id.password);
        Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userID.getText().toString().equals("Ritesh")){
                    if (password.getText().toString().equals("Ritesh")){
                        Toast.makeText(MainActivity.this, "Login Successful!!!", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Wrong Password ", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "UserId not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}