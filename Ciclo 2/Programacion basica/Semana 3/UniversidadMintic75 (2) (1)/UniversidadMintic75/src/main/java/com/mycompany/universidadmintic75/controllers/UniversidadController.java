
package com.mycompany.universidadmintic75.controllers;

import com.mycompany.universidadmintic75.Principal;
import com.mycompany.universidadmintic75.models.Estudiante;
import com.mycompany.universidadmintic75.models.Facultad;
import java.util.ArrayList;


public class UniversidadController {

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
        Principal.uniMintic.getFacultades().add(facult);
    }
    
    public Facultad existeFacultad(String nombre){
        for(Facultad fac: Principal.uniMintic.getFacultades()){
           if (fac.getNombre().equals(nombre)) {
               return fac;
           }
        }
        return null;
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
        return Principal.uniMintic.getFacultades();
    }
    
}
