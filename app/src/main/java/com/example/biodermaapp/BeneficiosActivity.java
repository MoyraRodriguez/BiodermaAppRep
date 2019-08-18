package com.example.biodermaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class BeneficiosActivity extends AppCompatActivity {

    ViewGroup tConteiner;
    Button Descuento1, Descuento2;
    TextView Informacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficios);


        MostrarInformacion();







    }

    private void MostrarInformacion() {


        Descuento1 = findViewById(R.id.Descuento1);
        Informacion = findViewById(R.id.Informacion);
        tConteiner = findViewById(R.id.tConteiner);

        //transicion que muestra la informacion oculta
        Descuento1.setOnClickListener(new View.OnClickListener() {

            boolean visible;

            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(tConteiner);
                visible = !visible;
                Informacion.setVisibility(visible ? View.VISIBLE : View.GONE);


            }

        });

    }

}
