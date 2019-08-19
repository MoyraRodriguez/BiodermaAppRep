package com.example.biodermaapp.ajustador;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biodermaapp.Producto;
import com.example.biodermaapp.R;
import com.example.biodermaapp.entidades.ProductoComprable;

import java.util.ArrayList;

public class RecycleViewProductoDescuento extends RecyclerView.Adapter {


    private ArrayList<ProductoComprable> productos;
   private Context context;

    public RecycleViewProductoDescuento(ArrayList<ProductoComprable> productos) {

        this.productos = productos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View item = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_producto_en_descuento, viewGroup, false);
        context = viewGroup.getContext();
        ProductoVH productoVH = new ProductoVH(item);

        return productoVH;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ProductoVH productoVH = (ProductoVH) viewHolder;
        final ProductoComprable producto = productos.get(i);

        productoVH.padre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProductoComprable.class);
                context.startActivity(intent);
                Producto.nombreProducto.setText(producto.getNombreProducto());
                Producto.dataProducto.setText(producto.getInformacion());
                Producto.consejos.setText(producto.getConsejos());
            }
        });
        productoVH.nombreProdDesc.setText(producto.getNombreProducto());
        productoVH.fechaLimite.setText(producto.getFechaLimiteDescuento() +"");
        productoVH.precioProdDesc.setText(producto.getDescuentoProducto()+"");
       // productoVH.imagenProDesc.setImageResource(producto.getImagen());
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }
    public static class ProductoVH extends RecyclerView.ViewHolder {

        View padre;
        ImageView imagenProDesc;
        TextView nombreProdDesc,precioProdDesc, fechaLimite;

        public ProductoVH(@NonNull View itemView) {
            super(itemView);

            padre =itemView;

            imagenProDesc = padre.findViewById(R.id.imagenProductoDescuento);
            nombreProdDesc = padre.findViewById(R.id.tvNombreProductoDescuento);
            precioProdDesc = padre.findViewById(R.id.precioDescuento);
            fechaLimite = padre.findViewById(R.id.tvFechaLimite);
        }
    }

}
