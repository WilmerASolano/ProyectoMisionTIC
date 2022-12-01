package com.co.biblioteca;

import com.co.biblioteca.models.Capitulo;
import com.co.biblioteca.models.Libro;
import com.co.biblioteca.repository.CapituloRepository;
import com.co.biblioteca.repository.LibroRepository;

public class Main {

    public static void main(String[] args) {
        /*
        Libro l = new Libro("EL VIEJO", "Prisma", "1980", "65654564654");
        LibroRepository lr = new LibroRepository();
        l = lr.insertarLibro(l);
        System.out.println("EL id del libro " + l.getTitulo() + " es " + l.getLibroId());
        */     
        
        Capitulo c = new Capitulo("Cociendo el lugar", 10, new Libro(1));
        CapituloRepository cr = new CapituloRepository();
        c = cr.insertarCapitulo(c);
        System.out.println("Se inserto el capitulo con ID " + c.getCapituloId());
        
        
        LibroRepository lr = new LibroRepository();
        Libro l = lr.buscarLibroXTitulo("LA CUEVA");
        
        System.out.println(l.getLibroId());
        System.out.println(l.getTitulo());
        System.out.println(l.getEditorial());
        for ( Capitulo cap: l.getCapitulos())
            System.out.println("Capitulos " + cap.getNombre());
    }
    
}
