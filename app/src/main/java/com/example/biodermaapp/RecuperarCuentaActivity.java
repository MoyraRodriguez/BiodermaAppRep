package com.example.biodermaapp;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RecuperarCuentaActivity extends AppCompatActivity {

    Dialog dialog;

  Button btnEnviar;
  ImageView close_pop_up;
  TextView titulo, descripcion;
  boolean CorreoConfirmado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_cuenta);

        dialog = new Dialog(this);
        btnEnviar = (Button) findViewById(R.id.buttonEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //si el correo es aceptado CorreoConfirmado pasa a ser true

                if(CorreoConfirmado = false) {

                    ShowPopUpWaiting();
                } else {
                    ShowPopUpActive();
                }
            }
        });
    }

    public void ShowPopUpWaiting(){

        dialog.setContentView(R.layout.pop_up_confirmacion_cuenta);
        close_pop_up = (ImageView) dialog.findViewById(R.id.close_pop_up);
        titulo = (TextView) dialog.findViewById(R.id.titulo);
        descripcion = (TextView) dialog.findViewById(R.id.descripcion);

        close_pop_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void ShowPopUpActive(){

    }
}
