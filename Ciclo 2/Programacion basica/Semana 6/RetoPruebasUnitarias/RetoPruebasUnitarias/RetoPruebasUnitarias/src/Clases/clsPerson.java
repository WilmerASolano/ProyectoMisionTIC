/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class clsPerson {
    private String name;
    private String document;
    private String cellphone;
    private String hobbies;
    private String email;
    private clsAddress address;
    private LinkedList<clsPerson> relatives;

   
    private int meters ;

    public clsPerson(String name, String document, String cellphone, String hobbies, String email, clsAddress address) {
        this.name = name;
        this.document = document;
        this.cellphone = cellphone;
        this.hobbies = hobbies;
        this.email = email;
        this.address = address;
        this.relatives = new LinkedList<>();
        this.meters = 0;
    }

    public clsPerson() {
         this.relatives = new LinkedList<>();
    }

    // Print a message of walking arround and return the total of meters walked by the person
    public int WalkAround(int meters){
        System.out.println("The person " + this.name + " is walking around close to " + meters + " meters");
        this.meters += meters;
        return this.meters;
    }
    
    // return the new relative position in the relatives list.
    public int AddRelative(clsPerson relative){
        this.relatives.add(relative);
        return this.relatives.size() - 1;
    }
    //instanciar la lista
    //pasar como parametro el objeto
    //buscar el objeto por documento 
    //mostrar objeto por documento
    //
    public int UpdateRelative(clsPerson relative){
        int actualizado;
        try {
        int index = SearchRelative(relative);
        if(index != -1){
            relatives.set(index, relative);
            actualizado =3;
        }else{
            actualizado = 1;
        }
       return actualizado;
        } catch (Exception e) {
            
            actualizado= 2;
            return actualizado;
        }
    }
       public int DeleteRelative(clsPerson relative){
        int actualizado;
        try {
        int index = SearchRelative(relative);
        if(index != -1){
            relatives.remove(index);
            actualizado =2;
        }else{
            actualizado = 1;
        }
       return actualizado;
        } catch (Exception e) {
            e.printStackTrace();
            actualizado= 3;
            return actualizado;
        }
      
    }
    private int SearchRelative(clsPerson relative){
        int index = -1;
        for (int i = 0; i < relatives.size(); i++) {
            if(relatives.get(i).getDocument().equals(relative.getDocument())){
                index = i;
            }
        }
            
        return index;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * @return the cellphone
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * @return the hobbies
     */
    public String getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public clsAddress getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(clsAddress address) {
        this.address = address;
    }
    
     public LinkedList<clsPerson> getRelatives() {
        return relatives;
    }

    public void setRelatives(LinkedList<clsPerson> relatives) {
        this.relatives = relatives;
    }
}
