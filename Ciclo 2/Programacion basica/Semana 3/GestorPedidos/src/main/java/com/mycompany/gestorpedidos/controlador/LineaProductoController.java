/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpedidos.controlador;

import com.mycompany.gestorpedidos.GestorPedidos;
import com.mycompany.gestorpedidos.modelo.LineaProducto;
import com.mycompany.gestorpedidos.modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author Wilmer Solano
 */
public class LineaProductoController {

    private LineaProducto lineaProducto;
    private Producto producto;

    public LineaProductoController() {
    }

    public void agregarProducto(Producto producto) {
        this.lineaProducto.getProductos().add(producto);
    }

    public Producto mostrarProducto(String idProducto) {
        for (Producto pro : this.lineaProducto.getProductos()) {
            if (pro.getIdProducto().equals(idProducto)) {
                return pro;
            }

        }
        return null;
    }

    public ArrayList<Producto> getListaProductos() {
        return this.lineaProducto.getProductos();

    }
}
