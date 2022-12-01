package com.co.biblioteca.repository;

import com.co.biblioteca.models.Libro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LibroRepository {

    public LibroRepository() {
    }
    
    public Libro insertarLibro(Libro libro){
        Conexion conn = new Conexion();
        try {
            String query = "INSERT INTO libro(titulo, editorial, anio_publicacion, ISBN) "
                        + "values(?,?,?,?)";
            PreparedStatement st = conn.abrirConexion().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, libro.getTitulo());
            st.setString(2, libro.getEditorial());
            st.setString(3, libro.getAnioPublicacion());
            st.setString(4, libro.getISBN());
            int filasInsertadas = st.executeUpdate();
            if ( filasInsertadas > 0 ){
                // select libro_id from libro where titulo = 'EL VIEJO'
                ResultSet rsLibro = st.getGeneratedKeys();
                if ( rsLibro.next() ){
                    libro.setLibroId( rsLibro.getInt(1) );
                    return libro;
                }
            }
            
        } catch (Exception e) {
            System.err.println("No se pudo insertar el libro: " + e.getMessage());
        }finally{
            conn.cerrarConexion();
        }
        return null;
    }
    
    public Libro buscarLibroXTitulo(String titulo){
        Conexion conn = new Conexion();
        CapituloRepository capituloRepository = new CapituloRepository();
        try {
            String query = "SELECT libro_id, titulo, editorial, anio_publicacion, ISBN "
                        + "FROM libro "
                        + "WHERE titulo = ?";
            PreparedStatement st = conn.abrirConexion().prepareStatement(query);
            st.setString(1, titulo);
            ResultSet rsLibro = st.executeQuery();
            while ( rsLibro.next() ){
                Libro libro = new Libro();
                libro.setLibroId( rsLibro.getInt(1));
                libro.setTitulo( rsLibro.getString("titulo"));
                libro.setEditorial( rsLibro.getString(3));
                libro.setAnioPublicacion( rsLibro.getString(4));
                libro.setISBN( rsLibro.getString(5));
                libro.setCapitulos( capituloRepository.buscarCapitulosXLibroId(libro.getLibroId()) );
                return libro;
            }
        } catch (Exception e) {
            System.out.println("Error al consultar el libro " + e.getMessage());
        }finally{
            conn.cerrarConexion();
        }
        return null;
    }
    
    
}
