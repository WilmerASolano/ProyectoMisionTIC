/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosretouno;

/**
 *
 * @author Wilmer Solano
 */
public class Complejo {
    int num1;
    int num2;
    int num3;
    int num4;

    public Complejo() {
    }

    public Complejo(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
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

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }
    public void sumNumCom(){
        int sum = this.num1 + this.num3;
        int sum1 = this.num2 + this.num4;
        System.out.println("la suma de los numeros complejos es: "+ sum +","+ sum1);
    }
    public void resNumCom(){
        int res = this.num1 - this.num3;
        int res1 = this.num2 - this.num4;
        System.out.println("la resta de los numeros complejos es: "+ res +","+ res1);
    }
    public void mulNumCom(){
        int mul = this.num1 * this.num3;
        int mul1 = this.num2 * this.num4;
        System.out.println("la multiplicacion de los numeros complejos es: "+ mul +","+ mul1);
    }
    public void divNumCom(){
        double div = this.num1 / this.num3;
        double  div1 = this.num2 / this.num4;
        System.out.println("la division de los numeros complejos es: "+ div +","+ div1);
    }
}
