/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.retodosjava;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Solano
 */
public class RetoDosJava {

    public static void main(String[] args) {
      //Crear Banco sin sucursales ni clientes
      //se agrega nombre banco,nit,oficina central,representante legal
      Banco banco = new Banco("banco bogota","123456","calle140","arturo sanchez");
      //se crea una sucursal sin empleados
      Sucursal sucur = new Sucursal("norte","calle 170 ","434324","sucurnorte@banco.com");
      //se agrega sucursales al banco 
      banco.crearSucursal(sucur);
      //se crea empleados
      Empleado empleado = new Empleado("1","23","cajero ","12345",new ArrayList<Cuenta>(),"jose","lopez","12345","jose@correo.com");
      //se agrega empleados a la sucursal 
       sucur.asignarEmpleado(empleado);
      //se crean clientes
      Cliente cliente = new Cliente("321","27/07/2022","cliente frecuente","roberto","carlos","7975533","roberto@correo.com");
      //se crean cuentas 
      Cuenta cuenta = new Cuenta("345","455",2.000,empleado,cliente);
      //se agrega la cuenta al cliente
      empleado.crearCuenta(cuenta);
      //se realiza ingreso y retiro de dinero de cuentas 
      cuenta.ingresarDinero(3000);
      cliente.mostrarCuenta();
      cuenta.retirarDinero(1200);
      cliente.mostrarCuenta();
      //mostrar dato director
      Administrativos admin = new Administrativos("director",new ArrayList<Empleado>(),"3234","central","director","50000",new ArrayList<Cuenta>(),"luis","sanchez","432433","directluis@correo.com");
      sucur.asignarEmpleado(admin);
      admin.mostrarDatoEmpleado();
      
    }
}
