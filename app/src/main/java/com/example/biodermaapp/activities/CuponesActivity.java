package com.example.biodermaapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.biodermaapp.R;
import com.example.biodermaapp.ajustador.RecycleViewProductoDescuento;
import com.example.biodermaapp.entidades.GamaProducto;
import com.example.biodermaapp.entidades.ProductoComprable;

import java.util.ArrayList;

public class CuponesActivity extends AppCompatActivity {

    public ArrayList<ProductoComprable> productos = new ArrayList<>();
    ImageButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupones);

        btnBack = findViewById(R.id.btnBackCupones);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable", GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.ATODERM,125.00,123.34));

        RecyclerView recyclerView = findViewById(R.id.rvCupones);
        RecycleViewProductoDescuento adapter = new RecycleViewProductoDescuento(productos, this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
            recyclerView.setAdapter(adapter);
    }
}
