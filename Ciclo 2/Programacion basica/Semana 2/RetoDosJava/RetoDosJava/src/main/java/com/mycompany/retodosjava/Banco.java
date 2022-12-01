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
public class Banco {

    private String nombre;
    private String nit;
    private String oficinaPrincipal;
    private String representanteLegal;
    private ArrayList<Sucursal> sucursales;
    private ArrayList<Cliente> clientes;

    public Banco() {
    }

    public Banco(String nombre, String nit, String oficinaPrincipal, String representanteLegal, ArrayList<Sucursal> sucursales, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.nit = nit;
        this.oficinaPrincipal = oficinaPrincipal;
        this.representanteLegal = representanteLegal;
        this.sucursales = sucursales;
        this.clientes = clientes;
    }

    public Banco(String nombre, String nit, String oficinaPrincipal, String representanteLegal) {
        this.nombre = nombre;
        this.nit = nit;
        this.oficinaPrincipal = oficinaPrincipal;
        this.representanteLegal = representanteLegal;
        this.sucursales = new ArrayList<Sucursal>();
        this.clientes = new ArrayList<Cliente>();
    }

    public void mostrarInformacionSucursal(Sucursal sucursal) {
        for (Sucursal sucur : this.sucursales) {
            if(sucur.getNombre().equals(sucursal.getNombre())){
            System.out.println("nombre: " + sucur.getNombre());
            System.out.println("direccion: " + sucur.getDireccion());
            System.out.println("telefono: " + sucur.getTelefono());
            System.out.println("correo electronico: s" + sucur.getCorreoElectronico());
            }else{
                System.out.println("la sucursal no se encuentra");
            }
        }
    }

    public void crearSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    public void mostrarDatoCliente(Cliente cliente) {
   
        for (Cliente cli : this.clientes) {
            if(cli.getCodigoCliente().equals(cliente.getCodigoCliente())){
            System.out.println("codigo cliente: " + cli.getCodigoCliente());
            System.out.println("nombre cliente: " + cli.getNombre());
            System.out.println("apellido cliente: " + cli.getApellido());
            System.out.println("documento cliente: " + cli.getDocumento());
            System.out.println("correo electronico: " + cli.getCorreoElectronico());
            System.out.println("fecha ingreso: " + cli.getFechaIngreso());
            System.out.println("tipo cliente: " + cli.getTipoCliente());
            }else{
                System.out.println("el cliente no existe");
            }
        }
    }
}
