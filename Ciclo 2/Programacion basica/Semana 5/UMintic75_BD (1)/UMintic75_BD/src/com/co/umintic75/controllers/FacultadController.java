package com.co.umintic75.controllers;

import com.co.umintic75.models.Curso;
import com.co.umintic75.models.Facultad;
import com.co.umintic75.models.Profesor;
import com.co.umintic75.repository.FacultadRepository;
import com.co.umintic75.repository.ProfesorRepository;

public class FacultadController {
    private Facultad facultad;
    private UniversidadController universidadController = new UniversidadController();
    private ProfesorRepository profesorRepository = new ProfesorRepository();
    private FacultadRepository facultadRepository = new FacultadRepository();
    
    public FacultadController(String nombre){
        facultad = universidadController.existeFacultad(nombre);
    }
    
    public void asignarProfesor(Profesor profe){
        this.facultad.getProfesores().add(profe);
    }
    
    public void asignarProfesor(Profesor profe, String nombreFacultad){
        //busqueme facultad
        Facultad fac = facultadRepository.buscarFacultad(nombreFacultad);
        profe.setId_facultad(fac.getId_facultad());
        this.profesorRepository.insertarProfesor(profe);
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
