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
public class ClienteJuridico extends Cliente{
    private String razonSocial;
    private String NIT;

    public ClienteJuridico() {
    }

    public ClienteJuridico(String razonSocial, String NIT, String idCliente, String direccion, String telefono, String email) {
        super(idCliente, direccion, telefono, email);
        this.razonSocial = razonSocial;
        this.NIT = NIT;
    }

    public ClienteJuridico(String razonSocial, String NIT, String idCliente, String direccion, String telefono, String email, ArrayList<Pedido> pedidos, CarritoCompra carritoCompra, ArrayList<Pago> pagos) {
        super(idCliente, direccion, telefono, email, pedidos, carritoCompra, pagos);
        this.razonSocial = razonSocial;
        this.NIT = NIT;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    
}
