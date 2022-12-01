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
public class Sucursal {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private ArrayList<Empleado> empleados;

    public Sucursal() {
    }

    public Sucursal(String nombre, String direccion, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.empleados = new ArrayList<Empleado>();
    }

    public Sucursal(String nombre, String direccion, String telefono, String correoElectronico, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void mostrarDatoDirector(Empleado empleado){
        for(Empleado emple: this.empleados){
            if(emple.getTipoEmpleado().equals(empleado.getTipoEmpleado())){
            System.out.println("codigo: "+ emple.getCodigoEmpleado());
            System.out.println("nombre: "+emple.getNombre());
            System.out.println("apellido: "+emple.getApellido());
            System.out.println("documento: "+emple.getDocumento());
            System.out.println("correo electronico: "+emple.getCorreoElectronico());
            }
        }
    }
    public void asignarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }
}
