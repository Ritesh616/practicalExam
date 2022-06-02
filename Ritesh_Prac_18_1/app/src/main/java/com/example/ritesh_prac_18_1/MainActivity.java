package com.example.ritesh_prac_18_1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText url;
    Button fire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fire = findViewById(R.id.navigate);
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url = (EditText) findViewById(R.id.url);
                String urlstring = url.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(urlstring));
                startActivity(i);
            }
        });


    }
}