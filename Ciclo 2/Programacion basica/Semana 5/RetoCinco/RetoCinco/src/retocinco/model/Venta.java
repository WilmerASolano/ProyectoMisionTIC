/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.model;

import java.util.Date;

/**
 *
 * @author Wilmer Solano
 */
public class Venta {
    private int id_venta;
    private String fecha_venta;
    private int id_cliente;
    private double valor_descuento;
    private double valor_total;
    private int id_producto;

    public Venta() {
    }

    public Venta(int id_venta, String fecha_venta, int id_cliente, double valor_descuento, double valor_total, int id_producto) {
        this.id_venta = id_venta;
        this.fecha_venta = fecha_venta;
        this.id_cliente = id_cliente;
        this.valor_descuento = valor_descuento;
        this.valor_total = valor_total;
        this.id_producto = id_producto;
    }

    public Venta(String fecha_venta, int id_cliente, double valor_descuento, double valor_total, int id_producto) {
        this.fecha_venta = fecha_venta;
        this.id_cliente = id_cliente;
        this.valor_descuento = valor_descuento;
        this.valor_total = valor_total;
        this.id_producto = id_producto;
    }

   

    
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getValor_descuento() {
        return valor_descuento;
    }

    public void setValor_descuento(double valor_descuento) {
        this.valor_descuento = valor_descuento;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

  
}
