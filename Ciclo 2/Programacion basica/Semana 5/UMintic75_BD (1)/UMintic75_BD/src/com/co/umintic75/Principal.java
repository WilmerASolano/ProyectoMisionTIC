package com.co.umintic75;

import com.co.umintic75.models.Facultad;
import com.co.umintic75.models.Profesor;
import com.co.umintic75.models.Universidad;
import com.co.umintic75.repository.FacultadRepository;
import com.co.umintic75.repository.ProfesorRepository;
import com.co.umintic75.views.FrmFacultades;


public class Principal {
    public static Universidad uniMintic;
            
    public static void main(String[] args){
        uniMintic = new Universidad("UNIMINTIC", "23423423424");
        
        //vamos a mostrar la ventana FrmFacultades
        FrmFacultades frmFacultades = new FrmFacultades();
        frmFacultades.setVisible(true);
        
        /*
        ProfesorRepository pr = new ProfesorRepository();
        Profesor profe = new Profesor("123", "Victo Suarez", "654656", 1);
        pr.insertarProfesor(profe);
        */
        
    } 
}

