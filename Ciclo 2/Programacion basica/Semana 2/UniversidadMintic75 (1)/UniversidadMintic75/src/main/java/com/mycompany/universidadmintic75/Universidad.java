package com.mycompany.universidadmintic75;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private String telefono;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Facultad> facultades;
    
    //constructores

    public Universidad() {
    }

    public Universidad(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.estudiantes = new ArrayList<Estudiante>();
        this.facultades = new ArrayList<>();
    }

    public Universidad(String nombre, String telefono, ArrayList<Estudiante> estudiantes, ArrayList<Facultad> facultades) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.estudiantes = estudiantes;
        this.facultades = facultades;
    }
    
    //getters & Setters

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

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(ArrayList<Facultad> facultades) {
        this.facultades = facultades;
    }
    
    public void matricularEstudiante(Estudiante estudiante){
        if (!this.existeEstudiante(estudiante)){
            this.estudiantes.add(estudiante);
        }
    }
    
    public boolean existeEstudiante(Estudiante estudiante){
        for(Estudiante est: this.estudiantes){
            if (est.getCodigo().equals(estudiante.getCodigo()))
                return true;
        }
        
        return false;
    }
    
    public void crearFacultad(Facultad facult){
        this.facultades.add(facult);
    }
    
    
}
