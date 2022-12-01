package com.mycompany.universidadmintic75;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        System.out.println("Hola UMintic");
        
        //crear algunas facultades
        //instanciar las facultades
        Facultad facCiencias = new Facultad("Ciencias", "123", new ArrayList<Profesor>(), new ArrayList<Curso>());
        Facultad facMatematicas = new Facultad("Matematicas", "345345", new ArrayList<Profesor>(), new ArrayList<Curso>());
        
        //Crear la universidad 
        Universidad uniMintic = new Universidad("Universidad Mintic 2022", "232342424");
        System.out.println("Nombre de la U: " + uniMintic.getNombre());
        System.out.println("Facultades: " + uniMintic.getFacultades().size());
        
        //Adicionar las facultades
        uniMintic.crearFacultad(facCiencias);
        uniMintic.crearFacultad(facMatematicas);
        
        
        //Mostrar la información de las facultades
        for (int pos=0; pos < uniMintic.getFacultades().size(); pos++){
            System.out.println("------con for nomal ----------------");
            System.out.println("Facultad:" + uniMintic.getFacultades().get(pos).getNombre());
            System.out.println("TElefono:" + uniMintic.getFacultades().get(pos).getTelefono());
        }
        
        // for each 
        for(Facultad fac: uniMintic.getFacultades()){
            System.out.println("---------con for each-------------");
            System.out.println("Facultad:" + fac.getNombre());
            System.out.println("TElefono:" + fac.getTelefono());
        }
        
        //Matricular un estudiante
        //Instancia
        Estudiante estu = new Estudiante("1", "Juan Perez", "345678");
        Estudiante estu2 = new Estudiante("2", "Lina Rojas", "876543");
        
        //Matricularlo en la universidad
        uniMintic.matricularEstudiante(estu);
        uniMintic.matricularEstudiante(estu2);
        
        //Mostrar los estudiantes matriculados en la universidad
        System.out.println("--- LISTADO DE DE ESTUDIANTES ----");
        for(Estudiante est: uniMintic.getEstudiantes()){
            System.out.println("Estudiante: " + est.getNombre());
            System.out.println("TElefono: " + est.getTelefono());
            System.out.println("Codigo: " + est.getCodigo());
        }
        
        //Nuevo Estudiante
        Estudiante est3 = new Estudiante("34567", "Pedro PErez", "324234");
        uniMintic.matricularEstudiante(est3);
        
        //Mostrar los estudiantes matriculados en la universidad
        System.out.println("--- LISTADO DE DE ESTUDIANTES ----");
        for(Estudiante est: uniMintic.getEstudiantes()){
            System.out.println("Estudiante: " + est.getNombre());
            System.out.println("TElefono: " + est.getTelefono());
            System.out.println("Codigo: " + est.getCodigo());
        }
        
        
        //Adicionar un profesor a una facultad
        Profesor profe = new Profesor("43646", "Luis Cardona", "234234234");
        
        
        //lo vamos a adicionar a la facultad de ciencias
        uniMintic.getFacultades().get(0).asignarProfesor(profe);
        
        
        //Mostrar los profesores de la facultad de ciencias
        Facultad facultCiencias = uniMintic.getFacultades().get(0);
        System.out.println("Total de profesore: " + facultCiencias.getProfesores().size());
        
        
    }
}
