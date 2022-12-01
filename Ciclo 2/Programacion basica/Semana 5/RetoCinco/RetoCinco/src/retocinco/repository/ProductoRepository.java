/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.repository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import retocinco.model.Categoria;
import retocinco.model.Existencia;
import retocinco.model.Producto;
import retocinco.model.Proveedor;
import retocinco.util.Conexion;
/**
 *
 * @author Wilmer Solano
 */
public class ProductoRepository {

    public ProductoRepository() {
    }
    public boolean insertarProducto(Producto pro){
        //instacia de conexion
        Conexion con = new Conexion();
        try{
           String query = "INSERT INTO producto (codigo_producto,nombre,precio_actual,id_proveedor,id_existencia,id_categoria) "
                    + "VALUES(?,?,?,?,?,?)"; 
           //se prepara para ejecutar la operacion INSERT
           //RETURN GENERATED KEYS ES UNA BANDERA QUE SIRVE PARA RETORNAR LAS CLAVES PRIMARIA DEL REGISTRO
           PreparedStatement st = con.conexion_db.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           //se asigna los valores a la consulta del INSERT
           st.setInt(1, pro.getCodigoProducto());
           st.setString(2, pro.getNombre());
           st.setDouble(3, pro.getPrecioActual());
           st.setInt(4, pro.getId_proveedor());
           st.setInt(5, pro.getId_existencia());
           st.setInt(6, pro.getId_categoria());
           //EJECUTA EL QUERY O PETICION
           int filasInsertadas = st.executeUpdate();
           if(filasInsertadas > 0){
               System.err.println("SE INSERTO LOS DATOS "+ pro.getCodigoProducto() + pro.getNombre());
               return true;
           }else{
               System.err.println("NO SE INSERTO LOS DATOS"+ pro.getCodigoProducto() + pro.getNombre());
           }
        }catch(Exception e ){
            System.err.println("HAY UN ERROR EN LA INSERTAR EN LA BASE DE DATOS" + e.getMessage());
        //ESTO SIEMPRE SE EJECUTA SI SE INSERTO O NO LOS DATOS EN LA BD
        //SIEMPRE SE TIENE QUE CERRAR LA CONEXION EN LA BASE DE DATOS
        //SE EVITA MALGASTAR RECURSOS
        }finally{
            con.cerrarConexion();
        }
     return false;   
    }
   public Producto buscarProducto(int codigo){
       Conexion con = new Conexion();
       //se instancia null ya que si no encuentra datos
       //este no tiene inconveniente en devolver null
       Producto pro = null;
       try {
           String query="SELECT id_producto,codigo_producto,nombre,precio_actual,id_proveedor, "
                   + " id_existencia,id_categoria FROM producto WHERE codigo_producto = ?";
           PreparedStatement st = con.conexion_db.prepareStatement(query);
           st.setInt(1, codigo);
           ResultSet rsProducto = st.executeQuery();
           while(rsProducto.next()){
               pro = new Producto();
               pro.setId_producto(rsProducto.getInt(1));
               pro.setCodigoProducto(rsProducto.getInt(2));
               pro.setNombre(rsProducto.getString(3));
               pro.setPrecioActual(rsProducto.getDouble(4));
               pro.setId_proveedor(rsProducto.getInt(5));
               pro.setId_existencia(rsProducto.getInt(6));
               pro.setId_categoria(rsProducto.getInt(7));
           }
           return pro;
       } catch (SQLException e) {
           System.err.println("ERROR AL CONSULTAR EL PRODUCTO" + e.getMessage());
       }finally{
           con.cerrarConexion();
       }
       return pro;
   }
   public boolean actualizarProducto(Producto pro){
       Conexion con = new Conexion();
       try {
           String query = "UPDATE producto SET nombre=?,precio_actual=?, "
                   + "id_proveedor = ?,id_existencia=?,id_categoria=? "
                   + "WHERE codigo_producto = ? ;";
           PreparedStatement st = con.conexion_db.prepareStatement(query);
           st.setString(1, pro.getNombre());
           st.setDouble(2, pro.getPrecioActual());
           st.setInt(3, pro.getId_proveedor());
           st.setInt(4, pro.getId_existencia());
           st.setInt(5, pro.getId_categoria());
           st.setInt(6, pro.getCodigoProducto());
           int filasActualizadas = st.executeUpdate();
           
           if( filasActualizadas > 0 ){
               System.err.println("SE ACTUALIZARON LOS DATOS DEL PRODUCTO");
               return true;
           }else{
               System.err.println("NO SE ACTUALIZARON LOS DATOS");
           }
       } catch (SQLException e) {
           System.err.println("NO SE PUDO REALIZAR LA OPERACION DE ACTUALIZAR" + e.getMessage());
       }finally{
           con.cerrarConexion();
       }
       return false;
   }
   public boolean eliminarProducto(int codi){
       Conexion cone = new Conexion();
       try {
           String query ="DELETE "
                   + " FROM producto"
                   + " WHERE codigo_producto = ? ;";
           PreparedStatement st = cone.conexion_db.prepareStatement(query);
           st.setInt(1,codi);
           int filasEliminadas = st.executeUpdate();
           if(filasEliminadas > 0){
               System.err.println("SE ELIMINO EL PRODUCTO DE LA BASE DE DATOS");
               return true;
           }else{
               System.err.println("NO SE ELIMINO EL PRODUCTO DE LA BASE DE DATOS");
           }
       } catch (SQLException e) {
           System.err.println("HUBO UN ERROR AL MOMENTO DE EJECUTAR LA ELIMINACION "+ e.getMessage());
       }finally{
           cone.cerrarConexion();
       }
       return false;
       
   }
   
