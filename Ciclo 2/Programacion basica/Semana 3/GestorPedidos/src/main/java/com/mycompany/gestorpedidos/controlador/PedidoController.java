/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpedidos.controlador;

import com.mycompany.gestorpedidos.modelo.Envio;
import com.mycompany.gestorpedidos.modelo.Pago;
import com.mycompany.gestorpedidos.modelo.Pedido;

/**
 *
 * @author Wilmer Solano
 */
public class PedidoController {
    private Pedido pedido;
    
   
    public boolean existePago(Pago pago){
       for(Pago pag : this.pedido.getPagos()){
           if(pag.isPago()== true)
               return true;
           
       }
       return false;
    }
     public void realizarEnvio(Envio envio,Pago pago){
        if(!this.existePago(pago)){
        this.pedido.getEnvios().add(envio);}
    }
}
