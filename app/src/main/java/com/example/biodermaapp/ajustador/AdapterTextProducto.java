package com.example.biodermaapp.ajustador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.biodermaapp.R;
import com.example.biodermaapp.entidades.ProductoComprable;

import java.util.List;

public class AdapterTextProducto extends PagerAdapter {

    private List<String> productText;
    private LayoutInflater layoutInflater;
    private Context context;

    public AdapterTextProducto(List<String> productText, Context context) {
        this.productText = productText;
        this.context = context;
    }

    @Override
    public int getCount() {
        return productText.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.card_text_producto, container, false);

        TextView desc  ;
        desc = view.findViewById(R.id.textProducto);
        desc.setText(productText.get(position));

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
