package com.sosa.trabajopractico3sosagaston;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sosa.trabajopractico3sosagaston.adapters.PeliculaAdapter;
import com.sosa.trabajopractico3sosagaston.models.Pelicula;
import com.sosa.trabajopractico3sosagaston.viewmodel.PeliculaViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView RVPeliculas;
    PeliculaAdapter peliculaAdapter;
    PeliculaViewModel pViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pViewModel = new PeliculaViewModel();
        RVPeliculas = findViewById(R.id.RVPelicula);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );
        RVPeliculas.setLayoutManager(linearLayoutManager);
        peliculaAdapter = new PeliculaAdapter( pViewModel.getPeliculas(),this,getLayoutInflater());
        RVPeliculas.setAdapter(peliculaAdapter);
    }
}