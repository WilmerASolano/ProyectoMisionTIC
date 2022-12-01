/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retocinco.model;

/**
 *
 * @author jotarlo
 */
public class Producto {
    private int id_producto;
    private int codigoProducto;
    private String nombre;
    private double precioActual;
    private int id_proveedor;
    private int id_existencia;
    private int id_categoria;

    public Producto() {
    }
    
    
    public Producto(int codigoProducto, String nombre, double precioActual) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precioActual = precioActual;
    }

    public Producto(int codigoProducto, String nombre, double precioActual, int id_proveedor, int id_existencia, int id_categoria) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.id_proveedor = id_proveedor;
        this.id_existencia = id_existencia;
        this.id_categoria = id_categoria;
    }

    public Producto(String nombre, double precioActual, int id_proveedor, int id_existencia, int id_categoria) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.id_proveedor = id_proveedor;
        this.id_existencia = id_existencia;
        this.id_categoria = id_categoria;
    }

    
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_existencia() {
        return id_existencia;
    }

    public void setId_existencia(int id_existencia) {
        this.id_existencia = id_existencia;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    
    

    

  
    
}
