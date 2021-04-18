/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psic.bookingsystem;

import java.util.Date;
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
public class TreatmentTest {
    
    public TreatmentTest() {
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
     * Test of getName method, of class Treatment.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Treatment instance = new Treatment();
        String expResult = "Test Treatment";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhysician method, of class Treatment.
     */
    @Test
    public void testGetPhysician() {
        System.out.println("getPhysician");
        Treatment instance = new Treatment();
        Physician expResult = new Physician(0,"Test Physician", "unknown", "unknown");
        instance.setPhysician(expResult);
        Physician result = instance.getPhysician();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPeriod method, of class Treatment.
     */
    @Test
    public void testGetPeriod() {
        System.out.println("getPeriod");
        Treatment instance = new Treatment();
        Date expResult = new Date();
        instance.setPeriod(expResult);
        Date result = instance.getPeriod();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRoom method, of class Treatment.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        Treatment instance = new Treatment();
        Room expResult = new Room();
        System.out.println(expResult);
        instance.setRoom(expResult);
        Room result = instance.getRoom();
        assertEquals(expResult, result);
    }
    
}
