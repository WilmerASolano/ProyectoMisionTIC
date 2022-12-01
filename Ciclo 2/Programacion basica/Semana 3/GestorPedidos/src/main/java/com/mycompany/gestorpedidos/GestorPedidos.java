/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestorpedidos;

import com.mycompany.gestorpedidos.modelo.Cliente;
import com.mycompany.gestorpedidos.modelo.ClienteNatural;
import com.mycompany.gestorpedidos.vista.FrmPedidos;

/**
 *
 * @author Wilmer Solano
 */
public class GestorPedidos {
public static ClienteNatural cliente;
    public static void main(String[] args) {
       cliente = new ClienteNatural("joselo ","antonio","lopez","sanchez","1","calle5sur","3213421","joselo23@gmail.com");
   FrmPedidos frmPedidos = new FrmPedidos();
   frmPedidos.setVisible(true);
   //centra la pantalla del formulario
   frmPedidos.setLocationRelativeTo(null);
    }
}
