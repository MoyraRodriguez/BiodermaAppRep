package com.example.biodermaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    Button BtnRecuperarCuenta, BtnRegistrarse, BtnIngresar;
    TextView Usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Usuario = findViewById(R.id.textUsuario);

        GotoRecuperarCuenta();


    }

    private void GotoRecuperarCuenta(){

        BtnRecuperarCuenta =  findViewById(R.id.BtnRecuperarCuenta);
        BtnRecuperarCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(LogInActivity.this,RecuperarCuentaActivity.class));

            }
        });

    }
}
