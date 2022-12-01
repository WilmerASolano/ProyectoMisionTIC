package com.mycompany.universidadmintic75.models;

public class Estudiante extends Persona {
    private String codigo;

    public Estudiante(){
        
    }
    
    public Estudiante(String codigo) {
        this.codigo = codigo;
    }

    public Estudiante(String codigo, String nombre, String telefono) {
        super(nombre, telefono);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
