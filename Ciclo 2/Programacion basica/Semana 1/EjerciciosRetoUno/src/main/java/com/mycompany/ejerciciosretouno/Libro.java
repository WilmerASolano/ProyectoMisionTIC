/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosretouno;

/**
 *
 * @author Wilmer Solano
 */
public class Libro {
    private String titulo;
    private boolean prestado;

    public Libro(String titulo, boolean prestado) {
        this.titulo = titulo;
        this.prestado = prestado;
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

    public Libro() {
    }
    public void devolucion(){
        this.prestado = false;
    }
    
    public void prestamo(){
        this.prestado = true;
    }
}
