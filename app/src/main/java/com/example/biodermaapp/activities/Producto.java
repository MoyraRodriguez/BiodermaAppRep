package com.example.biodermaapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.biodermaapp.R;
import com.example.biodermaapp.Tab1Producto;
import com.example.biodermaapp.Tab2Producto;
import com.example.biodermaapp.Tab3Producto;
import com.example.biodermaapp.Tab4Producto;
import com.example.biodermaapp.ajustador.AdapterCardView;
import com.example.biodermaapp.ajustador.AdapterTextProducto;
import com.example.biodermaapp.entidades.ProductoComprable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Producto extends AppCompatActivity implements Tab1Producto.OnFragmentInteractionListener, Tab2Producto.OnFragmentInteractionListener, Tab3Producto.OnFragmentInteractionListener, Tab4Producto.OnFragmentInteractionListener {

    ViewPager viewPager;
    public static TextView nombreProducto, dataProducto, consejos,nombreComplementario;
    public static ImageView imagenProducto, productoComplementario;
    public static Button buttonProductoComplementario;
    BottomNavigationView bottomNavigationView;
    AdapterTextProducto adapterProducto;
    List<String> productStrings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        buttonProductoComplementario = findViewById(R.id.buttonProductoComplementario);
        nombreProducto = findViewById(R.id.tvNombreProducto);
        nombreComplementario = findViewById(R.id.tvNombreProductoComplementario);

        consejos = findViewById(R.id.tvConsejosUso);
        imagenProducto = findViewById(R.id.imageProducto);
        productoComplementario = findViewById(R.id.imageProductoComplementario);


        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        Intent intent = getIntent();

        nombreProducto.setText( intent.getExtras().getString("Nombre"));
        imagenProducto.setImageResource(intent.getExtras().getInt("Imagen"));

        productStrings.add(intent.getExtras().getString("Indicaciones"));
        productStrings.add(intent.getExtras().getString("Beneficios"));
        productStrings.add(intent.getExtras().getString("Informacion"));
        productStrings.add(intent.getExtras().getString("Formato"));



        adapterProducto = new AdapterTextProducto(productStrings, this);
        viewPager = findViewById(R.id.viewPagerProducto);
        viewPager.setAdapter(adapterProducto);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {

                switch (Item.getItemId()) {

                    case R.id.cuenta:
                        Intent intent = new Intent(Producto.this, MiCuenta.class);
                        startActivity(intent);

                        break;

                    case R.id.Producto:


                        break;

                    case R.id.Scanner:

                        Intent intent3 = new Intent(Producto.this, MiCuenta.class);
                        startActivity(intent3);
                        break;

                    case R.id.Home:
                        Intent intent4 = new Intent(Producto.this, HomeActivity.class);
                        startActivity(intent4);

                        break;

                    case R.id.Club:
                        Intent intent5 = new Intent(Producto.this, clubActivity.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
