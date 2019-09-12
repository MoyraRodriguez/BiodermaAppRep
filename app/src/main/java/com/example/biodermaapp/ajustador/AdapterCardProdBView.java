package com.example.biodermaapp.ajustador;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biodermaapp.R;
import com.example.biodermaapp.entidades.ProductoBioderma;

import java.util.List;

public class AdapterCardProdBView extends PagerAdapter{

    private List<ProductoBioderma> productos;
    private LayoutInflater layoutInflater;
    private Context context;

    public AdapterCardProdBView(List<ProductoBioderma> productos, Context context) {
        this.productos = productos;
        this.context = context;
    }



    @Override
    public int getCount() {
        return productos.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.product_home_card, container, false);

        ImageView imageView;
        TextView title, desc;

        imageView = view.findViewById(R.id.image);
        title = view.findViewById(R.id.title);
        desc = view.findViewById(R.id.desc);

        //imageView.setImageResource(productos.get(position).getImageLinks()[0].);
        title.setText(productos.get(position).getTitle());
        desc.setText(productos.get(position).getDescription());


        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
