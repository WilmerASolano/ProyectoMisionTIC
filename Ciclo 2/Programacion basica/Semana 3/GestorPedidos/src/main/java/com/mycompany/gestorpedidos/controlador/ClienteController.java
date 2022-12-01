/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpedidos.controlador;

import com.mycompany.gestorpedidos.modelo.CarritoCompra;
import com.mycompany.gestorpedidos.modelo.Cliente;
import com.mycompany.gestorpedidos.modelo.LineaProducto;
import com.mycompany.gestorpedidos.modelo.Pago;
import com.mycompany.gestorpedidos.modelo.Pedido;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;


/**
 *
 * @author Wilmer Solano
 */
public class ClienteController {
    private Cliente cliente;
    private CarritoCompra carritocompra;
    public void realizarPago(Pago pago){
        this.cliente.getPagos().add(pago);
    }
    public void realizarPedido(Pedido pedido){
        this.cliente.getPedidos().add(pedido);
     
    }
    public void mostrarProductosCarrito(){
       this.cliente.getCarritoCompra();
    }
    public void transformarFecha(){
        try{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = carritocompra.getFechaCreacion();
        Date fechaAct = formato.parse(fecha);
       
        }catch(Exception e){
                
         }
    }
    public boolean existeExpiracionCarro(CarritoCompra carritocompra){
        try{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = carritocompra.getFechaCreacion();
        Date fechaAct = formato.parse(fecha);
       Calendar calendar = Calendar.getInstance();
       Date fechaHoy = calendar.getTime();
        if(fechaAct.compareTo(fechaAct) > 0) {
            return true;
        }

        }catch(Exception e){
                
         }
        return false; 
        }
}
