package com.example.biodermaapp;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewNivelesClub extends RecyclerView.Adapter<RecyclerViewNivelesClub.ViewHolder> {

    private static final  String TAG = "RecyclerViewAdaprter";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private Context context;

    public RecyclerViewNivelesClub(ArrayList<String> mNames, ArrayList<String> mImages, Context context) {
        this.mNames = mNames;
        this.mImages = mImages;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.niveles_iconos_row,viewGroup,false);
        return  new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {


        //viewHolder.image.setImageResource(mImages.get(i));
        viewHolder.text.setText(mNames.get(i));

    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView text;

        public ViewHolder (@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.IconoNivel);
            text = itemView.findViewById(R.id.IconoNombre);
        }
    }
}
