package com.mycompany.universidadmintic75;

import com.mycompany.universidadmintic75.models.Universidad;
import com.mycompany.universidadmintic75.views.FrmFacultades;

public class Principal {
    public static Universidad uniMintic;
            
    public static void main(String[] args){
        uniMintic = new Universidad("UNIMINTIC", "23423423424");
        
        //vamos a mostrar la ventana FrmFacultades
        FrmFacultades frmFacultades = new FrmFacultades();
        frmFacultades.setVisible(true);
        
    } 
}

