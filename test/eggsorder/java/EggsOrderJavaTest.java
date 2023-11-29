/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package eggsorder.java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 30062786
 */
public class EggsOrderJavaTest {
    
    public EggsOrderJavaTest() {
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

    /**
     * Test of main method, of class EggsOrderJava.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EggsOrderJava.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTotalAmount method, of class EggsOrderJava.
     */
    @Test
    public void testCalculateTotalAmount() {
        System.out.println("calculateTotalAmount");
        int i = 0;
        String expResult = "";
        String result = EggsOrderJava.calculateTotalAmount(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
