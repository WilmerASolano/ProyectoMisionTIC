/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.repository;

import retocinco.util.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import retocinco.model.Existencia;
/**
 *
 * @author Wilmer Solano
 */
public class ExistenciaRepository {

    public ExistenciaRepository() {
    }
    
    public boolean agregarExistencia(Existencia exis){
        Conexion con = new Conexion();
        try {
            String query="INSERT INTO existencia(nombre) VALUES (?) ;";
            PreparedStatement st = con.conexion_db.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            st.setString(1, exis.getNombre());
            int filaInsertada = st.executeUpdate();
            if(filaInsertada > 0){
                System.err.println("CATEGORIA DE EXISENCIA INSERTADA ");
                return true;
            }else{
                System.err.println("NO SE INSERTO LOS DATOS");
            }
        } catch (Exception e) {
            System.err.println("HUBO UN ERROR EN LA INSERCCION DEL DATO" + e.getMessage());
        }finally{
            con.cerrarConexion();
            
        }
        return false;
    }
    public Existencia buscarExistencia(int codi){
        Conexion con = new Conexion();
        Existencia exis = null;
        try {
            String query ="SELECT nombre FROM existencia WHERE id_existencia=?";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            st.setInt(1, codi);
            ResultSet rsExistencias = st.executeQuery();
            while(rsExistencias.next()){
                exis = new Existencia();
                
                exis.setNombre(rsExistencias.getString(1));
            }
            return exis;
        } catch (SQLException e) {
            System.err.println("hubo un error en la busqueda" + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return exis;
    }
    public boolean editarExistencia(Existencia exis){
        Conexion con = new Conexion();
        try {
            String query = "UPDATE existencia SET nombre= ? WHERE id_existencia = ?;";
            PreparedStatement ps = con.conexion_db.prepareStatement(query);
            ps.setString(1, exis.getNombre());
            ps.setInt(2, exis.getId_existencia());
            int filInsertada = ps.executeUpdate();
            if(filInsertada >0 ){
                System.err.println("SE ACTUALIZARON LOS DATOS");
                return true;
            }
        } catch (SQLException e) {
            System.err.println("HUBO UN ERROR EN LA ACTUALIZACION "+ e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return false;
    }
    public boolean eliminarExistencia(int codi){
        Conexion con = new Conexion();
        try {
            String query= "DELETE FROM existencia WHERE id_existencia = ?;";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            st.setInt(1, codi);
            int exisEliminado = st.executeUpdate();
            if(exisEliminado > 0 ){
                System.out.println("SE ELIMINO LA EXISTENCIA");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("SE GENERO UN ERROR AL ELIMINAR LA FACULTAD " + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return false;
    }
    public ArrayList<Existencia> listaExistencia(){
        Conexion con = new Conexion();
        Existencia exis;
        ArrayList<Existencia> lsExistencia = new ArrayList<>();
        try {
            String query = "SELECT id_existencia,nombre FROM existencia "
                    + " ORDER BY  nombre ";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
            exis = new Existencia();
            exis.setId_existencia(rs.getInt(1));
            exis.setNombre(rs.getString(2));
            lsExistencia.add(exis);
            }
        } catch (SQLException e) {
            System.out.println("SE PRODUJO UN ERROR EN LA LISTA DE EXISTENCIAS" + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return lsExistencia;
    }
}
