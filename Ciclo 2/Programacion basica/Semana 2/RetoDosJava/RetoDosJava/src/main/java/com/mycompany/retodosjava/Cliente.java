/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retodosjava;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Solano
 */
public class Cliente extends Usuario{
    private String codigoCliente;
    private String fechaIngreso;
    private String tipoCliente;
private ArrayList<Cuenta> cuenta;
    public Cliente() {
    }

    public Cliente(String codigoCliente, String fechaIngreso, String tipoCliente, String nombre, String apellido, String documento, String correoElectronico) {
        super(nombre, apellido, documento, correoElectronico);
        this.codigoCliente = codigoCliente;
        this.fechaIngreso = fechaIngreso;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String codigoCliente, String fechaIngreso, String tipoCliente, ArrayList<Cuenta> cuenta, String nombre, String apellido, String documento, String correoElectronico) {
        super(nombre, apellido, documento, correoElectronico);
        this.codigoCliente = codigoCliente;
        this.fechaIngreso = fechaIngreso;
        this.tipoCliente = tipoCliente;
        this.cuenta = cuenta;
    }
    

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public ArrayList<Cuenta> getCuenta() {
        return cuenta;
    }

    public void setCuenta(ArrayList<Cuenta> cuenta) {
        this.cuenta = cuenta;
    }

    
    
    public void mostrarCuenta(){
        for(Cuenta cuen: this.cuenta){
            System.out.println("numero cuenta: "+cuen.getNumeroCuenta());
            System.out.println("saldo: "+cuen.getSaldo());
            System.out.println("codigo seguridad: "+cuen.getCodigoSeguridad());
            System.out.println("cuenta creada por: "+cuen.getEmpleado());
        }
            
    }
}
