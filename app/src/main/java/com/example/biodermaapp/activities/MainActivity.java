package com.example.biodermaapp.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.biodermaapp.R;

public class MainActivity extends AppCompatActivity {
private static int SPLAH_TIME_OUT= 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this,LogInActivity.class);
                startActivity(homeIntent);
                finish();
            }


        }, SPLAH_TIME_OUT);


    }
}
