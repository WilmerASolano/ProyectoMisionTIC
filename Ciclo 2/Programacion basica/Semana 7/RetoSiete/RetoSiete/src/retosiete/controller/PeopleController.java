/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retosiete.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import retosiete.dto.PeopleDTO;
import retosiete.model.People;
import retosiete.repository.PeopleRepository;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Wilmer Solano
 */
public class PeopleController {

    PeopleRepository peopleRepo = new PeopleRepository();

    public ArrayList<PeopleDTO> totalPersonasXPaises() {
        return peopleRepo.verTotalPersonasXPais();
    }

    public ArrayList<PeopleDTO> totalPersonasXNombre(String nombre) {
        nombre = nombre + '%';
        return peopleRepo.listaPersonasXNombre(nombre);
    }

    public boolean exportarResultadosExcel(String region) {
        region = '%' + region + '%';
        ArrayList<People> regiones = peopleRepo.buscarPersonasXRegion(region);
        HSSFWorkbook libroExcel = new HSSFWorkbook();
        HSSFSheet hoja = libroExcel.createSheet("regiones");
        String[] headers = {"Codigo", "nombre", "telefono", "correo", "pais", "divisa", "alphanumericos", "rango", "region", "texto", "email", "lista"};
        CellStyle encabezadoCellStyle = libroExcel.createCellStyle();
        HSSFFont font = libroExcel.createFont();
        font.setBold(true);
        encabezadoCellStyle.setFont(font);
         HSSFRow headerRow = hoja.createRow(0);
        int pos = 0;
        for( String campo: headers){
            HSSFCell celda = headerRow.createCell(pos);
            celda.setCellStyle(encabezadoCellStyle);
            celda.setCellValue(campo);
            pos++;
        }
        pos=1;
        for(People personas:regiones){
            HSSFRow fila = hoja.createRow(pos);
            int code = personas.getId();
            String name = personas.getName();
            String postalZIP = personas.getPostalZip();
            String phone = personas.getPhone();
            String address = personas.getAddress();
            String country = personas.getCountry();
            String currency = personas.getCurrency();
            String alphanumeric = personas.getAlphanumeric();
            int numberrange = personas.getNumberrange();
            String reg = personas.getRegion();
            String text = personas.getText();
            String email = personas.getEmail();
            String list = personas.getList();
            fila.createCell(0).setCellValue(code);
            fila.createCell(1).setCellValue(name);
            fila.createCell(2).setCellValue(postalZIP);
            fila.createCell(3).setCellValue(phone);
            fila.createCell(4).setCellValue(address);
            fila.createCell(5).setCellValue(country);
            fila.createCell(6).setCellValue(currency);
            fila.createCell(7).setCellValue(alphanumeric);
            fila.createCell(8).setCellValue(numberrange);
            fila.createCell(9).setCellValue(reg);
            fila.createCell(10).setCellValue(text);
            fila.createCell(11).setCellValue(email);
            fila.createCell(12).setCellValue(list);
            pos++;
        }
        try {
          FileOutputStream file = new FileOutputStream("RegionesExportados.xls");
            libroExcel.write(file);
            file.close();
            return true;  
        } catch (FileNotFoundException e) {
             System.out.println("Error al generar el archivo " + e.getMessage());
        }catch (IOException e){
            System.err.println("Error al escribir en el archivo " + e.getMessage());
        }
        return false;
    }
}
