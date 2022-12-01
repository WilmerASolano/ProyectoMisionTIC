package com.mycompany.modulo1;

public class Cuenta {
    // Atributos de clase (instancia)
    private String numero;
    private double saldo;
    private String tipo;
    
    //Constructor: Permite crear instancias el objeto
    public Cuenta(){
    }
    
    // Constructor con todos los parámetros
    public Cuenta(String num, double valor, String tipo){
        this.numero = num;
        this.saldo = valor;
        this.tipo = tipo;
    }
    
    //Metodos Accesores: son metodos que devuleven los datos de los atributos
    // Getters y Setters
    //Getter => obtener dato
    //Setter => modificar el dato
    
    //Getter   private String numero;
    public String getNumero(){
        return this.numero;
    }
    
    //Setter 
    public void setNumero( String num ){
        this.numero = num;
    }
    
    // getter private double saldo;
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double valor){
        this.saldo = valor;
    }
            
    public String getTipo(){
        return this.tipo;
    }        
    
    public void setTipo( String tipo){
        this.tipo = tipo;
    }
    
    public double retirar(double cantidad){
        this.saldo -= cantidad;
        return this.saldo;
    }   
    
    public void consignar( double cantidad){
        this.saldo = this.saldo + cantidad;
        //this.saldo += cantidad
    }
    
}
