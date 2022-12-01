/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosretouno;

/**
 *
 * @author Wilmer Solano
 */
public class CuentaJoven extends Cuenta {

    byte edad;
    boolean apto;

    public CuentaJoven() {
    }

    public CuentaJoven(byte edad, boolean apto, String titular, double cantidad) {
        super(titular, cantidad);
        this.edad = edad;
        this.apto = apto;
    }

    public CuentaJoven(byte edad, boolean apto) {
        this.edad = edad;
        this.apto = apto;
    }

    public boolean esTitularValido() {
        boolean val = false;
        if (this.edad >= 18 && this.edad < 25) {
            val = true;
            this.apto = val;
        }else if (this.edad >= 25){
            val = false;
            this.apto = val;
        }
        return val;
    }


    public void puedoRetirar(double cant) {
        if (this.apto == true) {
            System.out.println("puede retirar dinero");
            //var ret = new Cuenta();
            //ret.retirar(cant);
            super.retirar(cant);
            System.out.println("su cuenta joven ahora tiene:");
            System.out.println(super.getCantidad());

        } else {
            System.out.println("usted no puede proceder a retirar");
        }
    }

    public void mostrarCuentaJoven() {
        if (this.apto == true) {
            double bono = 12345;
            System.out.println("usted es cuenta joven");
            System.out.println("usted recibe un bono por: " + bono);
            super.ingresar(bono);
            System.out.println("su cuenta queda por: " + super.getCantidad());
        }
    }

}
