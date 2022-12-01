package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testSumar_listaNumeros() {
        System.out.println("sumar Lista Numeros");
        long[] listaNumeros = new long[]{1,2,3,4,5};
        Operaciones ope = new Operaciones();
        long expResult = 15;
        long result = ope.sumar(listaNumeros);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumar_DosNumeros() {
        System.out.println("sumar 2 Numeros");
        long n1 = 15;
        long n2 = 50;
        Operaciones ope = new Operaciones();
        long expResult = 65;
        long result = ope.sumar(n1, n2);
        assertEquals(expResult, result);
    }

    /*
    @Test
    public void testRestar() {
        System.out.println("restar");
        long n1 = 0L;
        long n2 = 0L;
        Operaciones instance = new Operaciones();
        long expResult = 0L;
        long result = instance.restar(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testMultiplicar_long_long() {
        System.out.println("multiplicar");
        long n1 = 0L;
        long n2 = 0L;
        Operaciones instance = new Operaciones();
        long expResult = 0L;
        long result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testMultiplicar_longArr() {
        System.out.println("multiplicar");
        long[] listaNumeros = null;
        Operaciones instance = new Operaciones();
        long expResult = 0L;
        long result = instance.multiplicar(listaNumeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testDividir() {
        System.out.println("dividir");
        long n1 = 0L;
        long n2 = 0L;
        Operaciones instance = new Operaciones();
        double expResult = 0.0;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
