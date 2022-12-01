/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorpedidos.modelo;

/**
 *
 * @author Wilmer Solano
 */
public class Envio {
    private String idEnvio;
    private String direccionFacturacion;
    private boolean finalizado;
    private String fechaEnvio;
    private String compania;
    private Pedido pedido;

    public Envio() {
    }

    public Envio(String idEnvio, String direccionFacturacion, boolean finalizado, String fechaEnvio, String compania, Pedido pedido) {
        this.idEnvio = idEnvio;
        this.direccionFacturacion = direccionFacturacion;
        this.finalizado = finalizado;
        this.fechaEnvio = fechaEnvio;
        this.compania = compania;
        this.pedido = pedido;
    }

    public String getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

   
    
    
}
