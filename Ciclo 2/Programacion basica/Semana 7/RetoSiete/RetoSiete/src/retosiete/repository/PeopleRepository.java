/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retosiete.repository;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.util.ArrayList;
import retosiete.dto.PeopleDTO;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import retosiete.model.People;

/**
 *
 * @author Wilmer Solano
 */
public class PeopleRepository {
    public ArrayList<PeopleDTO>verTotalPersonasXPais(){
        ArrayList<PeopleDTO> listaPaises = new ArrayList<>();
        Conexion con = new Conexion();
        
        try {
            String query= "SELECT country,COUNT(1) 'personas registradas por pais' FROM tb_people GROUP BY country;";
            PreparedStatement st = con.conexion_db.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                PeopleDTO people = new PeopleDTO();
                people.setCountry(rs.getString("country"));
                people.setTotal(rs.getInt("personas registradas por pais"));
                listaPaises.add(people);
            }
        } catch (SQLException e) {
            System.out.println("ERROR EN EL LISTADO " + e.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return listaPaises;
    }
    public ArrayList<PeopleDTO> listaPersonasXNombre(String nombre){
        ArrayList<PeopleDTO> listaPersonas = new ArrayList<>();
        Conexion conn = new Conexion();
        try {
            String query="SELECT name,COUNT(1) 'personas registradas por nombre' FROM tb_people WHERE name LIKE ? "
                    + " GROUP BY name ";
            PreparedStatement st = conn.conexion_db.prepareStatement(query);
            st.setString(1, nombre);
            ResultSet rsPersonas = st.executeQuery();
            while(rsPersonas.next()){
                 PeopleDTO people = new PeopleDTO();
                 people.setName(rsPersonas.getString("name"));
                 people.setTotal(rsPersonas.getInt("personas registradas por nombre"));
                 listaPersonas.add(people);
                 
                
            }
        } catch (SQLException e) {
            System.out.println("ERROR EN EL LISTADO DE NOMBRES " + e.getMessage());
        }finally{
            conn.cerrarConexion();
        }
        return listaPersonas;
    }
    public ArrayList<People> buscarPersonasXRegion(String region){
        ArrayList<People> listaRegion = new ArrayList<>();
         Conexion conn = new Conexion();
         try {
            String query = "SELECT id,name,postalZip, phone, address, country, currency, alphanumeric, numberrange, region, "
                    + "text, email, list FROM tb_people WHERE region LIKE ?";
            PreparedStatement st = conn.conexion_db.prepareCall(query);
            st.setString(1, region);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                People pe = new People();
                pe.setId(rs.getInt("id"));
                pe.setName(rs.getString("name"));
                pe.setPostalZip(rs.getString("postalZip"));
                pe.setPhone(rs.getString("phone"));
                pe.setAddress(rs.getString("address"));
                pe.setCountry(rs.getString("country"));
                pe.setCurrency(rs.getString("currency"));
                pe.setAlphanumeric(rs.getString("alphanumeric"));
                pe.setNumberrange(rs.getInt("numberrange"));
                pe.setRegion(rs.getString("region"));
                pe.setText(rs.getString("text"));
                pe.setEmail(rs.getString("email"));
                pe.setList(rs.getString("list"));
                listaRegion.add(pe);
            }
        } catch (SQLException e) {
             System.out.println("ERROR AL GENERAR EL INFORME" + e.getMessage());
        }finally{
             conn.cerrarConexion();
         }
        return listaRegion;
    }
}
