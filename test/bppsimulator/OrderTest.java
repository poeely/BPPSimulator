/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bppsimulator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul
 */
public class OrderTest {
    
    public OrderTest() {
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
     * Test of getCapacity method, of class Order.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Order instance = null;
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Order.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        Order instance = null;
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActualCapacity method, of class Order.
     */
    @Test
    public void testGetActualCapacity() {
        System.out.println("getActualCapacity");
        Order instance = null;
        int expResult = 0;
        int result = instance.getActualCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActualCapacity method, of class Order.
     */
    @Test
    public void testSetActualCapacity() {
        System.out.println("setActualCapacity");
        int actualCapacity = 0;
        Order instance = null;
        instance.setActualCapacity(actualCapacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsedCapacity method, of class Order.
     */
    @Test
    public void testGetUsedCapacity() {
        System.out.println("getUsedCapacity");
        Order instance = null;
        int expResult = 0;
        int result = instance.getUsedCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsedCapacity method, of class Order.
     */
    @Test
    public void testSetUsedCapacity() {
        System.out.println("setUsedCapacity");
        int usedCapacity = 0;
        Order instance = null;
        instance.setUsedCapacity(usedCapacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
