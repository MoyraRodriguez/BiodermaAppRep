package com.example.biodermaapp.activities;

import android.animation.ArgbEvaluator;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.example.biodermaapp.R;
import com.example.biodermaapp.ajustador.AdapterCardView;
import com.example.biodermaapp.entidades.ProductoComprable;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    RadioButton btn1,btn2,btn3;
    ImageView imagen1;
    ViewPager viewPager;
    AdapterCardView adapter;
    List<ProductoComprable> productos;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn1 =(RadioButton) findViewById(R.id.btn1);
        btn2 = (RadioButton) findViewById(R.id.btn2);
        btn3 = (RadioButton) findViewById(R.id.btn3);
        imagen1 = findViewById(R.id.firstimage);
        CambioDeImagen1();

        productos = new ArrayList<>();
        productos.add(new ProductoComprable("Pasta dental",R.drawable.ic_correo,"Ejasdanoasndaodnosdnao"));
        productos.add(new ProductoComprable("Waifu barata",R.drawable.ic_biodema_logo_3,"Ejasdanoasndaodnosdnao"));
        productos.add(new ProductoComprable("Perro",R.drawable.ic_fecha,"Ejasdanoasndaodnosdnao"));

        adapter = new AdapterCardView(productos,this);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (adapter.getCount() -1) ) {


                }

                else {

                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


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
