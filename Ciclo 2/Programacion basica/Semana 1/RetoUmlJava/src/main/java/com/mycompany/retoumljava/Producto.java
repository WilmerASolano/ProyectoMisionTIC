/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retoumljava;

/**
 *
 * @author Wilmer Solano
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private String presentacion;
    private String tabla_nutricional;
    private String procedencia;
    private String tipo;
    private String empaque;
    private String fecha_vencimiento;
    private String fecha_fabricacion;
    private String registro_sanitario;

    public Producto() {
    }
    public void comprarProducto(){
        System.out.println("se esta comprando el producto");
    }
    public void observarProducto(){
        System.out.println("esta observando detalles del producto");
    }
}
