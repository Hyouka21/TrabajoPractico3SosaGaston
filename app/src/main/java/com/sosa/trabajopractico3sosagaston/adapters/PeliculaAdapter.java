package com.sosa.trabajopractico3sosagaston.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.sosa.trabajopractico3sosagaston.MainActivity2;
import com.sosa.trabajopractico3sosagaston.R;
import com.sosa.trabajopractico3sosagaston.models.Pelicula;

import java.util.ArrayList;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.MiViewHolder> {
    private ArrayList<Pelicula> lista;
    private Context context;
    private LayoutInflater inflater;

    public PeliculaAdapter(ArrayList<Pelicula> lista, Context context, LayoutInflater inflater) {
        this.lista = lista;
        this.context = context;
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_pelicula, parent, false);
        return new MiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        Pelicula p = lista.get(position);
        holder.TVTitulo.setText("Titulo: "+p.getTitulo());
        holder.TVDescripcion.setText("Descripcion: "+p.getDescripcion());
        holder.imagenPelicula.setImageResource(p.getIdFoto());
        holder.BTDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("pelicula",p);
                intent.putExtra("bundle", bundle);
                context.startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return lista.size();
    }
    public class MiViewHolder extends RecyclerView.ViewHolder {


        private TextView TVTitulo, TVDescripcion;
        private ImageView imagenPelicula;
        private Button BTDetalle;


        public MiViewHolder(@NonNull View itemView) {
            super(itemView);

            TVTitulo = itemView.findViewById(R.id.TVTitulo);
            imagenPelicula = itemView.findViewById(R.id.ImagenPelicula);
            TVDescripcion = itemView.findViewById(R.id.TVDescripcion);
            BTDetalle = itemView.findViewById(R.id.BTDetalle);
        }
    }
}
