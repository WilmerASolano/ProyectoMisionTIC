/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.repository;

import retocinco.model.Cliente;
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
public class ClienteRepository {
    public boolean agregarCliente(Cliente clie){
        Conexion con = new Conexion();
        try {
            String query="INSERT INTO cliente(documento_identidad,nombre,apellido,id_direccion,correo_electronico)  "
                    + " VALUES(?,?,?,?,?);";
            PreparedStatement st = con.conexion_db.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            st.setString(1, clie.getDocumento_identidad());
            st.setString(2,clie.getNombre());
            st.setString(3, clie.getApellido());
            st.setInt(4, clie.getId_direccion());
            st.setString(5, clie.getCorreo_electronico());
            int filInserta = st.executeUpdate();
            if(filInserta >0){
                System.out.println("SE INSERTARON LOS DATOS");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("HUBO UN PROBLEMA EN LA INSERCION" + e.getMessage());
            
        }finally{
            con.cerrarConexion();
        }
        return false;
    }
   
    public boolean editarCliente(Cliente clien){
        Conexion con = new Conexion();
        try {
            String query="UPDATE cliente SET nombre = ? , apellido =?,id_direccion = ? ,correo_electronico=? "
                    + " WHERE documento_identidad = ? ;";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            st.setString(1, clien.getNombre());
            st.setString(2, clien.getApellido());
            st.setInt(3, clien.getId_direccion());
            st.setString(4, clien.getCorreo_electronico());
            st.setString(5, clien.getDocumento_identidad());
            int filaActualizada = st.executeUpdate();
            if(filaActualizada >0){
                System.out.println("DATOS ACTUALIZADOS ");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("ERROR EN LA ACTUALIZACION " + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return false;
    }
    public boolean eliminarCliente(String num){
       boolean seElimino = false;
      Conexion con = new Conexion();
      Cliente clien = null;
        try {
            String query ="DELETE FROM cliente WHERE documento_identidad=?;";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            int filEliminada = st.executeUpdate();
            if(filEliminada>0){
                seElimino = true;
                return seElimino;
            }
        } catch (SQLException e) {
            System.out.println("NOVEDAS EN LA ELIMINACION " + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return seElimino;
    }
    public Cliente buscarCliente(String num){
        Conexion con = new Conexion();
        Cliente clien = null;
        try {
            String query = "SELECT id_cliente,nombre,apellido,id_direccion,correo_electronico "
                    + " FROM cliente WHERE documento_identidad = ?;";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            st.setString(1, num);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
            clien = new Cliente();
            clien.setId_cliente(rs.getInt(1));
            clien.setNombre(rs.getString(2));
            clien.setApellido(rs.getString(3));
            clien.setId_direccion(rs.getInt(4));
            clien.setCorreo_electronico(rs.getString(5));
            }
            return clien;
        } catch (SQLException e) {
            System.out.println("HUBO UN ERROR EN LA BUSQUEDA " +e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return clien;
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
     
}
