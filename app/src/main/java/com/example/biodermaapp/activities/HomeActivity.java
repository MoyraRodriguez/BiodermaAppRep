package com.example.biodermaapp.activities;

import android.animation.ArgbEvaluator;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.example.biodermaapp.R;
import com.example.biodermaapp.ajustador.AdapterCardView;
import com.example.biodermaapp.entidades.ProductoComprable;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    ViewPager viewPager;
    AdapterCardView adapter;
    List<ProductoComprable> productos;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        productos = new ArrayList<>();
        productos.add(new ProductoComprable("Pasta dental",R.drawable.sensibio_cream,"Ejasdanoasndaodnosdnao"));
        productos.add(new ProductoComprable("Waifu barata",R.drawable.sensibio_eye,"Ejasdanoasndaodnosdnao"));
        productos.add(new ProductoComprable("Perro",R.drawable.sensibio_mousant,"Ejasdanoasndaodnosdnao"));

        adapter = new AdapterCardView(productos,this);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (adapter.getCount() -1) ) {


                }

                else {

                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }


}
