/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.controller;

import java.util.ArrayList;
import retocinco.model.Direccion;
import retocinco.model.Proveedor;
import retocinco.repository.DireccionRepository;
import retocinco.repository.ProveedorRepository;

/**
 *
 * @author Wilmer Solano
 */
public class ProveedorController {
    ProveedorRepository proveedorRepo = new ProveedorRepository();
    DireccionRepository direccionRepo = new DireccionRepository();
    public void agregarProveedor(Proveedor prove){
        proveedorRepo.agregarProveedor(prove);
    }
    public ArrayList<Direccion> listaDireccion(){
        return proveedorRepo.listaDireccion();
    }
    public void asignarDireccion(Proveedor prove,int codi){
       Direccion dire =  direccionRepo.existeDireccion(codi);
       prove.setId_direccion(dire.getId_direccion());
       this.proveedorRepo.agregarProveedor(prove);
    }
    public boolean editarProveedor(Proveedor prove){
        return proveedorRepo.editarProveedor(prove);
    }
    public Proveedor buscarProveedor(int codi ){
        return proveedorRepo.buscarProveedor(codi);
    }
    public boolean eliminarProveedor(int codi){
        return proveedorRepo.eliminarProveedor(codi);
    }
}
