package com.mycompany.universidadmintic75;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private String telefono;
    //private ArrayList<TipoDato> Variable;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    
    //Constructores

    public Facultad() {
    }

    public Facultad(String nombre, String telefono, ArrayList<Profesor> profesores, ArrayList<Curso> cursos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.profesores = profesores;
        this.cursos = cursos;
    }
    
    //getter y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void asignarProfesor(Profesor profe){
        this.profesores.add(profe);
    }
        
    public void asignarProfesor(String documento, String nombre, String telefono){
        //instanciar profesor
        Profesor profe = new Profesor(documento, nombre, telefono);
        this.profesores.add(profe);
    }
   
    public void crearCurso(Curso curso){
        //TODO
    }
    
    public void mostrarInformacionCurso(){
        //TODO
    }
    
    public void asignarCursoProfesor(Curso curso, Profesor profe){
        //TODO
    }
    
    public void inscribirEstudianteCurso(Curso curso, Estudiante estudiante){
        //TODO
    }
    
    public void cursosPorEstudiante(String codigoEstudiante){
        //TODO
    }
    
    public void mostrarProfesores(){
        //TODO
    }
}
