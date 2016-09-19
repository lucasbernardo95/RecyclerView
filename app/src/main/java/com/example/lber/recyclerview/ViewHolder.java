package com.example.lber.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lber on 19/09/2016.
 */
public class ViewHolder extends RecyclerView.ViewHolder {

    final TextView textViewTitulo;
    final TextView textViewAutor;
    final TextView textViewQuantidade;
    final ImageView img;


    public ViewHolder(View v) {
        super(v);

        this.textViewTitulo = (TextView) v.findViewById(R.id.titulo);
        this.textViewAutor = (TextView) v.findViewById(R.id.autor);;
        this.textViewQuantidade = (TextView) v.findViewById(R.id.quantidade);;
        this.img = (ImageView) v.findViewById(R.id.img);

    }
}
