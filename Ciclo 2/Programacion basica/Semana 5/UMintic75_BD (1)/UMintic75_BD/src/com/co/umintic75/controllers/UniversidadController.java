
package com.co.umintic75.controllers;

import com.co.umintic75.Principal;
import com.co.umintic75.models.Estudiante;
import com.co.umintic75.models.Facultad;
import com.co.umintic75.repository.FacultadRepository;
import java.util.ArrayList;


public class UniversidadController {
    FacultadRepository facultadRepository = new FacultadRepository();

    public UniversidadController() {
    }
    
    
    public boolean existeEstudiante(Estudiante estudiante){
        for(Estudiante est: Principal.uniMintic.getEstudiantes()){
            if (est.getCodigo().equals(estudiante.getCodigo()))
                return true;
        }
        return false;
    }
    
    public void matricularEstudiante(Estudiante estudiante){
        if (!this.existeEstudiante(estudiante)){
            Principal.uniMintic.getEstudiantes().add(estudiante);
        }
    }
    
    
    public void crearFacultad(Facultad facult){
        facultadRepository.insertarFacultad(facult);
    }
    
    public Facultad existeFacultad(String nombre){
        return facultadRepository.buscarFacultad(nombre);
    }
    
    public boolean eliminarFacultad(String nombre){
        Facultad fac = this.existeFacultad(nombre);
        if (fac != null){
            Principal.uniMintic.getFacultades().remove(fac);
            return true;
        }
        return false;
    }
    
    public ArrayList<Facultad> getListaFacultades(){
        return facultadRepository.listaFacultades();
    }
    
    public boolean editarFacultad(int idFac, String nombre, String tel){
        Facultad fac = new Facultad(idFac, nombre, tel);
        return facultadRepository.editarFacultad(fac);
    }
    
}
