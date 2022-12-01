/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wilmer Solano
 */
public class clsPersonTest {
    
    public clsPersonTest() {
    }

    /**
     * Test of WalkAround method, of class clsPerson.
     */
    @Test
    public void testWalkAround() {
        System.out.println("WalkAround");
        int meters = 10;
        clsPerson instance = new clsPerson();
        int expResult = 10;
        int result = instance.WalkAround(meters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of AddRelative method, of class clsPerson.
     */
    @Test
    public void testAddRelative() {
        System.out.println("AddRelative");
        clsAddress dire = new clsAddress();
        clsPerson relative = new clsPerson("laura", "34343","12345", "nadar", "laura@correo", dire);
        clsPerson instance = new clsPerson();
        int expResult = 0;
        int result = instance.AddRelative(relative);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of UpdateRelative method, of class clsPerson.
     */
    @Test
    public void testUpdateRelativeSuccessfully() {
        System.out.println("UpdateRelative");
        clsAddress dire = new clsAddress();
        clsPerson relative = new clsPerson("laura", "34343","12345", "nadar", "laura@correo", dire);
        clsPerson instance = new clsPerson();
        instance.AddRelative(relative);
        clsPerson relativetwo = new clsPerson("monica", "34343","12345", "leer", "monica@correo", dire);
        int expResult =3;
        int result = instance.UpdateRelative(relativetwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testUpdateRelativeUnsuccessfully() {
        System.out.println("UpdateRelativeUnsuccessfully");
        clsAddress dire = new clsAddress();
        clsPerson relative = new clsPerson("laura", "34344","12345", "nadar", "laura@correo", dire);
        clsPerson instance = new clsPerson();
        instance.AddRelative(relative);
        clsPerson relativetwo = new clsPerson("monica", "34343","12345", "leer", "monica@correo", dire);
        int expResult =1;
        int result = instance.UpdateRelative(relativetwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testUpdateRelativeError() {
        System.out.println("UpdateRelativeUnsuccessfully");
        clsAddress dire = new clsAddress();
       LinkedList<clsPerson> relatives = null;
        clsPerson instance = new clsPerson();
        instance.setRelatives(relatives);
        clsPerson relativetwo = new clsPerson("monica", "34343","12345", "leer", "monica@correo", dire);
        int expResult =2;
        int result = instance.UpdateRelative(relativetwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    /**
     * Test of DeleteRelative method, of class clsPerson.
     */
    @Test
    public void testDeleteRelativeSuccessfully() {
        System.out.println("DeleteRelative");
        clsAddress dire = new clsAddress();
        clsPerson relative = new clsPerson("pedro", "34348","12345", "musica", "pedro@correo", dire);
        clsPerson instance = new clsPerson();
        instance.AddRelative(relative);
        int expResult = 2;
        int result = instance.DeleteRelative(relative);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testDeleteRelativeUnsuccessfully() {
        System.out.println("DeleteRelative");
        clsAddress dire = new clsAddress();
        clsPerson relative = new clsPerson("pedro", "34348","12345", "musica", "pedro@correo", dire);
        clsPerson instance = new clsPerson();
        instance.AddRelative(relative);
        int expResult = 1;
        clsPerson relativetwo = new clsPerson("pedro", "34357","12345", "musica", "pedro@correo", dire);
        int result = instance.DeleteRelative(relativetwo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testDeleteRelativeError() {
        System.out.println("DeleteRelative");
        clsAddress dire = new clsAddress();
        LinkedList<clsPerson> relatives = null;
        clsPerson instance = new clsPerson();
        instance.setRelatives(relatives);
        int expResult = 3;
        clsPerson relative = new clsPerson("pedro", "34348","12345", "musica", "pedro@correo", dire);
        int result = instance.DeleteRelative(relative);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class clsPerson.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        clsPerson instance = new clsPerson();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class clsPerson.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        clsPerson instance = new clsPerson();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocument method, of class clsPerson.
     */
    @Test
    public void testGetDocument() {
        System.out.println("getDocument");
        clsPerson instance = new clsPerson();
        String expResult = "";
        String result = instance.getDocument();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocument method, of class clsPerson.
     */
    @Test
    public void testSetDocument() {
        System.out.println("setDocument");
        String document = "";
        clsPerson instance = new clsPerson();
        instance.setDocument(document);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCellphone method, of class clsPerson.
     */
    @Test
    public void testGetCellphone() {
        System.out.println("getCellphone");
        clsPerson instance = new clsPerson();
        String expResult = "";
        String result = instance.getCellphone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCellphone method, of class clsPerson.
     */
    @Test
    public void testSetCellphone() {
        System.out.println("setCellphone");
        String cellphone = "";
        clsPerson instance = new clsPerson();
        instance.setCellphone(cellphone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHobbies method, of class clsPerson.
     */
    @Test
    public void testGetHobbies() {
        System.out.println("getHobbies");
        clsPerson instance = new clsPerson();
        String expResult = "";
        String result = instance.getHobbies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHobbies method, of class clsPerson.
     */
    @Test
    public void testSetHobbies() {
        System.out.println("setHobbies");
        String hobbies = "";
        clsPerson instance = new clsPerson();
        instance.setHobbies(hobbies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class clsPerson.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        clsPerson instance = new clsPerson();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class clsPerson.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        clsPerson instance = new clsPerson();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class clsPerson.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        clsPerson instance = new clsPerson();
        clsAddress expResult = null;
        clsAddress result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class clsPerson.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        clsAddress address = null;
        clsPerson instance = new clsPerson();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRelatives method, of class clsPerson.
     */
    @Test
    public void testGetRelatives() {
        System.out.println("getRelatives");
        clsPerson instance = new clsPerson();
        LinkedList<clsPerson> expResult = null;
        LinkedList<clsPerson> result = instance.getRelatives();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRelatives method, of class clsPerson.
     */
    @Test
    public void testSetRelatives() {
        System.out.println("setRelatives");
        LinkedList<clsPerson> relatives = null;
        clsPerson instance = new clsPerson();
        instance.setRelatives(relatives);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
