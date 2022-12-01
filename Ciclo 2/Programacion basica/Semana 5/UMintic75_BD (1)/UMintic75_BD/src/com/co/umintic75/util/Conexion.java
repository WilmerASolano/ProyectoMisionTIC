package com.co.umintic75.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String USER = "root";
    private final String PASSWORD = "";
    private final String URL = "jdbc:mysql://localhost:3306/umintic";
    
    public Connection conexion_bd;

    public Conexion() {
        try {
            Class.forName(DRIVER);
            conexion_bd = DriverManager.getConnection(URL, USER, PASSWORD);
            
            if (conexion_bd != null)
                System.err.println("Se conecto a la BD de UMintic");
            else
                System.err.println("No se pudo hace la conexión");
        } catch (Exception e) {
            System.err.println("Error al conectarse " + e.getMessage());
        }
    }

    public void cerrarConexion(){
        try {
            this.conexion_bd.close();
        } catch (SQLException e) {
            System.err.println("No se pudo cerrar la conexion: "+ e.getMessage());
        }
    }
}
