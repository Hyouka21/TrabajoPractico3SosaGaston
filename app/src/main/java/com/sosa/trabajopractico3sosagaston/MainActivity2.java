package com.sosa.trabajopractico3sosagaston;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.sosa.trabajopractico3sosagaston.models.Pelicula;




public class MainActivity2 extends AppCompatActivity {

    private ImageView ivFoto;
    private TextView titulo,detalle,anio,duracion,genero,actores,director;
    private Pelicula p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        p = (Pelicula) getIntent().getExtras().getBundle("bundle").getSerializable("pelicula");

        inicializar();
        ivFoto.setImageResource(p.getIdFoto());
        titulo.setText(p.getTitulo());
        detalle.setText(("Descripcion \n"+p.getDescripcion()));
        anio.setText(("Estreno \n"+p.getAnioEstreno()+""));
        duracion.setText(("Duracion \n"+p.getDuracion()+" minutos"));
        genero.setText(("Genero \n"+p.getGenero()));
        actores.setText(("Actores \n"+p.getActores()));
        director.setText(("Director \n"+p.getDirector()));
    }
    public void inicializar(){
        ivFoto = findViewById(R.id.ImagenDetalle);
        titulo = findViewById(R.id.TVTituloDetalle);
        detalle = findViewById(R.id.TVDescripcionDetalle);
        anio = findViewById(R.id.TVAnio);
        duracion = findViewById(R.id.TVDuracion);
        genero = findViewById(R.id.TVGenero);
        actores = findViewById(R.id.TVActores);
        director = findViewById(R.id.TVDirector);
    }
}