/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author O.Zsolt
 */
public class LaptopMotherboardTest {
    
    public LaptopMotherboardTest() {
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
     * Test of getInfo method, of class LaptopMotherboard.
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        LaptopMotherboard instance = null;
        String expResult = "";
        String result = instance.getInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeepCopy method, of class LaptopMotherboard.
     */
    @Test
    public void testDeepCopy() throws Exception {
        System.out.println("DeepCopy");
        LaptopMotherboard instance = null;
        LaptopMotherboard expResult = null;
        LaptopMotherboard result = instance.DeepCopy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
