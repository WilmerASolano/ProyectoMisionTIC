/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.repository;

import retocinco.model.Direccion;
import retocinco.util.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Wilmer Solano
 */
public class DireccionRepository {
    public boolean agregarDireccion(Direccion dire){
    Conexion con = new Conexion();
        try {
            String query = "INSERT INTO `direccion`( `calle_carrera`, `numero`, `barrio`, `ciudad`) "
                    + "VALUES (?,?,?,?);";
            PreparedStatement st = con.conexion_db.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            st.setString(1, dire.getCalleCarrera());
            st.setString(2, dire.getNumero());
            st.setString(3,dire.getBarrio());
            st.setString(4, dire.getCiudad());
            
            int filasInsertadas = st.executeUpdate();
            if (filasInsertadas > 0){
                System.out.println("DIRECCION INSERTADA");
                return true;
            }else{
                System.out.println("DIRECCION NO INSERTADA");
            }
        } catch (SQLException e) {
            System.out.println("HUBO UN ERROR AL MOMENTO DE AGREGAR LA DIRECCION " + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
       return false; 
    }
    public Direccion existeDireccion(int codi){
        Conexion con = new Conexion();
        Direccion dire = null;
        try {
            String query = "SELECT `calle_carrera`, `numero`, `barrio`, `ciudad` FROM `direccion` "
                    + " WHERE id_direccion = ? ;";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            st.setInt(1, codi);
            ResultSet rsDireccion = st.executeQuery();
            while(rsDireccion.next()){
                dire = new Direccion();
                dire.setCalleCarrera(rsDireccion.getString(1));
                dire.setNumero(rsDireccion.getString(2));
                dire.setBarrio(rsDireccion.getString(3));
                dire.setCiudad(rsDireccion.getString(4));
            }
            return dire;
        } catch (SQLException e) {
            System.out.println("HAY UN ERROR EN LA BUSQUEDA " + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return dire;
    }
    public boolean editarDireccion(Direccion dire){
        Conexion con = new Conexion();
        try {
          String query="UPDATE `direccion` SET `calle_carrera`=?,`numero`=?,`barrio`=?,`ciudad`=? WHERE `id_direccion`=?;";  
          PreparedStatement st = con.conexion_db.prepareStatement(query);
          st.setString(1, dire.getCalleCarrera());
          st.setString(2, dire.getNumero());
          st.setString(3, dire.getBarrio());
          st.setString(4, dire.getCiudad());
          st.setInt(5, dire.getId_direccion());
          int filInsertadas = st.executeUpdate();
          if(filInsertadas >0){
              System.out.println("DATOS ACTUALIZADOS");
              return true;
          }
          
        } catch (SQLException e) {
            System.out.println("ERROR AL ACTUALIZAR LOS DATOS " + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return false;
    }
    public boolean eliminarDireccion(int codi){
     Conexion con = new Conexion();
        try {
            String query ="DELETE FROM direccion where id_direccion = ? ;";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            st.setInt(1, codi);
           int filEliminado = st.executeUpdate();
           if(filEliminado > 0){
               System.out.println("SE ELIMINO LOS DATOS");
               return true;
           }
        } catch (SQLException e) {
            System.out.println("HUBO UN ERROR EN LA ELIMINACION" + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return false;
    }
    public ArrayList<Direccion> listaDireccion(){
         Conexion con = new Conexion();
         Direccion dire ;
         ArrayList<Direccion> lstDire = new ArrayList<>();
         try {
            String query = "SELECT  `calle_carrera`, `numero`, `barrio`, `ciudad` "
                    + " FROM direccion;";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                dire = new Direccion();
                
                dire.setCalleCarrera(rs.getString(2));
                dire.setNumero(rs.getString(3));
                dire.setBarrio(rs.getString(4));
                dire.setCiudad(rs.getString(5));
                lstDire.add(dire);
            }
        } catch (SQLException e) {
             System.out.println("ERROR EN LA LISTA"+ e.getMessage());
        }finally{
             con.cerrarConexion();
         }
         return lstDire;
    }
}
