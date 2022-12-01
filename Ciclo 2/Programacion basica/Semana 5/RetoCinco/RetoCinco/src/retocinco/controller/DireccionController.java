/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.controller;

import java.util.ArrayList;
import retocinco.model.Direccion;
import retocinco.repository.DireccionRepository;
import retocinco.util.Conexion;

/**
 *
 * @author Wilmer Solano
 */
public class DireccionController {
    DireccionRepository direccionRepository = new DireccionRepository();
    public void agregarDireccion(Direccion dire){
        direccionRepository.agregarDireccion(dire);
    }
    public Direccion existeDireccion(int codi){
        return direccionRepository.existeDireccion(codi);
    }
    public boolean editarDireccion(int id_dire,String nombre,String num,String barr,String ciu){
        Direccion dire = new Direccion(id_dire, nombre, num, barr, ciu);
        return direccionRepository.editarDireccion(dire);
    }
    public boolean eliminarDireccion(int codi){
        Direccion dire = direccionRepository.existeDireccion(codi);
        if(dire !=  null){
            direccionRepository.eliminarDireccion(codi);
            return true;
        }
        return false;
    }
    public ArrayList<Direccion> listaDirecciones(){
        return direccionRepository.listaDireccion();
    }
}
