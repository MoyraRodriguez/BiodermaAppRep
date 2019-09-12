package com.example.biodermaapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.biodermaapp.R;
import com.example.biodermaapp.ajustador.RVHistorialAdapter;
import com.example.biodermaapp.entidades.GamaProducto;
import com.example.biodermaapp.entidades.ProductoComprado;

import java.util.ArrayList;

public class HistorialActivity extends AppCompatActivity {

    public ArrayList<ProductoComprado> productoComprados = new ArrayList<>();
    ImageButton backHistorial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        RecyclerView recyclerView = findViewById(R.id.rvHistorial);

        backHistorial = findViewById(R.id.btnBackHistorial);

        backHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,15,13));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,84));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,13,38));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,354));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,3453));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,3657));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,76543));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,13,63));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,56,8));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,34,23));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,31));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,15,13));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,84));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,13,38));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,354));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,3453));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,3657));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,76543));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,13,63));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,56,8));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,34,23));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,31));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,15,13));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,84));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,13,38));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,354));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,3453));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,3657));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,76543));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,13,63));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,56,8));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,34,23));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,31));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,15,13));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,84));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,13,38));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,354));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,3453));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,14,3657));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,76543));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,13,63));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,56,8));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,34,23));
        productoComprados.add(new ProductoComprado("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34,12,31));

        RVHistorialAdapter adapter = new RVHistorialAdapter(productoComprados,this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        recyclerView.setAdapter(adapter);
    }
}
