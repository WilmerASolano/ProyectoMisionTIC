/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpedidos.controlador;

import com.mycompany.gestorpedidos.modelo.CarritoCompra;
import com.mycompany.gestorpedidos.modelo.LineaProducto;
import com.mycompany.gestorpedidos.modelo.Producto;

/**
 *
 * @author Wilmer Solano
 */
public class CarritoCompraController {
    private CarritoCompra carritocompra;
    private LineaProducto lineaProductos;
    public void agregarLinea(LineaProducto lineapro){
        this.carritocompra.getLineasProductos().add(lineapro);
    }
    public LineaProducto mostrarLinea(String codi){
        for(LineaProducto lipro: this.carritocompra.getLineasProductos()){
            if(lipro.getIdLinea().equals(codi))
                return lipro;
        }
        return null;
    }
    public boolean eliminaLinea(String cod){
        LineaProducto linea = this.mostrarLinea(cod);
        if(linea != null){
            this.carritocompra.getLineasProductos().remove(linea);
        }
        return false;
    }
}