    public ArrayList<Producto>listaProductos(){
         Conexion con = new Conexion();
         Producto pro;
         ArrayList<Producto>lstProducto = new ArrayList<>();
         try {
            String query="SELECT codigo_producto,nombre,precio_actual,id_proveedor,id_existencia,id_categoria FROM producto;";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                pro = new Producto();
               
                pro.setCodigoProducto(rs.getInt(1));
                pro.setNombre(rs.getString(2));
                pro.setPrecioActual(rs.getDouble(3));
                pro.setId_proveedor(rs.getInt(4));
                pro.setId_existencia(rs.getInt(5));
                pro.setId_categoria(rs.getInt(6));
                lstProducto.add(pro);
            }
         } catch (SQLException e) {
             System.out.println("ERROR EN LA LISTADO" + e.getMessage());
        }finally{
             con.cerrarConexion();
         }
        return lstProducto; 
    }
    public ArrayList<Existencia> listaExistencia(){
        Conexion cone = new Conexion();
        Existencia exis;
        ArrayList<Existencia> lstExistencia = new ArrayList<>();
        try {
            String query ="SELECT id_existencia,nombre FROM existencia;";
            PreparedStatement st = cone.conexion_db.prepareStatement(query);
            ResultSet rt = st.executeQuery();
            while(rt.next()){
                 exis = new Existencia();
                exis.setId_existencia(rt.getInt(1));
                exis.setNombre(rt.getString(2));
                lstExistencia.add(exis);
            }
        } catch (SQLException e) {
            System.out.println("ERROR EN EL LISTADO DE EXISTENCIA" + e.getMessage());
        }finally{
            cone.cerrarConexion();
        }
        return lstExistencia;
    }
    public ArrayList<Categoria> listaCategoria(){
     Conexion cone = new Conexion();
     Categoria cate;
     ArrayList<Categoria> lstCategoria = new ArrayList<>();
        try {
            String query = "SELECT id_categoria,nombre_categoria,descripcion FROM categoria;";
            PreparedStatement st = cone.conexion_db.prepareStatement(query);
            ResultSet rt = st.executeQuery();
            while(rt.next()){
                cate = new Categoria();
                cate.setId_categoria(rt.getInt(1));
                cate.setNombre_categoria(rt.getString(2));
                cate.setDescripcion(rt.getString(3));
                lstCategoria.add(cate);
            }
        } catch (Exception e) {
        }
 return lstCategoria;
    }
    public ArrayList<Proveedor> listaProveedor(){
        Conexion con = new Conexion();
        Proveedor provee;
        ArrayList<Proveedor> lstProveedor = new ArrayList<>();
        try {
            String query ="SELECT id_proveedor,razon_social,NIT,telefono,id_direccion,"
                    + " correo_electronico,representante_legal,sitio_web FROM proveedor;";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            ResultSet rt = st.executeQuery();
            while(rt.next()){
                provee = new Proveedor();
                provee.setId_proveedor(rt.getInt(1));
                provee.setRazon_social(rt.getString(2));
                provee.setNIT(rt.getString(3));
                provee.setTelefono(rt.getString(4));
                provee.setId_direccion(rt.getInt(5));
                provee.setCorreo(rt.getString(6));
                provee.setRepresentante(rt.getString(7));
                provee.setSitio_web(rt.getString(8));
                lstProveedor.add(provee);
            }
        } catch (SQLException e) {
            System.out.println("ERROR EN EL LISTADO" + e.getMessage())  ;
        }
        return lstProveedor;
    }
}
