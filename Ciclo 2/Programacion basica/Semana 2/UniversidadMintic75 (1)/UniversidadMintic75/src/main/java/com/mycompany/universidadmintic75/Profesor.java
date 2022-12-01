package com.mycompany.universidadmintic75;

//extends => Herencia
public class Profesor extends Persona {
    private String documento;

    public Profesor() {
    }

    public Profesor(String documento, String nombre, String telefono) {
        super(nombre, telefono);
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }   
    
//    public String getNombre(){
//        return super.getNombre();
//    }
}

