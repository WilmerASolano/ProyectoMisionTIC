package com.mycompany.modulo1;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    
    public Persona(){
        
    }
    
    public Persona(String nom, int edad, String doc){
        this.nombre = nom;
        this.edad = edad;
        this.dni = doc;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("edad: "+ this.edad);
        System.out.println("DNI: "+ this.dni);
    }
    
    public boolean esMayorDeEdad(){
        if (this.edad >= 18)
            return true;
        else
            return false;
    }
    
    public static void main (String args[]){
        Persona per = new Persona("Mauricio", 15, "987654123");
       
        per.mostrar();
        System.out.println("Es mayor de Edad? " + per.esMayorDeEdad());
    }
}
