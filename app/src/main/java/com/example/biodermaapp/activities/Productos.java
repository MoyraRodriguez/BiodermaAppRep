package com.example.biodermaapp.activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.biodermaapp.R;
import com.example.biodermaapp.ajustador.RVProductMenuAdapter;
import com.example.biodermaapp.entidades.GamaProducto;
import com.example.biodermaapp.entidades.ProductoComprable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;

import java.util.ArrayList;

public class Productos extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;

    public ArrayList<ProductoComprable> productos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {

                switch (Item.getItemId()) {

                    case R.id.cuenta:
                        Intent intent1 = new Intent(Productos.this,MiCuenta.class);
                        startActivity(intent1);
                        break;

                    case R.id.Producto:


                        break;

                    case R.id.Scanner:

                        Intent intent3 = new Intent(Productos.this, ScannerActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.Home:
                        Intent intent4 = new Intent(Productos.this,HomeActivity.class);
                        startActivity(intent4);

                        break;

                    case R.id.Club:
                        Intent intent5 = new Intent(Productos.this, ClubActivity.class);
                        startActivity(intent5);
                        break;
                }



                return false;
            }
        });


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        navigationView.setItemIconTintList(null);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));
        productos.add(new ProductoComprable("Bioderma pr1",R.drawable.sensibio_cream,"usar en la piel","es bueno para la piel","puede comprarlo en cualquier puesto de bioderma", "formato comprable",GamaProducto.Atoderm,125.00,123.34));

        RecyclerView rvProductos = (RecyclerView) findViewById(R.id.rvProductosMenu);
        RVProductMenuAdapter rvAdapter = new RVProductMenuAdapter(this,productos);
        rvProductos.setLayoutManager(new GridLayoutManager(this,2));
        rvProductos.setAdapter(rvAdapter);




    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.product_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
