package com.co.umintic75.repository;

import com.co.umintic75.models.Facultad;
import com.co.umintic75.util.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FacultadRepository {

    public FacultadRepository() {
    }
    
    public boolean insertarFacultad(Facultad fac){
        //conectarnos la BD
        Conexion conn = new Conexion();
        try {
            //Generamos la consulta INSERT
            String query = "INSERT INTO facultad(nombre, telefono) "
                    + "values(?,?)";            
            
            //Se prepara el ambiente para ejecutar la instruccion SQL de insert
            PreparedStatement st = conn.conexion_bd.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            //Asignar los valores a la consulta INSERT =  ?, ?
            st.setString(1, fac.getNombre());
            st.setString(2, fac.getTelefono());
            
            // Ejecutar la query INSERT
            int filasInsertadas = st.executeUpdate();
            
            if ( filasInsertadas > 0){
                System.err.println("Se inserto en la BD el registro: " + fac.getNombre());
                return true;
            }else
                System.err.println("No se pudo insertar el registro: " + fac.getNombre());
        } catch (SQLException e) {
            System.err.println("Se genero un error al insertar en la BD: " + e.getMessage());
        }finally{
            conn.cerrarConexion();
        }
        
        return false;
    }
        
    public Facultad buscarFacultad(String nombre){
        Conexion conn = new Conexion();
        Facultad fac = null;
        try {
            String query = "SELECT id_facultad, nombre, telefono "
                         + "FROM facultad "
                         + "WHERE nombre = ?";
            PreparedStatement statement = conn.conexion_bd.prepareStatement(query);
            statement.setString(1,nombre);
            ResultSet rsFacultades = statement.executeQuery();
            while ( rsFacultades.next() ){
                fac = new Facultad();
                fac.setId_facultad(rsFacultades.getInt(1));
                fac.setNombre(rsFacultades.getString(2));
                //fac.setNombre(rsFacultades.getString("nombre"));
                fac.setTelefono(rsFacultades.getString(3));
            }
            return fac;      
        } catch (SQLException e) {
            System.err.println("Error al consultar la Facultad: " + e.getMessage() );
        }finally{
            conn.cerrarConexion();
        }
        return fac;
    }
    
    public ArrayList<Facultad> listaFacultades(){
        Conexion conn = new Conexion();
        Facultad fac;
        ArrayList<Facultad> lstFacultades = new ArrayList<>();
        try{
            String query = "SELECT id_facultad, nombre, telefono "
                        + "FROM facultad "
                        + "order by nombre ";
            PreparedStatement statement = conn.conexion_bd.prepareStatement(query);
            ResultSet rsFacultad = statement.executeQuery();
            while( rsFacultad.next() ){
                fac = new Facultad();
                fac.setId_facultad(rsFacultad.getInt(1));
                fac.setNombre(rsFacultad.getString(2));
                fac.setTelefono(rsFacultad.getString(3));
                lstFacultades.add(fac);
            }
        }catch(SQLException e){
            System.err.println("Se genero un erro al consultar la lista de Facultades: " + e.getMessage());
        }finally{
            conn.cerrarConexion();
        }
        return lstFacultades;
    }
    
    public boolean editarFacultad(Facultad fac){
        Conexion conn = new Conexion();
        try {
            String query = "UPDATE facultad "
                         + "SET nombre = ?," // ==> paramentro 1
                         + " telefono = ? " //  ===> parametro 2
                         + "WHERE id_facultad = ?;"; // ===> parametro 3
            PreparedStatement statement = conn.conexion_bd.prepareStatement(query);
            statement.setString(1, fac.getNombre());
            statement.setString(2, fac.getTelefono());
            statement.setInt(3, fac.getId_facultad());
            int totalFilasActualizadas = statement.executeUpdate();  //insert - update - delete
            if ( totalFilasActualizadas > 0 ){
                System.out.println("Se acutalizó la información de la Facultad");
                return true;
            }
        } catch (SQLException e) {
            System.err.println("No se pudo editar la facultad: " + e.getMessage());
        }finally{
            conn.cerrarConexion();
        }
        return false;
    }
    
    public boolean eliminarFacultad(int idFacultad){
        Conexion conn = new Conexion();
        try {
            String query = "DELETE "
                         + "FROM facultad "
                         + "WHERE id_facultad = ?";
            PreparedStatement statement = conn.conexion_bd.prepareStatement(query);
            statement.setInt(1, idFacultad);
            int totalFilasElimnados = statement.executeUpdate();
            if ( totalFilasElimnados > 0){
                System.out.println("Se eliminó la facultado con codigo " + idFacultad);
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Se genero un error al eliminar la Facultad " + e.getMessage() );
        }finally{
            conn.cerrarConexion();
        }
        return false;
    }
}
