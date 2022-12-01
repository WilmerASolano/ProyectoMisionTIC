package com.mycompany.universidadmintic75.controllers;

import com.mycompany.universidadmintic75.models.Curso;
import com.mycompany.universidadmintic75.models.Facultad;
import com.mycompany.universidadmintic75.models.Profesor;

public class FacultadController {
    private Facultad facultad;
    private UniversidadController universidadController = new UniversidadController();
    
    public FacultadController(String nombre){
        facultad = universidadController.existeFacultad(nombre);
    }
    
    public void asignarProfesor(Profesor profe){
        this.facultad.getProfesores().add(profe);
    }
    
    public void asignarProfesor(String documento, String nombre, String telefono ){
        Profesor profe = new Profesor(documento, nombre, telefono);
        this.facultad.getProfesores().add(profe);
    }
    
    public void crearCurso(Curso curso){
        this.facultad.getCursos().add(curso);
    }
    
    public Curso mostrarInformacionCurso(String codigoCurso){
        for(Curso cur: this.facultad.getCursos()){
            if( cur.getCodigo().equals(codigoCurso))
                return cur;
        }
        return null;
    }
}
