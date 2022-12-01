/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.model;

/**
 *
 * @author Wilmer Solano
 */
public class Proveedor {
    private int id_proveedor;
    private String razon_social;
    private String NIT;
    private String telefono;
    private int id_direccion;
    private String correo;
    private String representante;
    private String sitio_web;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String razon_social, String NIT, String telefono, int id_direccion, String correo, String representante, String sitio_web) {
        this.id_proveedor = id_proveedor;
        this.razon_social = razon_social;
        this.NIT = NIT;
        this.telefono = telefono;
        this.id_direccion = id_direccion;
        this.correo = correo;
        this.representante = representante;
        this.sitio_web = sitio_web;
    }

    public Proveedor(String razon_social, String NIT, String telefono, String correo, String representante, String sitio_web) {
        this.razon_social = razon_social;
        this.NIT = NIT;
        this.telefono = telefono;
        this.correo = correo;
        this.representante = representante;
        this.sitio_web = sitio_web;
    }

    public Proveedor(String razon_social, String NIT, String telefono, int id_direccion, String correo, String representante, String sitio_web) {
        this.razon_social = razon_social;
        this.NIT = NIT;
        this.telefono = telefono;
        this.id_direccion = id_direccion;
        this.correo = correo;
        this.representante = representante;
        this.sitio_web = sitio_web;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getSitio_web() {
        return sitio_web;
    }

    public void setSitio_web(String sitio_web) {
        this.sitio_web = sitio_web;
    }
}
