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
public class Administrativos extends Empleado{
    private String categoria;
    private ArrayList<Empleado> empleados;

    public Administrativos() {
    }

    public Administrativos(String categoria, ArrayList<Empleado> empleados, String codigoEmpleado, String moduloAsignado, String tipoEmpleado, String salarioUnico, ArrayList<Cuenta> cuentas, String nombre, String apellido, String documento, String correoElectronico) {
        super(codigoEmpleado, moduloAsignado, tipoEmpleado, salarioUnico, cuentas, nombre, apellido, documento, correoElectronico);
        this.categoria = categoria;
        this.empleados = empleados;
    }

    

    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
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
    
    
    public void mostrarDatoEmpleado(){
        for(Empleado emple: this.empleados){
            System.out.println("codigo: "+ emple.getCodigoEmpleado());
            System.out.println("nombre: "+emple.getNombre());
            System.out.println("apellido: "+emple.getApellido());
            System.out.println("documento: "+emple.getDocumento());
            System.out.println("correo electronico"+emple.getCorreoElectronico());
            System.out.println("modulo asignado: "+emple.getModuloAsignado());
            System.out.println("tipo empleado: "+emple.getTipoEmpleado());
            System.out.println("salario: "+emple.getSalarioUnico());
        }
    }
}
