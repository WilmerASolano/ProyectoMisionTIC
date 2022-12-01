
package com.co.umintic75.repository;

import com.co.umintic75.models.Profesor;
import com.co.umintic75.util.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfesorRepository {

    public ProfesorRepository() {
    }
    
    public boolean insertarProfesor(Profesor profe){
        Conexion conn = new  Conexion();
        try {
            String query = "INSERT INTO profesor( nombre, telefono, documento, id_facultad) "
                    + "values (?,?,?,?)";
            PreparedStatement statement = conn.conexion_bd.prepareStatement(query);
            statement.setString(1, profe.getNombre());
            statement.setString(2, profe.getTelefono());
            statement.setString(3, profe.getDocumento());
            statement.setInt(4, profe.getId_facultad());
            int totalFilasInsertadas = statement.executeUpdate();
            if ( totalFilasInsertadas > 0 )
                return true;
        } catch (SQLException e) {
            System.err.println("No se pudo insertar " + e.getMessage());
        }finally{
            conn.cerrarConexion();
        }
        return false;
    }
}
