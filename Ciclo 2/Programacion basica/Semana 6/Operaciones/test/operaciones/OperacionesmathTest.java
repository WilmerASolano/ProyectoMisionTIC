/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package operaciones;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Wilmer Solano
 */
public class OperacionesmathTest {
    
    public OperacionesmathTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @org.junit.Test
    public void testSumar(){
        
        System.out.println("TEST SUMAR DOS NUMEROS");
        //diseñando el TEST
        long n1 = 5;
        long n2 = 10;
        long expResultado = 15;
        //probando el metodo sumar
        Operacionesmath opera = new Operacionesmath();
        long resultado = opera.sumar(n1, n2);
        //validar resultado esperado es igual al resultado devuelto
        assertEquals(expResultado,resultado);
    }
    
}
