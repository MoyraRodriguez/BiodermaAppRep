package com.example.biodermaapp.ajustador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.biodermaapp.R;
import com.example.biodermaapp.entidades.ProductoComprado;

import java.util.ArrayList;

public class RVHistorialAdapter extends RecyclerView.Adapter {

    private ArrayList<ProductoComprado> productos;
    private Context context;

    public RVHistorialAdapter(ArrayList<ProductoComprado> productos, Context context) {
        this.productos = productos;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mLayoutInflater = LayoutInflater.from(context);
        view = mLayoutInflater.inflate(R.layout.historial_rv_card,parent,false);
        return new HistorialVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        HistorialVH historialVH = (HistorialVH) holder;
        ProductoComprado producto = productos.get(position);
       historialVH.nombre.setText(producto.getNombreProducto());
       historialVH.precio.setText(producto.getPrecio() + "");
       historialVH.cantidad.setText(producto.getCantVecesComprado() + "");
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }
    public  static  class HistorialVH extends RecyclerView.ViewHolder{
       View padre;
       TextView nombre, precio, cantidad;

        public HistorialVH(@NonNull View itemView) {
            super(itemView);
            padre = itemView;
            nombre = padre.findViewById(R.id.nombreProdRVHistorial);
            precio = padre.findViewById(R.id.precioProductoHistorial);
            cantidad =padre.findViewById(R.id.cantVecesCompradoHistorial);

        }
    }
}
