package com.co.biblioteca.repository;

import com.co.biblioteca.models.Capitulo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CapituloRepository {

    public CapituloRepository() {
    }
    
    //insert
    public Capitulo insertarCapitulo(Capitulo cap){
        //Conectarnos a la BDs
        Conexion conn = new Conexion();
        try{
            //crear la consulta Insert
            String query = "INSERT INTO capitulo(nombre, cantidad_paginas, libro_id) "
                        + "values(?,?,?)";
            
            //Preparar el ambiente de BDs para ejecutar la consulta
            PreparedStatement st = conn.abrirConexion().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            //setear parametros
            st.setString(1, cap.getNombre());
            st.setInt(2, cap.getCantidadPaginas());
            st.setInt(3, cap.getLibro().getLibroId());
            
            //Ejecutar la Consulta
            int filasInsertadas = st.executeUpdate();
            if ( filasInsertadas > 0 ){
                ResultSet rsCapitulo = st.getGeneratedKeys();
                if ( rsCapitulo.next() ){
                    cap.setCapituloId( rsCapitulo.getInt(1) );
                    System.out.println("El ID del Capitulo es " + cap.getCapituloId());
                    return cap;
                }
            }
            
        }catch(SQLException e){
            System.out.println("No se pudo insertar el registro: " + e.getMessage());
        }finally{
            conn.cerrarConexion();
        }
        return null;
    }
    
    public boolean insertarCapitulo(String nombre, int paginas, int libroID){
        return false;
    }
    
    public ArrayList<Capitulo> buscarCapitulosXLibroId(int libroId){
        ArrayList<Capitulo> listaCapitulos = new ArrayList<>();
        Conexion conn = new Conexion();
        try {
            String query = "select nombre, cantidad_paginas "
                        + "from capitulo "
                        + "where libro_id = ?";
            PreparedStatement st = conn.abrirConexion().prepareStatement(query);
            st.setInt(1, libroId);
            ResultSet rsCapitulo = st.executeQuery();
            while ( rsCapitulo.next() ){
                Capitulo cap = new Capitulo();
                cap.setNombre( rsCapitulo.getString("nombre"));
                cap.setCantidadPaginas( rsCapitulo.getInt("cantidad_paginas"));
                listaCapitulos.add(cap);
            }
            
        } catch (SQLException e) {
        }finally{
            conn.cerrarConexion();
        }
        return listaCapitulos;
    }
}
