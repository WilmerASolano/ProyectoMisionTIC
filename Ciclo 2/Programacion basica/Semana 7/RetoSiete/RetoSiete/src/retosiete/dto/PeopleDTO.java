/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retosiete.dto;

/**
 *
 * @author Wilmer Solano
 */
public class PeopleDTO {
    //EL DTO SIRVE PARA REPRESENTAR LA ELABORACION DE LA TABLA DE GRAFICAS CON LA INFORMACION 
    private String country;
    private String name;
    private int total;
    

    public PeopleDTO() {
    }

    public String getCountry() {
        return country;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
