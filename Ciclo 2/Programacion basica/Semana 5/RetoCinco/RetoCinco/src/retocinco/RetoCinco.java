/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retocinco;

import java.text.SimpleDateFormat;
import java.util.Date;
import retocinco.controller.ProveedorController;
import retocinco.model.Cliente;
import retocinco.model.Producto;
import retocinco.model.Proveedor;
import retocinco.model.Venta;
import retocinco.repository.ClienteRepository;
import retocinco.repository.ProductoRepository;
import retocinco.repository.VentaRepository;
import retocinco.util.Conexion;
import retocinco.view.frmMenu;

/**
 *
 * @author Wilmer Solano
 */
public class RetoCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Conexion con = new Conexion();
        ProductoRepository pro = new ProductoRepository();
        Producto producto = new Producto(006,"ejemplo",3.099);
       pro.insertarProducto(producto);*/
        frmMenu frmmenu = new frmMenu();
       frmmenu.setVisible(true);
        
        
       /*Producto producto = new Producto(6,"ejemplo dos ",7890);
       ProductoRepository pro = new ProductoRepository();
       pro.actualizarProducto(producto);
       VentaRepository ver = new VentaRepository();
       Venta ven = new Venta("2022-08-08",1,1.250,1230,1);
       ver.agregarVenta(ven);
*/
    }
    
    
}
