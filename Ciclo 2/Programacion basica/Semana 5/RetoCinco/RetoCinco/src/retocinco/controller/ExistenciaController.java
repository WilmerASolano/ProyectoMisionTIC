/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.controller;

import java.util.ArrayList;
import retocinco.model.Existencia;
import retocinco.repository.ExistenciaRepository;

/**
 *
 * @author Wilmer Solano
 */

public class ExistenciaController {
    ExistenciaRepository existenciaRepository = new ExistenciaRepository();
   public void asignarExistencia(Existencia exis){
       existenciaRepository.agregarExistencia(exis);
   } 
   public Existencia existeExistencia(int codi){
       return existenciaRepository.buscarExistencia(codi);
   }
   public boolean actualizarExistencia(int id_existencia, String nombre){
       Existencia exis = new Existencia(id_existencia, nombre);
       
       return existenciaRepository.editarExistencia(exis);
   }
   public boolean eliminarExistencia(int codi){
        Existencia exis = existenciaRepository.buscarExistencia(codi);
        if (exis != null){
            existenciaRepository.eliminarExistencia(codi);
            return true;
        }
       return false; 
    }
   public ArrayList<Existencia> listaProducto(){
       return existenciaRepository.listaExistencia();
   }
}
