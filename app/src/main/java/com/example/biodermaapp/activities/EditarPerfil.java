package com.example.biodermaapp.activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.biodermaapp.R;

public class EditarPerfil extends AppCompatActivity {

    Dialog dialog;

    Button btnCerrarSesion, btnCerrarSesionPopUp, guardarCambios;
    ImageButton backEditar;
    EditText correo, telefono, fechaNac,ubicación, nombre;
    RadioGroup genero;
    ImageView close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);

        backEditar = findViewById(R.id.flechaBackEditarPerfil);
        backEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        Initializate();


        dialog = new Dialog(this);
        btnCerrarSesion = (Button) findViewById(R.id.buttonCerrarSesion);
        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowPopUp();
            }
        });



    }
    public void Initializate(){
        nombre = findViewById(R.id.etNombreEditar);
        correo = findViewById(R.id.editTextCambiarCorreo);
        telefono = findViewById(R.id.editTextCambiarCelular);
        fechaNac = findViewById(R.id.editTextCambiarFechaNacimiento);
        ubicación = findViewById(R.id.editTextCambiarLugarOrigen);
        guardarCambios = (Button) findViewById(R.id.btnGuardar);
    }
    public void ChangeActivities(View view){
        Initializate();
        final String nNombre = nombre.getText().toString();
        final String nCorreo = correo.getText().toString();
        final String nTelefono = telefono.getText().toString();
        final String nFechaNac = fechaNac.getText().toString();
        final String nUbicacion = ubicación.getText().toString();

        if(nombre.getText().toString().isEmpty()|| correo.getText().toString().isEmpty()|| telefono.getText().toString().isEmpty()
                || fechaNac.getText().toString().isEmpty()|| ubicación.getText().toString().isEmpty()){
            Toast.makeText(this, "Debe Llenar todos los datos", Toast.LENGTH_SHORT).show();
        }else {
            Intent intentChange = new Intent(EditarPerfil.this, MiCuenta.class);
            intentChange.putExtra("Nuevo Nombre", nNombre);
            intentChange.putExtra("Nuevo Correo", nCorreo);
            intentChange.putExtra("Nuevo Telefono", nTelefono);
            intentChange.putExtra("Nueva FechaNac", nFechaNac);
            intentChange.putExtra("Nueva Ubicacion", nUbicacion);
            startActivity(intentChange);
        }

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
