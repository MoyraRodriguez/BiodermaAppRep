package com.example.biodermaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Producto extends AppCompatActivity {

    public static TextView nombreProducto, dataProducto, consejos,nombreComplementario;
    public static ImageView imagenProducto, productoComplementario;
    public static Button buttonProductoComplementario;
    private static Button buttonInfo,buttonBeneficios,buttonInformacion, buttonFormato;

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
    }


}
