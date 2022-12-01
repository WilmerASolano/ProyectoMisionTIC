package com.mycompany.modulo1;

public class Cuenta2 {

    private String titular;
    private double cantidad;
    
    public Cuenta2() {
    }

    public Cuenta2(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }   

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void mostrar(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Cantidad: " + this.cantidad);
    }
    
    public void ingresar(double cantidad){
        if (cantidad > 0)
            this.cantidad += cantidad;
    }
    
    public void retirar(double cantidad){
        this.cantidad -= cantidad;
    }
    
    
    public static void main (String args[]){
        Cuenta2 cuenta = new Cuenta2("Mauricio", 1500);
        
        System.out.println("Al abrir la cuenta");
        cuenta.mostrar();
        
        System.out.println("Al consignar 1000");
        cuenta.ingresar(1000);
        cuenta.mostrar();
        
        System.out.println("Al retirar 5800");
        cuenta.retirar(5800);
        cuenta.mostrar();
        
        Cuenta2 otraCuenta = new Cuenta2("Jorge", 8000);
        otraCuenta.mostrar();
    }
    
    
}
