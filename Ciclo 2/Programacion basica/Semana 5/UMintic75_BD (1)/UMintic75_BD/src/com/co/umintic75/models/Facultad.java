package com.co.umintic75.models;

import java.util.ArrayList;

public class Facultad {
    private int id_facultad;
    private String nombre;
    private String telefono;
    //private ArrayList<TipoDato> Variable;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    
    //Constructores

    public Facultad() {
    }
    
    public Facultad(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public Facultad(String nombre, String telefono, ArrayList<Profesor> profesores, ArrayList<Curso> cursos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.profesores = profesores;
        this.cursos = cursos;
    }

    public Facultad(int idFac, String nombre, String tel) {
        this.id_facultad = idFac;
        this.nombre = nombre;
        this.telefono = tel;
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

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }
    
    
}
