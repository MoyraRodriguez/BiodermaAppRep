package com.example.biodermaapp;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
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
    ImageButton btnBronce,btnPlata,btnOro,btnPlatino,btnDiamante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_beneficios);
        Descuento1 = findViewById(R.id.Descuento1);
        Descuento2 = findViewById(R.id.descuento2);
        Informacion = findViewById(R.id.Informacion);
        tConteiner = findViewById(R.id.tConteiner);
        Informacion2 = findViewById(R.id.Informacion2);

        //que se vea igual en todas las pantallas


        //botones
        btnBronce = findViewById(R.id.btnBronce);
        btnPlata = findViewById(R.id.btnPlata);
        btnOro = findViewById(R.id.btnOro);
        btnPlatino = findViewById(R.id.btnPlatino);
        btnDiamante = findViewById(R.id.btnDiamante);




        MostrarInformacion();
        CambiodeDescuento();







    }

    private void CambiodeDescuento(){

        btnBronce.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {


                btnBronce.setBackgroundColor(Color.parseColor("#334D6B"));
                btnPlata.setBackgroundColor(Color.parseColor("#ffffff"));
                btnOro.setBackgroundColor(Color.parseColor("#ffffff"));
                btnPlatino.setBackgroundColor(Color.parseColor("#ffffff"));
                btnDiamante.setBackgroundColor(Color.parseColor("#ffffff"));

                Descuento1.setText("5% de descuento en compras mayores a 200 soles");
                Informacion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam auctor mauris metus, a egestas velit hendrerit eu. Suspendisse quis lobortis velit. Nam consectetur odio et lobortis elementum.");

                Descuento2.setText("10% de descuento en hydrabios");
                Informacion2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis tempus tortor velit, interdum elementum sem dapibus ac. Aliquam nec enim non tortor venenatis mattis. Pellentesque quis nibh elementum, imperdiet leo et, lobortis felis. Suspendisse ac malesuada est. Suspendisse dapibus ipsum id efficitur mollis. Suspendisse ultrices nec est quis laoreet. Donec lacinia diam nulla, sed laoreet leo ultricies ut. Duis non cursus urna. Donec porta posuere sem, eget placerat lectus pretium eget");
            }
        });

        btnPlata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Descuento1.setText("20% de descuento en compras mayores a 100 soles");

                btnBronce.setBackgroundColor(Color.parseColor("#ffffff"));
                btnPlata.setBackgroundColor(Color.parseColor("#334D6B"));
                btnOro.setBackgroundColor(Color.parseColor("#ffffff"));
                btnPlatino.setBackgroundColor(Color.parseColor("#ffffff"));
                btnDiamante.setBackgroundColor(Color.parseColor("#ffffff"));

                Descuento2.setText("10% de descuento en sensibyos");

                Informacion2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis tempus tortor velit, interdum elementum sem dapibus ac. Aliquam nec enim non tortor venenatis mattis. Pellentesque quis nibh elementum, imperdiet leo et, lobortis felis. Suspendisse ac malesuada est. Suspendisse dapibus ipsum id efficitur mollis. Suspendisse ultrices nec est quis laoreet. Donec lacinia diam nulla, sed laoreet leo ultricies ut. Duis non cursus urna. Donec porta posuere sem, eget placerat lectus pretium eget");








                Informacion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam auctor mauris metus, a egestas velit hendrerit eu. Suspendisse quis lobortis velit. Nam consectetur odio et lobortis elementum.");


            }
        });

        btnOro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnBronce.setBackgroundColor(Color.parseColor("#ffffff"));
                btnPlata.setBackgroundColor(Color.parseColor("#ffffff"));
                btnOro.setBackgroundColor(Color.parseColor("#334D6B"));
                btnPlatino.setBackgroundColor(Color.parseColor("#ffffff"));
                btnDiamante.setBackgroundColor(Color.parseColor("#ffffff"));

                Descuento1.setText("5% de descuento en compras mayores a 200 soles");
                Informacion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam auctor mauris metus, a egestas velit hendrerit eu. Suspendisse quis lobortis velit. Nam consectetur odio et lobortis elementum.");

                Descuento2.setText("10% de descuento en hydrabios");
                Informacion2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis tempus tortor velit, interdum elementum sem dapibus ac. Aliquam nec enim non tortor venenatis mattis. Pel");

            }
        });

        btnPlatino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnBronce.setBackgroundColor(Color.parseColor("#ffffff"));
                btnPlata.setBackgroundColor(Color.parseColor("#ffffff"));
                btnOro.setBackgroundColor(Color.parseColor("#ffffff"));
                btnPlatino.setBackgroundColor(Color.parseColor("#334D6B"));
                btnDiamante.setBackgroundColor(Color.parseColor("#ffffff"));

                Descuento1.setText("5% de descuento en compras mayores a 200 soles");
                Informacion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam auctor mauris metus, a egestas velit hendrerit eu. Suspendisse quis lobortis velit. Nam consectetur odio et lobortis elementum.");

                Descuento2.setText("10% de descuento en hydrabios");
                Informacion2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis tempus tortor velit, interdum elementum sem dapibus ac. Aliquam nec enim non tortor venenatis mattis. Pel");


            }
        });

        btnDiamante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btnBronce.setBackgroundColor(Color.parseColor("#ffffff"));
                btnPlata.setBackgroundColor(Color.parseColor("#ffffff"));
                btnOro.setBackgroundColor(Color.parseColor("#ffffff"));
                btnPlatino.setBackgroundColor(Color.parseColor("#ffffff"));
                btnDiamante.setBackgroundColor(Color.parseColor("#334D6B"));

                Descuento1.setText("5% de descuento en compras mayores a 200 soles");
                Informacion.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam auctor mauris metus, a egestas velit hendrerit eu. Suspendisse quis lobortis velit. Nam consectetur odio et lobortis elementum.");

                Descuento2.setText("10% de descuento en hydrabios");
                Informacion2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis tempus tortor velit, interdum elementum sem dapibus ac. Aliquam nec enim non tortor venenatis mattis. Pel");



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
