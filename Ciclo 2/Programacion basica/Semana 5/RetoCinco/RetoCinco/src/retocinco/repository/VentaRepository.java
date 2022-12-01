/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.repository;

import java.sql.Date;
import retocinco.model.Venta;

/**
 *
 * @author Wilmer Solano
 */
import retocinco.util.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import retocinco.model.Cliente;
import retocinco.model.Producto;
public class VentaRepository {
    public boolean agregarVenta(Venta ven){
        Conexion con = new Conexion();
        try {
            String query = "INSERT INTO venta(fecha_venta,id_cliente,valor_descuento, "
                    + "valor_total,id_producto) VALUES(?,?,?,?,?)";
            PreparedStatement st = con.conexion_db.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
           
            st.setString(1, ven.getFecha_venta());
            st.setInt(2, ven.getId_cliente());
            st.setDouble(3, ven.getValor_descuento());
            st.setDouble(4, ven.getValor_total());
            st.setInt(5, ven.getId_producto());
            int filaInser = st.executeUpdate();
            if(filaInser > 0){
                System.out.println("SE INGRESO LA VENTA");
            }else{
                System.out.println("NO SE INSERTO LA VENTA");
            }
        } catch (Exception e) {
            System.out.println("HUBO UN PROBLEMA EN LA INSERCION " + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return false;
    }
    public boolean editarVenta(Venta ven){
        Conexion cone = new Conexion();
        try {
            String query ="UPDATE venta SET fecha_venta=?,id_cliente=?,valor_descuento=?, "
                    + " valor_total=?,id_producto=? WHERE id_venta =?;";
            PreparedStatement st = cone.conexion_db.prepareStatement(query);
            st.setString(1, ven.getFecha_venta());
            st.setInt(2,ven.getId_cliente());
            st.setDouble(3, ven.getValor_descuento());
            st.setDouble(4, ven.getValor_total());
            st.setInt(5, ven.getId_producto());
           st.setInt(6, ven.getId_venta());
            int filActua = st.executeUpdate();
            if(filActua >0){
                System.out.println("DATOS ACTUALIZADO");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("ERROR EN LA ACTUALIZACION" + e.getMessage());
        }finally{
            cone.cerrarConexion();
        }
        return false;
    }
    public ArrayList<Cliente> listaCliente(){
        Conexion cone = new Conexion();
        Cliente clien;
        ArrayList<Cliente> lstCliente = new ArrayList<>();
        try {
            String query="SELECT id_cliente,documento_identidad,nombre,apellido,id_direccion , "
                    + " correo_electronico FROM cliente;";
            PreparedStatement st = cone.conexion_db.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                clien = new Cliente();
                clien.setId_cliente(rs.getInt(1));
                clien.setDocumento_identidad(rs.getString(2));
                clien.setNombre(rs.getString(3));
                clien.setApellido(rs.getString(4));
                clien.setId_direccion(rs.getInt(5));
                clien.setCorreo_electronico(rs.getString(6));
                lstCliente.add(clien);
            }
        } catch (SQLException e) {
            System.out.println("HUBO UN ERROR EN LA LISTA " + e.getMessage());
        }finally{
        cone.cerrarConexion();
    }
        return lstCliente;
    }
    
    public ArrayList<Producto> listaProducto(){
        Conexion cone = new Conexion();
        Producto pro;
        ArrayList<Producto> lstPro = new ArrayList<>();
        try {
            String query = "SELECT id_producto,codigo_producto,nombre,precio_actual, "
                    + " id_proveedor,id_existencia,id_categoria FROM producto;";
            PreparedStatement st = cone.conexion_db.prepareStatement(query);
            ResultSet rs =st.executeQuery();
            while(rs.next()){
                pro = new Producto();
                pro.setId_producto(rs.getInt(1));
                pro.setCodigoProducto(rs.getInt(2));
                pro.setNombre(rs.getString(3));
                pro.setPrecioActual(rs.getDouble(4));
                pro.setId_proveedor(rs.getInt(5));
                pro.setId_existencia(rs.getInt(6));
                pro.setId_categoria(rs.getInt(7));
                lstPro.add(pro);
                
            }
        } catch (SQLException e) {
            System.out.println("ERROR EN EL LISTADO" + e.getMessage());
        }finally{
            cone.cerrarConexion();
        }
         return lstPro;   
    }
    
    public Venta buscarVenta(int codi){
        Conexion cone = new Conexion();
        Venta ven = null;
        try {
            String query= "SELECT fecha_venta,id_cliente,valor_descuento,valor_total,id_producto "
                    + " FROM venta WHERE id_venta=?;";
            PreparedStatement st = cone.conexion_db.prepareStatement(query);
            st.setInt(1, codi);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
            ven = new Venta();
            ven.setFecha_venta(rs.getString(1));
            ven.setId_cliente(rs.getInt(2));
            ven.setValor_descuento(rs.getDouble(3));
            ven.setValor_descuento(rs.getDouble(4));
            ven.setId_producto(rs.getInt(5));
           }
            return ven;
        } catch (SQLException e) {
            System.out.println("ERROR EN LA BUSQUEDA" + e.getMessage());
        }finally{
            cone.cerrarConexion();
        }
        return ven;
    }
    public boolean eliminarVenta(int codi){
        boolean eliminado = false;
        Conexion cone = new Conexion();
        Venta ven = null;
        try {
          String query = "DELETE FROM venta WHERE id_venta = ?;";  
          PreparedStatement st = cone.conexion_db.prepareStatement(query);
          st.setInt(1, codi);
          int filasEliminadas = st.executeUpdate();
          if(filasEliminadas>0){
              eliminado = true;
              return eliminado;
          }
        } catch (SQLException e) {
            System.out.println("NOVEDAD EN LA ELIMINACION" + e.getMessage());
        }finally{
            cone.cerrarConexion();
        }
        return eliminado;
    }
}
