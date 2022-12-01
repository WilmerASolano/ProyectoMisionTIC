/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retodosjava;

/**
 *
 * @author Wilmer Solano
 */
public class Cuenta {

    private String numeroCuenta;
    private String codigoSeguridad;
    private Double saldo;
    private Empleado empleado;
    private Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, String codigoSeguridad, Double saldo, Empleado empleado, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.codigoSeguridad = codigoSeguridad;
        this.saldo = saldo;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void ingresarDinero(double valor) {
        double res = this.saldo = this.saldo + valor;
        System.out.println("su cuanta con el ingreso queda en: " + res);
    }

    public void retirarDinero(double valor) {
        double res = this.saldo = this.saldo - valor;
        System.out.println("su cuenta ahora con el retiro  queda en: " + res);
    }
}
