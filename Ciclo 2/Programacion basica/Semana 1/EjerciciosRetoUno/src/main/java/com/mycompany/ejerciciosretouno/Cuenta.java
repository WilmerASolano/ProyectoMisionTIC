/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosretouno;

/**
 *
 * @author Wilmer Solano
 */
public class Cuenta {
    private String titular;
    private double cantidad;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta() {
    }
    public void mostrar(){
        System.out.println("titular: "+ this.titular);
        System.out.println("cantidad: "+ this.cantidad);
    }
    public void ingresar(double cant){
        if(cant >0){
            this.cantidad = this.cantidad + cant;
            
        }
    }
    public void retirar(double cant){
        this.cantidad = this.cantidad - cant;
    }
}
