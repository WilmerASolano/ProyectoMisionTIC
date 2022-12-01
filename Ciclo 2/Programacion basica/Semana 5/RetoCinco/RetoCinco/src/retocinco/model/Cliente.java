/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.model;

/**
 *
 * @author Wilmer Solano
 */
public class Cliente {
    private int id_cliente;
    private String documento_identidad;
    private String nombre;
    private String apellido;
    private int id_direccion;
    private String correo_electronico;

    public Cliente() {
    }

    public Cliente(String documento_identidad, String nombre, String apellido, int id_direccion, String correo_electronico) {
        this.documento_identidad = documento_identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_direccion = id_direccion;
        this.correo_electronico = correo_electronico;
    }

    public Cliente(int id_cliente, String documento_identidad, String nombre, String apellido, int id_direccion, String correo_electronico) {
        this.id_cliente = id_cliente;
        this.documento_identidad = documento_identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_direccion = id_direccion;
        this.correo_electronico = correo_electronico;
    }

    public Cliente(String nombre, String apellido, int id_direccion, String correo_electronico) {
        this.documento_identidad = documento_identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_direccion = id_direccion;
        this.correo_electronico = correo_electronico;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDocumento_identidad() {
        return documento_identidad;
    }

    public void setDocumento_identidad(String documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
    
}
