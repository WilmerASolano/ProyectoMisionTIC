/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retodosjava;

/**
 *
 * @author Wilmer Solano
 */
public class CuentaAhorros extends Cuenta{
    private String claveRetiro;

    public CuentaAhorros() {
    }

    public CuentaAhorros(String claveRetiro, String numeroCuenta, String codigoSeguridad, Double saldo, Empleado empleado, Cliente cliente) {
        super(numeroCuenta, codigoSeguridad, saldo, empleado, cliente);
        this.claveRetiro = claveRetiro;
    }

    
    public void generarClave(){
        System.out.println("sistema generar clave");  
    }
    public void cambiarClave(){
        System.out.println("cambiar clave");
    }
}
