/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosretouno;

/**
 *
 * @author Wilmer Solano
 */
public class Fraccion {
    private  int num1;
    private int num2;

    public Fraccion() {
    }

    public Fraccion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void sumar(){
        int suma = this.num1 + this.num2;
        System.out.println(suma);
    }
    public void resta(){
        int resta = this.num1 - this.num2;
        System.out.println(resta);
    }
    public void multi(){
        int multi = this.num1 * this.num2;
        System.out.println(multi);
        
    }
    public void divi(){
        double divi = this.num1 / this.num2;
        System.out.println(divi);
    }
}
