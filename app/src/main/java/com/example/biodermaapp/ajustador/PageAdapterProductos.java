package com.example.biodermaapp.ajustador;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.biodermaapp.Tab1Producto;
import com.example.biodermaapp.Tab2Producto;
import com.example.biodermaapp.Tab3Producto;
import com.example.biodermaapp.Tab4Producto;

public class PageAdapterProductos extends FragmentStatePagerAdapter {

    int numberPages;

    public PageAdapterProductos(FragmentManager fm, int numberPages) {
        super(fm);
        this.numberPages = numberPages;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 :
                Tab1Producto tab1 = new Tab1Producto();
                return tab1;

            case 1 :
                Tab2Producto tab2 = new Tab2Producto();
                return tab2;

            case 2 :
                Tab3Producto tab3 = new Tab3Producto();
                return tab3;

            case 3 :
                Tab4Producto tab4 = new Tab4Producto();
                return tab4;

                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return numberPages;
    }
}
