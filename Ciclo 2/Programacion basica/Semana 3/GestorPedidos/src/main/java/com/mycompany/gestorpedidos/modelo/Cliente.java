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
public class Cliente {
    private String idCliente;
    private String direccion;
    private String telefono;
    private String email;
    private ArrayList<Pedido> pedidos;
    private CarritoCompra carritoCompra;
    private ArrayList<Pago> pagos;

    public Cliente() {
    }

    public Cliente(String idCliente, String direccion, String telefono, String email) {
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Cliente(String idCliente, String direccion, String telefono, String email, ArrayList<Pedido> pedidos, CarritoCompra carritoCompra, ArrayList<Pago> pagos) {
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.pedidos = pedidos;
        this.carritoCompra = carritoCompra;
        this.pagos = pagos;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public CarritoCompra getCarritoCompra() {
        return carritoCompra;
    }

    public void setCarritoCompra(CarritoCompra carritoCompra) {
        this.carritoCompra = carritoCompra;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }
    
}
