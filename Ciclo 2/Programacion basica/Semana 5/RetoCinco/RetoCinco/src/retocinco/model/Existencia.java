/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.model;

/**
 *
 * @author Wilmer Solano
 */
public class Existencia {
    private int id_existencia;
    private String nombre;

    public Existencia() {
    }

    public Existencia(int id_existencia, String nombre) {
        this.id_existencia = id_existencia;
        this.nombre = nombre;
    }
    

    public Existencia( String nombre) {
        this.nombre = nombre;
    }

    public int getId_existencia() {
        return id_existencia;
    }

    public void setId_existencia(int id_existencia) {
        this.id_existencia = id_existencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
