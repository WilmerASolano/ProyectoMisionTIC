
package com.co.biblioteca.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String USER = "root";
    private final String PASSWORD = "";
    private final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    
    // permitir realizar las operaciones en la bd
    // insert, delete, select, update
    private Connection conn;
    
    /**
     * se realiza la conexión a la BDs
     */
    public Conexion(){
        try {
            // 1. Cargar el driver por medio de la senetencia Class.forName
            Class.forName(this.DRIVER);
            
            //2. Conectarnos a la BDs por medio de DriverManager
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.err.println("Error al Abrir la conexion de BDs: " + e.getMessage());
        }
    }

    public Connection abrirConexion() {
        return conn;
    }

    public void cerrarConexion(){
        try {
            this.conn.close();
        } catch (Exception e) {
            System.err.println("Error al cerrar la conexion de BDs: " + e.getMessage());
        }
    } 
}
