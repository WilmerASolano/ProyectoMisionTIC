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
public class Empleado extends Usuario {
   public String codigoEmpleado;
    public String moduloAsignado;
    public String tipoEmpleado;
    public String salarioUnico;
   public ArrayList<Cuenta> cuentas;
  
 public Empleado() {
    }

    public Empleado(String codigoEmpleado, String moduloAsignado, String tipoEmpleado, String salarioUnico, ArrayList<Cuenta> cuentas, String nombre, String apellido, String documento, String correoElectronico) {
        super(nombre, apellido, documento, correoElectronico);
        this.codigoEmpleado = codigoEmpleado;
        this.moduloAsignado = moduloAsignado;
        this.tipoEmpleado = tipoEmpleado;
        this.salarioUnico = salarioUnico;
        this.cuentas = cuentas;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

  
    
   
    

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getModuloAsignado() {
        return moduloAsignado;
    }

    public void setModuloAsignado(String moduloAsignado) {
        this.moduloAsignado = moduloAsignado;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getSalarioUnico() {
        return salarioUnico;
    }

    public void setSalarioUnico(String salarioUnico) {
        this.salarioUnico = salarioUnico;
    }
public void crearCuenta(Cuenta cuen){
this.cuentas.add(cuen);
}
   
}
