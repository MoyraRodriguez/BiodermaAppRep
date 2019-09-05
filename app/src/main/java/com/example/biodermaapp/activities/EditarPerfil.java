package com.example.biodermaapp.activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.biodermaapp.R;
import com.example.biodermaapp.ScannerActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class EditarPerfil extends AppCompatActivity {

    Dialog dialog;

    Button btnCerrarSesion, btnCerrarSesionPopUp;
    ImageView close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);




        dialog = new Dialog(this);
        btnCerrarSesion = (Button) findViewById(R.id.buttonCerrarSesion);
        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowPopUp();
            }
        });



    }


    public void ShowPopUp(){

        dialog.setContentView(R.layout.pop_up_close_session);
        close = (ImageView) dialog.findViewById(R.id.cerrarPopUpSesion);
        btnCerrarSesionPopUp = (Button) dialog.findViewById(R.id.buttonCerrarSesionPopUp) ;

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        btnCerrarSesionPopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EditarPerfil.this, LogInActivity.class));
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }


}
