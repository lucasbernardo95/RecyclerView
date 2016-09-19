package com.example.lber.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * Created by lber on 19/09/2016.
 */
public class LivroAdapter extends RecyclerView.Adapter {

    List<Livro> lista;
    Context context;

    public LivroAdapter(List<Livro> lista, Context context){
        this.lista = lista;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.livro_item_inflater, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {

        ViewHolder holder = (ViewHolder) viewHolder;

        Livro escolhido = lista.get(i);
        holder.textViewTitulo.setText(escolhido.getTitulo());
        holder.textViewAutor.setText(escolhido.getAutor());
        holder.textViewQuantidade.setText(""+escolhido.getQuantidade());

        if(escolhido.getLido() == true){
            holder.img.setImageResource(R.drawable.open);
        }else{
            holder.img.setImageResource(R.drawable.flat);
        }
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}