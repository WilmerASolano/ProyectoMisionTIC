/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.model;

/**
 *
 * @author Wilmer Solano
 */
public class Direccion {
   private int id_direccion;
   private String calleCarrera;
   private String numero;
   private String barrio;
   private String ciudad;

    public Direccion() {
    }

    public Direccion(int id_direccion, String calleCarrera, String numero, String barrio, String ciudad) {
        this.id_direccion = id_direccion;
        this.calleCarrera = calleCarrera;
        this.numero = numero;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }
    public Direccion( String calleCarrera, String numero, String barrio, String ciudad) {
        this.calleCarrera = calleCarrera;
        this.numero = numero;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCalleCarrera() {
        return calleCarrera;
    }

    public void setCalleCarrera(String calleCarrera) {
        this.calleCarrera = calleCarrera;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
   
}
