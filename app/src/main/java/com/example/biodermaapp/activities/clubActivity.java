package com.example.biodermaapp.activities;

import android.content.Intent;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biodermaapp.R;
import com.example.biodermaapp.ajustador.RecycleViewProductoDescuento;
import com.example.biodermaapp.entidades.ClientePrueba;
import com.example.biodermaapp.entidades.ProductoComprable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class clubActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    int BionCoins;
    private ClientePrueba cliente;
    private RecyclerView recyclerView;
    TextView CantidadBioncoins, NombreNivel, DescripNivel;
    ImageView Icono;
    ProductoComprable p1,p2,p3,p4,p5;
    ArrayList<ProductoComprable> productoComprables = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        SubidaDeNivel();
        cliente = new ClientePrueba("Pepe", "jojojojo22","elpeposo@app.com");
        cliente.setBioCoins(1200);
        BionCoins = cliente.getBioCoins();
        p1 = new ProductoComprable("Papas",R.drawable.sensibio_eye,0.15,12.2,"Para el cuerpo");
        p2 = new ProductoComprable("Papas",R.drawable.sensibio_eye,0.15,12.2,"Para el cuerpo");
        p3 = new ProductoComprable("Papas",R.drawable.sensibio_eye,0.15,12.2,"Para el cuerpo");
        p4 = new ProductoComprable("Papas",R.drawable.sensibio_eye,0.15,12.2,"Para el cuerpo");
        p5 = new ProductoComprable("Papas",R.drawable.sensibio_eye,0.15,12.2,"Para el cuerpo");

        productoComprables.add(p1);
        productoComprables.add(p2);
        productoComprables.add(p3);
        productoComprables.add(p4);
        productoComprables.add(p5);

        recyclerView = findViewById(R.id.rvClub);
        RecycleViewProductoDescuento adapter = new RecycleViewProductoDescuento(productoComprables);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {

                switch (Item.getItemId()) {

                    case R.id.cuenta:
                        Intent intent1 = new Intent(clubActivity.this, MiCuenta.class);
                        startActivity(intent1);

                        break;

                    case R.id.Producto:

                        Intent intent2 = new Intent(clubActivity.this, Producto.class);
                        startActivity(intent2);
                        break;

                    case R.id.Scanner:

                        Intent intent3 = new Intent(clubActivity.this, MiCuenta.class);
                        startActivity(intent3);
                        break;

                    case R.id.Home:
                        Intent intent4 = new Intent(clubActivity.this, HomeActivity.class);
                        startActivity(intent4);

                        break;

                    case R.id.Club:

                        break;
                }

                return false;
            }
        });


    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void SubidaDeNivel(){

        NombreNivel = findViewById(R.id.NombreNivel);
        DescripNivel=findViewById(R.id.DescNivel);
        CantidadBioncoins = findViewById(R.id.CantidadCoins);
        Icono = findViewById(R.id.Nivel);
        CantidadBioncoins.setText(BionCoins + "BC");

        //if's que cambiaran en orden de subida de nivel

        //de bronce a plata


        if(BionCoins >= 1000 && BionCoins < 2500){
            Icono.setImageDrawable(getDrawable(R.drawable.ic_plata_no_seleccionado));
            NombreNivel.setText("Plata");
            DescripNivel.setText("Consigue 2500 BioCoins para llegar a oro");

        }

        //de plata a oro
        if(BionCoins >= 2500 && BionCoins < 5000){
            Icono.setImageDrawable(getDrawable(R.drawable.ic_oro_no_seleccionado));
            NombreNivel.setText("Oro");
            DescripNivel.setText("Consigue 5000 BioCoins para llegar a platino");

        }

        //de oro a platino
        if(BionCoins >= 5000 && BionCoins < 7500){
            Icono.setImageDrawable(getDrawable(R.drawable.ic_plata_no_seleccionado));
            NombreNivel.setText("Platino");
            DescripNivel.setText("Consigue 7500 BioCoins para llegar a diamante");

        }

        //de platino a diamante
        if(BionCoins >= 7500 ){
            Icono.setImageDrawable(getDrawable(R.drawable.ic_diamante_no_seleccionado));
            NombreNivel.setText("Diamante");
            DescripNivel.setText("Felicidades tienes el nivel mas alto");

        }


    }
}
