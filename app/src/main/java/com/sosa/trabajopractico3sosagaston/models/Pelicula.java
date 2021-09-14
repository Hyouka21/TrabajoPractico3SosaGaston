package com.sosa.trabajopractico3sosagaston.models;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private int id;
    private String titulo;
    private int anioEstreno;
    private String actores;
    private int duracion;
    private String genero;
    private String director;
    private String descripcion;
    private int idFoto;

    public Pelicula(int id,String titulo, int anioEstreno, String actores, int duracion, String genero, String director, String descripcion,int idFoto) {
        this.id = id;
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.actores = actores;
        this.duracion = duracion;
        this.genero = genero;
        this.director = director;
        this.descripcion = descripcion;
        this.idFoto= idFoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
