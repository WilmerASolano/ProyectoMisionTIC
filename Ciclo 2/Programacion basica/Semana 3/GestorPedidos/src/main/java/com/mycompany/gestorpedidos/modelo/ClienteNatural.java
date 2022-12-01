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
public class ClienteNatural extends Cliente {
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    public ClienteNatural() {
    }

    public ClienteNatural(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String idCliente, String direccion, String telefono, String email) {
        super(idCliente, direccion, telefono, email);
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public ClienteNatural(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String idCliente, String direccion, String telefono, String email, ArrayList<Pedido> pedidos, CarritoCompra carritoCompra, ArrayList<Pago> pagos) {
        super(idCliente, direccion, telefono, email, pedidos, carritoCompra, pagos);
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
}
