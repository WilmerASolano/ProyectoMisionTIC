package com.co.biblioteca.models;

import java.util.ArrayList;

public class Libro {
    private int libroId;
    private String titulo;
    private String editorial;
    private String anioPublicacion;
    private String ISBN;
    private ArrayList<Capitulo> capitulos;
    
    //constructores
    public Libro() {
    }
    
    public Libro(int libroId){
        this.libroId = libroId;
    } 

    public Libro(int libroId, String titulo, String editorial, String anioPublicacion, String ISBN) {
        this.libroId = libroId;
        this.titulo = titulo;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.ISBN = ISBN;
    }

    public Libro(int libroId, String titulo, String editorial, String anioPublicacion, String ISBN, ArrayList<Capitulo> capitulos) {
        this.libroId = libroId;
        this.titulo = titulo;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.ISBN = ISBN;
        this.capitulos = capitulos;
    }

    public Libro(String titulo, String editorial, String anioPublicacion, String ISBN) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.ISBN = ISBN;
    }
    
    //getters & setters

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }
    
    
    
}
