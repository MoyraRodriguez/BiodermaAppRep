package com.example.biodermaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class HomeActivity extends AppCompatActivity {
    RadioButton btn1,btn2,btn3;
    ImageView imagen1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn1 =(RadioButton) findViewById(R.id.btn1);
        btn2 = (RadioButton) findViewById(R.id.btn2);
        btn3 = (RadioButton) findViewById(R.id.btn3);
        imagen1 = findViewById(R.id.firstimage);
        CambioDeImagen1();

    }


    public void CambioDeImagen1(){

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              imagen1.setImageResource(R.drawable.ic_bronce_no_seleccionado);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen1.setImageResource(R.drawable.ic_cuadrado);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen1.setImageResource(R.drawable.ic_logo_mi_cuenta_principal);
            }
        });





    }
}
