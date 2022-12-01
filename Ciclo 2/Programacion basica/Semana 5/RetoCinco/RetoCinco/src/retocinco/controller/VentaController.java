/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.controller;

import java.util.ArrayList;
import retocinco.model.Cliente;
import retocinco.model.Producto;
import retocinco.model.Venta;
import retocinco.repository.VentaRepository;

/**
 *
 * @author Wilmer Solano
 */
public class VentaController {
    VentaRepository ventaRepo = new VentaRepository();
    public boolean agregarVenta(Venta ven){
        return ventaRepo.agregarVenta(ven);
    }
    public ArrayList<Cliente> listaCliente(){
        return ventaRepo.listaCliente();
    }
    public ArrayList<Producto> listaProducto(){
        return ventaRepo.listaProducto();
    }
    public boolean editarVenta(Venta ven){
        return ventaRepo.editarVenta(ven);
    }
    public Venta buscarVenta(int codi){
        return ventaRepo.buscarVenta(codi);
    }
    public boolean eliminarVenta(int codi){
        return ventaRepo.eliminarVenta(codi);
    }
}
