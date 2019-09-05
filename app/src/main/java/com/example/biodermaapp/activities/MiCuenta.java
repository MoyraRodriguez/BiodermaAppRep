package com.example.biodermaapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biodermaapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MiCuenta extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Button EditarCuenta, CerrarSesion, CerrarSesionEnPopUp;
    ImageView close_pop_up;
    TextView titulo, descripcion;
    TextView correo, telef, fechaNac,lugar;
    Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_cuenta);
        dialog = new Dialog(this);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        EditarCuenta = findViewById(R.id.buttonEditarCuenta);
        CerrarSesion = findViewById(R.id.buttonCerrarSesion);
        correo = findViewById(R.id.tvCorreo);
        telef = findViewById(R.id.telefonoMICuenta);
        fechaNac = findViewById(R.id.fechaNacMICuenta);
        lugar = findViewById(R.id.lugarOrigenMICuenta);


        CerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowPopUpWaiting();

            }
        });

        EditarCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editar = new Intent(MiCuenta.this, EditarPerfil.class);
                startActivity(editar);

            }
        });

        Intent intent = getIntent();

        if(intent.getExtras() != null) {
            correo.setText(intent.getExtras().getString("Nuevo Correo"));
            telef.setText(intent.getExtras().getString("Nuevo Telefono"));
            fechaNac.setText(intent.getExtras().getString("Nueva FechaNac"));
            lugar.setText(intent.getExtras().getString("Nueva Ubicacion"));
        }
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {

                switch (Item.getItemId()) {

                    case R.id.cuenta:

                        break;

                    case R.id.Producto:

                        Intent intent2 = new Intent(MiCuenta.this, ProductMenu.class);
                        startActivity(intent2);
                        break;

                    case R.id.Scanner:

                        Intent intent3 = new Intent(MiCuenta.this, ScannerActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.Home:
                        Intent intent4 = new Intent(MiCuenta.this, HomeActivity.class);
                        startActivity(intent4);

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



    public void ShowPopUpWaiting(){

        dialog.setContentView(R.layout.pop_up_close_session);
        close_pop_up = (ImageView) dialog.findViewById(R.id.cerrarPopUpSesion);
        titulo = (TextView) dialog.findViewById(R.id.cerrarSesionText);
        descripcion = (TextView) dialog.findViewById(R.id.textoDeCerrarSesion);
        CerrarSesionEnPopUp = dialog.findViewById(R.id.buttonCerrarSesionPopUp);

        CerrarSesionEnPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cerrar = new Intent(MiCuenta.this, LogInActivity.class);
                startActivity(cerrar);

            }
        });



        close_pop_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}

