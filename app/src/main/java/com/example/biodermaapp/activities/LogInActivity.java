package com.example.biodermaapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.biodermaapp.R;

public class LogInActivity extends AppCompatActivity {

    Button BtnRecuperarCuenta, BtnRegistrarse, BtnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        GotoRecuperarCuenta();
        GotoRegistrarse();
        GotoIngresar();


    }

    private void GotoRecuperarCuenta(){

        BtnRecuperarCuenta =  findViewById(R.id.BtnRecuperarCuenta);
        BtnRecuperarCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(LogInActivity.this,clubActivity.class));

            }
        });

    }

    private void GotoIngresar(){
        BtnIngresar = findViewById(R.id.buttonlogin);
        BtnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this,HomeActivity.class));
            }
        });
    }

    private void GotoRegistrarse(){
        BtnRegistrarse = findViewById(R.id.btnRegistrarse);
        BtnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogInActivity.this,RegisterActivity.class));
            }
        });

    }
}
