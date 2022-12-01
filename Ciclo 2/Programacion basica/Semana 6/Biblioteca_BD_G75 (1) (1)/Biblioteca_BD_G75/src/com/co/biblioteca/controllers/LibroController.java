package com.co.biblioteca.controllers;

import com.co.biblioteca.models.Capitulo;
import com.co.biblioteca.models.Libro;
import com.co.biblioteca.repository.CapituloRepository;
import com.co.biblioteca.repository.LibroRepository;
import java.util.ArrayList;

public class LibroController {
    LibroRepository libroRepository = new LibroRepository();
    CapituloRepository capituloRepository = new CapituloRepository();
    
    public Libro adicionar(String titulo, String editorial, String anioPublicacion, String ISBN){
        Libro libro = new Libro(titulo, editorial, anioPublicacion, ISBN);
        return libroRepository.insertarLibro(libro);
    }
    
    public Libro adicionar(Libro libro){
        return libroRepository.insertarLibro(libro);
    }
    
    public Libro buscarLibroXTitulo(String tituo){
        return libroRepository.buscarLibroXTitulo(tituo);
    }
    
    public boolean eliminarLibro(Libro libro){
        //TODO
        return false;
    }
    
    public ArrayList<Capitulo> verCapitulosDelLibro(Libro libro){
        return capituloRepository.buscarCapitulosXLibroId(libro.getLibroId());
    }
    
    public Libro buscarLibroXId(int libroId){
        //TODO
        
        return null;
    }
}
