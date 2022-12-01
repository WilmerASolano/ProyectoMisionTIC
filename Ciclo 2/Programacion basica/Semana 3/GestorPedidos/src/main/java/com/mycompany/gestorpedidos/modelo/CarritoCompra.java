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
public class CarritoCompra {
    private String idCarro;
    private String fechaCreacion;
    private ArrayList<LineaProducto> lineasProductos;

    public CarritoCompra() {
    }

    public CarritoCompra(String idCarro, String fechaCreacion, ArrayList<LineaProducto> lineasProductos) {
        this.idCarro = idCarro;
        this.fechaCreacion = fechaCreacion;
        this.lineasProductos = lineasProductos;
    }

    public String getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(String idCarro) {
        this.idCarro = idCarro;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public ArrayList<LineaProducto> getLineasProductos() {
        return lineasProductos;
    }

    public void setLineasProductos(ArrayList<LineaProducto> lineasProductos) {
        this.lineasProductos = lineasProductos;
    }
    
}
