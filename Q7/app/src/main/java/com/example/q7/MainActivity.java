package com.example.q7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView view_result;
    EditText name, roll, branch;
    Button submit;
    String output = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_result = findViewById(R.id.result);
                name = findViewById(R.id.enter_name);
                roll = findViewById(R.id.enter_roll);
                branch = findViewById(R.id.enter_branch);

                output = "Name: "+name.getText().toString()+"\n";
                output = output + "Roll No.: "+roll.getText().toString()+"\n";
                output = output + "Branch : "+branch.getText().toString()+"\n";
                view_result.setText(output);

            }
        });

    }
}