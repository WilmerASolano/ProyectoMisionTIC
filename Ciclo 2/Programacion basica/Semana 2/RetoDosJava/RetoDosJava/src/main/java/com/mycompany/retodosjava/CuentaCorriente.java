/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retodosjava;

/**
 *
 * @author Wilmer Solano
 */
public class CuentaCorriente extends Cuenta {

    private String Pin;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String Pin, String numeroCuenta, String codigoSeguridad, Double saldo, Empleado empleado, Cliente cliente) {
        super(numeroCuenta, codigoSeguridad, saldo, empleado, cliente);
        this.Pin = Pin;
    }

   

    public void cambiarPin() {
        System.out.println("cambiar pin");
    }

    public void realizarMovimiento() {
        System.out.println("realizar movimiento");
    }

    public void asignarCheque() {
        System.out.println("asignar cheque");
    }
}
