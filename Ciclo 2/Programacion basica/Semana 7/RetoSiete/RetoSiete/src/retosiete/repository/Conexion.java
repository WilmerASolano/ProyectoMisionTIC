/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retosiete.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Wilmer Solano
 */
public class Conexion {
     private final String DRIVER ="com.mysql.cj.jdbc.Driver";
    private final String USER="root";
    private final String PASSWORD="";
    private final String URL="jdbc:mysql://localhost:3306/reto";
    public Connection conexion_db;
    public Conexion() {
        try {
           Class.forName(DRIVER);
           //pasa los parametros para la conexion 
           conexion_db = DriverManager.getConnection(URL, USER, PASSWORD);
           if(conexion_db !=null){
               System.err.println("SE CONECTO A LA BASE DE DATOS");
           }else{
               System.err.println("NO SE CONECTO A LA BASE DE DATOS");
           }
        } catch (Exception e) {
            System.err.println("HAY UN ERROR CON LA CONEXION CON LA BASE DE DATOS" +e.getMessage());
        }
    }
    public void cerrarConexion(){
        try {
            this.conexion_db.close();
        } catch (SQLException e) {
            System.err.println("HAY UN ERROR CON CERRAR LA BASE DE DATOS" + e.getMessage());
        }
    }
}
