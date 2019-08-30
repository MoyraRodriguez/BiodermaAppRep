package com.example.biodermaapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biodermaapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Producto extends AppCompatActivity {

    public static TextView nombreProducto, dataProducto, consejos,nombreComplementario;
    public static ImageView imagenProducto, productoComplementario;
    public static Button buttonProductoComplementario;
    private static Button buttonInfo,buttonBeneficios,buttonInformacion, buttonFormato;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        buttonInfo = findViewById(R.id.buttonInfoProducto);
        buttonBeneficios = findViewById(R.id.buttonBenefProducto);
        buttonFormato = findViewById(R.id.buttonFormatProducto);
        buttonInformacion = findViewById(R.id.buttonInfoProducto);
        buttonProductoComplementario = findViewById(R.id.buttonProductoComplementario);
        nombreProducto = findViewById(R.id.tvNombreProducto);
        nombreComplementario = findViewById(R.id.tvNombreProductoComplementario);
        dataProducto = findViewById(R.id.tvProductoData);
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
        dataProducto.setText(intent.getExtras().getString("Descripcion"));

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


}
