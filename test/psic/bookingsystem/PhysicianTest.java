/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psic.bookingsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hart
 */
public class PhysicianTest {
    
    public PhysicianTest() {
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
     * Test of getId method, of class Physician.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Physician instance = new Physician();
        int expResult = 2;
        instance.setId(expResult);
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFullName method, of class Physician.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Physician instance = new Physician();
        String expResult = "Hart";
        instance.setFullName(expResult);
        String result = instance.getFullName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAddress method, of class Physician.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Physician instance = new Physician();
        String expResult = "Hatfield Test";
        instance.setAddress(expResult);
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhoneNumber method, of class Physician.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Physician instance = new Physician();
        String expResult = "+447789003411";
        instance.setPhoneNumber(expResult);
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }
    
}
