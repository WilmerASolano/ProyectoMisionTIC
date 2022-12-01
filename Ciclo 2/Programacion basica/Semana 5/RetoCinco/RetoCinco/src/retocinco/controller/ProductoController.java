/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retocinco.controller;

import java.util.ArrayList;
import retocinco.model.Categoria;
import retocinco.model.Existencia;
import retocinco.model.Producto;
import retocinco.model.Proveedor;
import retocinco.repository.ProductoRepository;
import retocinco.util.Conexion;

/**
 *
 * @author Wilmer Solano
 */
public class ProductoController {
    ProductoRepository productoRepository = new ProductoRepository();
    public boolean asignarProducto(Producto producto){
        return productoRepository.insertarProducto(producto);
    }
    public Producto existeProducto(int codigo){
        return productoRepository.buscarProducto(codigo);
    }
    public boolean editarProducto(Producto pro){
        
        return productoRepository.actualizarProducto(pro);
    }
  public ArrayList<Producto> listaProductos(){
      return productoRepository.listaProductos();
  }
  public boolean eliminarProducto(int codi){
      Producto pro = productoRepository.buscarProducto(codi);
      if(pro != null){
          productoRepository.eliminarProducto(codi);
       return true;
      }
      return false;
  }
  public ArrayList<Proveedor> listaProveedor(){
      return productoRepository.listaProveedor();
  }
  public ArrayList<Categoria> listaCategoria(){
      return productoRepository.listaCategoria();
  }
  public ArrayList<Existencia> listaExistencia(){
      return productoRepository.listaExistencia();
  }
}
