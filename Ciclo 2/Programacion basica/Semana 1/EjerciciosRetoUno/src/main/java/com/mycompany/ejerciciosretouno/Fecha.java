/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosretouno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wilmer Solano
 */
public class Fecha {

    private String fecha;

    public Fecha() {
    }

    public Fecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void comprobarFecha() {
        try {
            //System.out.println(this.fecha);
            //String fech = this.fecha;
            //lo coloque en este formato debido que fue el unico que me funciono
            //anteriormente coloque al contrario pero no me sirvio
           
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = formato.parse(this.fecha);
            //System.out.println(fech);
            //la fecha actual la coloque aqui
            //quise colocar por una que me generara el sistema pero la verdad
            //tuve errores  y no supe otra alternativa
            //profe le sugiero un ejercicio asi para ver si a ud le funciona
            
            Date fecha2 = formato.parse("2022-06-16");
             System.out.println(
          "Fecha-1: " + formato.format(fecha));
      System.out.println(
          "Fecha-2: " + formato.format(fecha2));
            if (fecha.compareTo(fecha2) > 0) {
                System.out.println(
                        "la fecha: esta incorrecta esa fecha es  despues de hoy : " );
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println(
                        "la fecha esta incorrecta esa fecha es antes  de hoy : " );
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println(
                        "las fechas son iguales");
            }
        } catch (ParseException ex) {
           
        }
    }
public void modificar(){
    //para modificar a un dia me guio por la libreria local date time 
    //en la cual invoca el dia de hoy del sistema
    // y ademas añade un dia a la fecha 
    LocalDateTime hoy = LocalDateTime.now();     //fecha de hoy
    LocalDateTime mañana =hoy.plusDays(1);     //añade un dia 
    System.out.println("Fecha de hoy : "+hoy);          
    System.out.println("Fecha de mañana:  "+mañana);    
}
}
