package com.example.biodermaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class BeneficiosActivity extends AppCompatActivity {

    ViewGroup tConteiner;
    Button Descuento1, Descuento2;
    TextView Informacion, Informacion2;
    ImageButton btnBronce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_beneficios);
        Descuento1 = findViewById(R.id.Descuento1);
        Descuento2 = findViewById(R.id.descuento2);
        Informacion = findViewById(R.id.Informacion);
        tConteiner = findViewById(R.id.tConteiner);
        Informacion2 = findViewById(R.id.Informacion2);

        //botones
        btnBronce = findViewById(R.id.btnBronce);



        MostrarInformacion();
        CambiodeDescuento();







    }

    private void CambiodeDescuento(){

        btnBronce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Descuento1.setText("5% de descuento en compras mayores a 200 soles");
                Informacion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam auctor mauris metus, a egestas velit hendrerit eu. Suspendisse quis lobortis velit. Nam consectetur odio et lobortis elementum.");
            }
        });
    }

    private void MostrarInformacion() {





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

        Descuento2.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tConteiner);
                visible = !visible;
                Informacion2.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });





    }

}
