/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpedidos.modelo;

/**
 *
 * @author Wilmer Solano
 */
public class Pago {

    private String idPago;
    private String fechaPago;
    private boolean pago;
    private Cliente idCliente;
    private Pedido idPedido;
    private double cantidadPagada;

    public Pago() {
    }

    public Pago(String idPago, String fechaPago, boolean pago, Cliente idCliente, Pedido idPedido, double cantidadPagada) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.pago = pago;
        this.idCliente = idCliente;
        this.idPedido = idPedido;
        this.cantidadPagada = cantidadPagada;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public double getCantidadPagada() {
        return cantidadPagada;
    }

    public void setCantidadPagada(double cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }
    
}
