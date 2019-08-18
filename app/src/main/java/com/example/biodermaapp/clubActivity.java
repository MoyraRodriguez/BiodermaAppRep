package com.example.biodermaapp;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biodermaapp.entidades.ClientePrueba;

public class clubActivity extends AppCompatActivity {
    int BionCoins;
    private ClientePrueba cliente;
    private RecyclerView recyclerView;
    TextView CantidadBioncoins, NombreNivel, DescripNivel;
    ImageView Icono;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        SubidaDeNivel();
        cliente = new ClientePrueba("Pepe", "jojojojo22","elpeposo@app.com");
        cliente.setBioCoins(1200);
        BionCoins = cliente.getBioCoins();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)


    private void Recycle(){
        recyclerView = findViewById(R.id.Recycle);
        int[] images = {R.drawable.ic_bronce_no_seleccionado,
                R.drawable.ic_plata_no_seleccionado,
                R.drawable.ic_oro_no_seleccionado,
                R.drawable.ic_platino_no_seleccionado,
                R.drawable.ic_diamante_no_seleccionado


        };
    }







    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void SubidaDeNivel(){

        NombreNivel = findViewById(R.id.NombreNivel);
        DescripNivel=findViewById(R.id.DescNivel);
        CantidadBioncoins = findViewById(R.id.CantidadCoins);
        Icono = findViewById(R.id.Nivel);
        CantidadBioncoins.setText(BionCoins + "BC");

        //if's que cambiaran en orden de subida de nivel

        //de bronce a plata


        if(BionCoins >= 1000 && BionCoins < 2500){
            Icono.setImageDrawable(getDrawable(R.drawable.ic_plata_no_seleccionado));
            NombreNivel.setText("Plata");
            DescripNivel.setText("Consigue 2500 BioCoins para llegar a oro");

        }

        //de plata a oro
        if(BionCoins >= 2500 && BionCoins < 5000){
            Icono.setImageDrawable(getDrawable(R.drawable.ic_oro_no_seleccionado));
            NombreNivel.setText("Oro");
            DescripNivel.setText("Consigue 5000 BioCoins para llegar a platino");

        }

        //de oro a platino
        if(BionCoins >= 5000 && BionCoins < 7500){
            Icono.setImageDrawable(getDrawable(R.drawable.ic_plata_no_seleccionado));
            NombreNivel.setText("Platino");
            DescripNivel.setText("Consigue 7500 BioCoins para llegar a diamante");

        }

        //de platino a diamante
        if(BionCoins >= 7500 ){
            Icono.setImageDrawable(getDrawable(R.drawable.ic_diamante_no_seleccionado));
            NombreNivel.setText("Diamante");
            DescripNivel.setText("Felicidades tienes el nivel mas alto");

        }


    }
}
