package com.mycompany.modulo1;

public class Libro {
    private String titulo;
    private boolean prestado;

    public Libro(String titulo, boolean prestado) {
        this.titulo = titulo;
        this.prestado = prestado;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    public void devolucion(){
        this.prestado = false;
    }
    
    public void prestamo(){
        this.prestado = true;
    }
    
    public static void main (String args[]){
        Libro libro1 = new Libro("La biblia", false);
        Libro libro2 = new Libro("LA odisea", true);
        Libro libro3 = new Libro("Oblivion", true);
        
        System.out.println("Libro 1: " +  libro1.getTitulo());
        System.out.println("Prestado " + libro1.isPrestado());
        
        //prestar la biblia
        System.out.println("***********************");
        System.out.println("***********************");
        libro1.prestamo();
        System.out.println("Libro 1: " +  libro1.getTitulo());
        System.out.println("Prestado " + libro1.isPrestado());
        
    }
}
