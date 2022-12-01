package com.co.biblioteca.models;

public class Capitulo {
    private int capituloId;
    private String nombre;
    private int cantidadPaginas;
    private Libro libro;

    public Capitulo() {
    }

    public Capitulo(int capituloId, String nombre, int cantidadPaginas, Libro libro) {
        this.capituloId = capituloId;
        this.nombre = nombre;
        this.cantidadPaginas = cantidadPaginas;
        this.libro = libro;
    }
    
    public Capitulo(String nombre, int cantidadPaginas, Libro libro){
        this.nombre = nombre;
        this.cantidadPaginas = cantidadPaginas;
        this.libro = libro;
    }

    public int getCapituloId() {
        return capituloId;
    }

    public void setCapituloId(int capituloId) {
        this.capituloId = capituloId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibroId(Libro libro) {
        this.libro = libro;
    }
}
