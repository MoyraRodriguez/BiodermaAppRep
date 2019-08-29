package com.example.biodermaapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.biodermaapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MiCuenta extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_cuenta);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {

                switch (Item.getItemId()) {

                    case R.id.cuenta:

                        break;

                    case R.id.Producto:

                        Intent intent2 = new Intent(MiCuenta.this, Producto.class);
                        startActivity(intent2);
                        break;

                    case R.id.Scanner:

                        Intent intent3 = new Intent(MiCuenta.this, MiCuenta.class);
                        startActivity(intent3);
                        break;

                    case R.id.Home:

                        break;

                    case R.id.Club:
                        Intent intent5 = new Intent(MiCuenta.this, clubActivity.class);
                        startActivity(intent5);
                        break;
                }

                return false;
            }
        });





    }
}

