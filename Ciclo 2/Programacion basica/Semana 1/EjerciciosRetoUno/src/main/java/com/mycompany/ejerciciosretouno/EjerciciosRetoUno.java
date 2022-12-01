/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejerciciosretouno;

/**
 *
 * @author Wilmer Solano
 */
public class EjerciciosRetoUno {

    public static void main(String[] args) {
         
        //INVOCANDO EJERCICIO NUMERO UNO
        String nombre = "jose lopez";
        byte edad = 12;
        int dni = 123213;
        Persona persona = new Persona(nombre,edad,dni);
        persona.mostrar();
        System.out.println(persona.esMayorDeEdad());
        
        
        /*
        //INVOCANDO EJERCICIO NUMERO DOS
        String titular = "michael perez";
        double cant = 3500;
        double cantA = 1000;
        double cantR = 2000;
        Cuenta cuenta = new Cuenta(titular, cant);
        cuenta.mostrar();
        System.out.println("ingresando dinero: ");
        cuenta.ingresar(cantA);
        System.out.println("valores despues del ingreso del dinero");
        cuenta.mostrar();
        System.out.println("retirar dinero");
        cuenta.retirar(cantR);
        System.out.println("valores despues del retiro del dinero");
        cuenta.mostrar();
         */
         /* 
        //INVOCANDO EJERCICIO NUMERO TRES
        String titular = "armando hernandez";
        double cantidad = 2000;
        double cantidadRe = 1000;
        byte edad = 24;
        boolean apto = false;
        CuentaJoven cuentajoven = new CuentaJoven(edad, apto, titular, cantidad);
        System.out.println("Es titular valido?:  ");
        System.out.println(cuentajoven.esTitularValido());
        System.out.println("El titular puede retirar: ");
        cuentajoven.puedoRetirar(cantidadRe);
        cuentajoven.mostrarCuentaJoven();
*/
          /* 
        String libro = "el grito";
        boolean prestado = false;
         Libro libroej = new Libro(libro,prestado);
         System.out.println("Libro: " + libroej.getTitulo());
         System.out.println("Esta prestado: "+ libroej.isPrestado());
         
         System.out.println("PRESTACION: ");
         libroej.prestamo();
         System.out.println("libro: "+ libroej.getTitulo());
         System.out.println("Esta prestado: "+ libroej.isPrestado());
         
         System.out.println("DEVOLUCION: ");
         libroej.devolucion();
         System.out.println("libro: "+ libroej.getTitulo());
         System.out.println("Esta prestado: "+ libroej.isPrestado());
         */
          
         /* 
         //INVOCANDO EJERCICIO NUMERO TRES SEIS
         int num1 = 3;
         int num2 = 2;
         int num3 = 8;
         int num4 = 5;
         Complejo complejo = new Complejo(num1,num2,num3,num4);
         complejo.sumNumCom();
         complejo.resNumCom();
         complejo.mulNumCom();
         complejo.divNumCom();
         */
        /* 
         //INVOCANDO EJERCICIO NUMERO CINCO
    int num1 = 12;
    int num2 = 10;
    Fraccion fra = new Fraccion(num1,num2);
    fra.sumar();
    fra.resta();
    fra.multi();
    fra.divi();
    
    //INVOCANDO EJERCICIO NUMERO SIETE
    String fecha = "2020-12-20";
    Fecha fech = new Fecha(fecha);
    fech.comprobarFecha();
    //fech.modificar();
         */
    //CLASE EJERCICIO OCHO SE LLAMA EMPLEADO EN ELLA ESTA LOS ATRIBUTOS Y EL ATRIBUTO ESTATICO
    }
}
