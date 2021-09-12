package com.sosa.trabajopractico3sosagaston.viewmodel;

import androidx.lifecycle.ViewModel;

import com.sosa.trabajopractico3sosagaston.R;
import com.sosa.trabajopractico3sosagaston.models.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class PeliculaViewModel extends ViewModel {
    ArrayList<Pelicula> lista;
    public PeliculaViewModel() {
         lista = new ArrayList<Pelicula>();
        lista.add(new Pelicula(1,"Matrix",	1999,"Keanu Reeves\n Laurence Fishburne\n Carrie-Anne Moss",220,"Ciencia Ficcion",
                "Hermanas Wachowski", "Thomas Anderson (Keanu Reeves) es programador informático de día y un hacker llamado Neo de noche. Lleva toda su vida intuyendo que hay algo más, que hay algo que falla y esa duda se ve reafirmada con un mensaje recibido en su ordenador: «Matrix te posee». Así, Neo comienza la búsqueda desesperada de una persona de la que solo ha oído hablar: otro hacker llamado Morfeo (Laurence Fishburne), alguien que puede darle la respuesta a las preguntas que persigue: ¿qué es Matrix? y ¿por qué lo posee?", R.drawable.matrix1));
        lista.add(new Pelicula(2,"Interstellar",	2014,"Matthew McConaughey\n Anne Hathaway\n Matt Damon",190,"Ciencia Ficcion",
                "Christopher Nolan", "En 2067, la destrucción de las cosechas en la Tierra ha hecho que la agricultura sea cada vez más difícil y se vea amenazada la supervivencia de la humanidad. Joseph Cooper, viudo, exingeniero y piloto de la NASA, dirige una granja con su suegro Donald, su hijo Tom y su hija Murph, quien cree que su habitación está embrujada por un poltergeist. Cuando aparecen inexplicablemente extraños patrones de polvo en el suelo de la habitación de Murph, Cooper se da cuenta de que la gravedad está detrás de su formación, no un \"fantasma\". Interpreta el patrón como un conjunto de coordenadas geográficas formadas en código binario. Cooper y Murph siguen las coordenadas a una instalación secreta de la NASA, donde se encuentran con el exprofesor de Cooper, el doctor Brand.", R.drawable.interstellar1));
        lista.add(new Pelicula(3,"El origen",	2010,"Leonardo DiCaprio\n Joseph Gordon-Levitt\n Cillian Murphy",240,"Ciencia Ficcion",
                "Christopher Nolan", "Dom Cobb es un ladrón con una extraña habilidad para entrar a los sueños de la gente y robarles los secretos de sus subconscientes. Su habilidad lo ha vuelto muy popular en el mundo del espionaje corporativo, pero ha tenido un gran costo en la gente que ama", R.drawable.origen1));
        lista.add(new Pelicula(4,"Prometeo",	2012,"Noomi Rapace\n Michael Fassbender\n Charlize Theron",220,"Ciencia Ficcion",
                "Ridley Scott", "Una pista sobre los orígenes de la humanidad lleva a un grupo de exploradores al espacio exterior, donde deben librar una terrible batalla para salvar el futuro de la raza humana.", R.drawable.prometeo));

    }
    public ArrayList<Pelicula> getPeliculas() {
        if (lista == null) {
            lista = new ArrayList<>();
        }
        return lista;
    }

    public void setPeliculas(ArrayList<Pelicula> listas) {
        this.lista = listas;
    }

    public Pelicula obtenerXId(int id) {
        Pelicula peli = null;
        for (Pelicula p: lista) {
            if (id == p.getId()) {
                peli = p;
            }
        }
        return peli;
    }
}
