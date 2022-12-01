/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.controller;

import java.util.ArrayList;
import retocinco.model.Cliente;
import retocinco.model.Direccion;
import retocinco.repository.ClienteRepository;

/**
 *
 * @author Wilmer Solano
 */

public class ClienteController {
 ClienteRepository clienteRepo = new ClienteRepository();
    public void agregarCliente(Cliente clie){
        clienteRepo.agregarCliente(clie);
    }
    public boolean editarCliente(Cliente clien){
        return clienteRepo.editarCliente(clien);
    }
    public Cliente buscarCliente(String num){
        return clienteRepo.buscarCliente(num);
    }
     public ArrayList<Direccion> listaDireccion(){
        return clienteRepo.listaDireccion();
    }
    public boolean eliminarCliente(String num){
        return clienteRepo.eliminarCliente(num);
    }
}
