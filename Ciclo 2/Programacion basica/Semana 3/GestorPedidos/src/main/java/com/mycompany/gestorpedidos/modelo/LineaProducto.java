/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpedidos.modelo;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Solano
 */
public class LineaProducto {
    private String idLinea;
    private double precio;
    private ArrayList<Producto> productos;

    public LineaProducto() {
    }

    public LineaProducto(String idLinea, double precio) {
        this.idLinea = idLinea;
        this.precio = precio;
    }

    public LineaProducto(String idLinea, double precio, ArrayList<Producto> productos) {
        this.idLinea = idLinea;
        this.precio = precio;
        this.productos = productos;
    }

    public String getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(String idLinea) {
        this.idLinea = idLinea;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    
}
