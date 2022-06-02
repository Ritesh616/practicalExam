package com.example.ritesh_prac_13_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    public int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar pb = findViewById(R.id.pbar);
        Button btn = findViewById(R.id.btn);
        TextView title = findViewById(R.id.viewTitle);
        TextView tv = findViewById(R.id.tview1);
        TextView tv2 = findViewById(R.id.tview2);
        Handler handler = new Handler();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                title.setVisibility(View.VISIBLE);
                pb.setVisibility(View.VISIBLE);
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                        WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);


                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        while(i<100){
                            i+=1;

                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    pb.setProgress(i);
                                    tv.setText(i+"%");
                                    if (i>=0 && i<=10) tv2.setText("10/" + pb.getMax());
                                    if (i>10 && i<=20) tv2.setText("20/" + pb.getMax());
                                    if (i>20 && i<=30) tv2.setText("30/" + pb.getMax());
                                    if (i>30 && i<=40) tv2.setText("40/" + pb.getMax());
                                    if (i>40 && i<=50) tv2.setText("50/" + pb.getMax());
                                    if (i>50 && i<=60) tv2.setText("60/" + pb.getMax());
                                    if (i>60 && i<=70) tv2.setText("70/" + pb.getMax());
                                    if (i>70 && i<=80) tv2.setText("80/" + pb.getMax());
                                    if (i>80 && i<=90) tv2.setText("90/" + pb.getMax());
                                    if (i==100){
                                        tv2.setText("100/"+pb.getMax());
                                        title.setText("Download Completed!!!");
                                    }
                                }
                            });
                            try {
                                Thread.sleep(100);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }


                        }
                    }
                }).start();
            }
        });




    }
}