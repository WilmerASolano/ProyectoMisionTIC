package com.mycompany.universidadmintic75;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nombre;
    //private Estudiante[] estudiantes;
    private ArrayList<Estudiante> estudiantes;
    private Profesor profesor;
    
    //constructores

    public Curso() {
    }

    public Curso(String codigo, String nombre, ArrayList<Estudiante> estudiantes, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = estudiantes;
        this.profesor = profesor;
    }
    
    //getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    public void inscribirEstudiante(Estudiante estu){
        this.estudiantes.add(estu);
    }
}
