/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.repository;

import retocinco.model.Proveedor;
import retocinco.util.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import retocinco.model.Direccion;

/**
 *
 * @author Wilmer Solano
 */
public class ProveedorRepository {
    public boolean agregarProveedor(Proveedor prove){
        Conexion cone = new Conexion();
        try {
            String query = "INSERT INTO proveedor (razon_social,NIT,telefono,id_direccion,correo_electronico, "
                    + " representante_legal,sitio_web ) VALUES(?,?,?,?,?,?,?);";
            PreparedStatement st = cone.conexion_db.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, prove.getRazon_social());
            st.setString(2, prove.getNIT());
            st.setString(3, prove.getTelefono());
            st.setInt(4, prove.getId_direccion());
            st.setString(5, prove.getCorreo());
            st.setString(6,prove.getRepresentante());
            st.setString(7,prove.getSitio_web());
            int filInsert = st.executeUpdate();
            if(filInsert > 0){
                System.out.println("DATOS INSERTADOS EN LA BASE DE DATOS");
                return true;
            }else{
                System.out.println("NO SE INSERTO LOS DATOS");
            }
        }catch(Exception e) {
            System.out.println("Error en la agregacion "+ e.getMessage());
        }finally{
            cone.cerrarConexion();
        }
        return false;
    }
    public boolean editarProveedor(Proveedor prove){
        Conexion con = new Conexion();
        try {
           String query="UPDATE proveedor SET razon_social=?,NIT=?,telefono=?,id_direccion=? ,"
                   + "correo_electronico=?,representante_legal=?,sitio_web=? WHERE id_proveedor = ?;"; 
           PreparedStatement st = con.conexion_db.prepareStatement(query);
           st.setString(1, prove.getRazon_social());
           st.setString(2, prove.getNIT());
           st.setString(3, prove.getTelefono());
           st.setInt(4,prove.getId_direccion());
           st.setString(5, prove.getCorreo());
           st.setString(6, prove.getRepresentante());
           st.setString(7, prove.getSitio_web());
           st.setInt(8, prove.getId_proveedor());
           int filActua = st.executeUpdate();
           if(filActua > 0){
               System.out.println("DATOS ACTUALIZADOS");
               return true;
           }
           
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR EN LA ACTUALIZACION" + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return false;
    }
    public ArrayList<Direccion> listaDireccion(){
        Conexion cone = new Conexion();
        Direccion dire;
        ArrayList<Direccion> lstDireccion = new ArrayList<>();
        try {
            String query="SELECT id_direccion,calle_carrera,numero,barrio,ciudad FROM direccion;";
            PreparedStatement st = cone.conexion_db.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                dire = new Direccion();
                dire.setId_direccion(rs.getInt(1));
                dire.setCalleCarrera(rs.getString(2));
                dire.setNumero(rs.getString(3));
                dire.setBarrio(rs.getString(4));
                dire.setCiudad(rs.getString(5));
                lstDireccion.add(dire);
            }
        } catch (SQLException e) {
            System.out.println("HUBO UN ERROR EN LA LISTA " + e.getMessage());
        }finally{
            cone.cerrarConexion();
        }
        return lstDireccion;
    }
    public Proveedor buscarProveedor(int codi){
        Conexion cone = new Conexion();
        Proveedor prove = null;
        try {
            String query="SELECT razon_social,NIT,telefono,id_direccion,correo_electronico,representante_legal,sitio_web "
                    + " FROM proveedor WHERE id_proveedor = ? ";
            PreparedStatement st = cone.conexion_db.prepareStatement(query);
            st.setInt(1, codi);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
             prove = new Proveedor();
             prove.setRazon_social(rs.getString(1));
             prove.setNIT(rs.getString(2));
             prove.setTelefono(rs.getString(3));
             prove.setId_direccion(rs.getInt(4));
             prove.setCorreo(rs.getString(5));
             prove.setRepresentante(rs.getString(6));
             prove.setSitio_web(rs.getString(7));
            }
            return prove;
        } catch (SQLException e) {
            System.out.println("ERROR EN LA BUSQUEDA" + e.getMessage());
        }finally{
            cone.cerrarConexion();
        }
        return prove;
    }
    public boolean eliminarProveedor(int codi){
         boolean eliminado = false;
         Conexion cone = new Conexion();
          Proveedor prove = null;
          try {
            String query = "DELETE FROM proveedor WHERE id_proveedor=?;";
            PreparedStatement st = cone.conexion_db.prepareStatement(query);
            st.setInt(1, codi);
            int filasEliminadas = st.executeUpdate();
            if(filasEliminadas > 0){
                eliminado = true;
                return eliminado;
            }
        } catch (Exception e) {
        }finally{
              cone.cerrarConexion();
          }
         return eliminado;
    }
}
