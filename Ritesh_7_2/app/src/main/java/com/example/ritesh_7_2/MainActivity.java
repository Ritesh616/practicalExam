package com.example.ritesh_7_2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    EditText roll, name, cl, div;
    TextView out1, out2, out3, out4;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        roll = findViewById(R.id.roll);
        name = findViewById(R.id.name);
        cl = findViewById(R.id.cl);
        div = findViewById(R.id.div);
        b1 = findViewById(R.id.b1);
        out1 = findViewById(R.id.out1);
        out2 = findViewById(R.id.out2);
        out3 = findViewById(R.id.out3);
        out4 = findViewById(R.id.out4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out1.setText(roll.getText());
                out2.setText(name.getText());
                out3.setText(cl.getText());
                out4.setText(div.getText());
            }
        });


    }
}