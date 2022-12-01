package com.co.umintic75.models;

//extends => Herencia
public class Profesor extends Persona {
    private String documento;
    private int id_facultad;

    public Profesor() {
    }

    public Profesor(String documento, String nombre, String telefono) {
        super(nombre, telefono);
        this.documento = documento;
    }

    public Profesor(String documento, String nombre, String telefono, int id_facultad) {
        super(nombre, telefono);
        this.documento = documento;
        this.id_facultad = id_facultad;
    }
    
    

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }   

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }
    
    
    
}

