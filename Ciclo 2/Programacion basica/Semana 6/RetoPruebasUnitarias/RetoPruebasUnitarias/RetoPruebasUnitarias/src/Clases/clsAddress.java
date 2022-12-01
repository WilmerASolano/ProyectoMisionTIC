/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USUARIO
 */
public class clsAddress {

    private String street;
    private int number;
    private boolean avenue;

    public clsAddress() {
    }

    
    public clsAddress(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getAddress() {
        String address = this.street + " # " + this.number + (this.avenue ? " AV" : "");
        return address;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @param avenue the avenue to set
     */
    public void setAvenue(boolean avenue) {
        this.avenue = avenue;
    }
}
