package com.example.biodermaapp.ajustador;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.biodermaapp.R;
import com.example.biodermaapp.activities.ProductoActivity;
import com.example.biodermaapp.entidades.ProductoComprable;

import java.util.ArrayList;

public class RVProductMenuAdapter extends RecyclerView.Adapter<RVProductMenuAdapter.ViewHolderProducts> {

    private Context mContext;
    private ArrayList<ProductoComprable> productos;

    public RVProductMenuAdapter(Context mContext, ArrayList<ProductoComprable> productos) {
        this.mContext = mContext;
        this.productos = productos;
    }

    @NonNull
    @Override
    public ViewHolderProducts onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mLayoutInflater = LayoutInflater.from(mContext);
        view = mLayoutInflater.inflate(R.layout.item_producto_rv,parent,false);
        return new ViewHolderProducts(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderProducts holder, final int position) {
        holder.nombre.setText(productos.get(position).getNombreProducto());
        holder.descripcion.setText(productos.get(position).getInformacion());
        holder.imagenProducto.setImageResource(productos.get(position).getImagen());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRV = new Intent(mContext, ProductoActivity.class);
                intentRV.putExtra("Nombre",productos.get(position).getNombreProducto());
                intentRV.putExtra("Information",productos.get(position).getInformacion());
                intentRV.putExtra("Imagen", productos.get(position).getImagen());
               intentRV.putExtra("Beneficios", productos.get(position).getBeneficios());
               intentRV.putExtra("Indicaciones",productos.get(position).getIndicaciones());
               intentRV.putExtra("Formato",productos.get(position).getFormato());
               intentRV.putExtra("Consejos",productos.get(position).getConsejos());

                mContext.startActivity(intentRV);
            }
        });

    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public static class ViewHolderProducts extends RecyclerView.ViewHolder {

        TextView nombre,descripcion;
        ImageView imagenProducto, tipo;
        CardView cardView;


        public ViewHolderProducts(@NonNull View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.tvProductNameRV);
            descripcion = (TextView) itemView.findViewById(R.id.tvProductDescRV);
            imagenProducto = (ImageView) itemView.findViewById(R.id.imageProductoRV);
            tipo = (ImageView) itemView.findViewById(R.id.imagenGamaProducto);

            cardView = itemView.findViewById(R.id.cvProductos);

        }
    }
}
