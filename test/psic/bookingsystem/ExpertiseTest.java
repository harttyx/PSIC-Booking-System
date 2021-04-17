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
public class ExpertiseTest {
    
    public ExpertiseTest() {
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
     * Test of getFieldOfExpertise method, of class Expertise.
     */
    @Test
    public void testGetFieldOfExpertise() {
        System.out.println("getFieldOfExpertise");
        Expertise instance = new Expertise();
        String expResult = "Physiotherapy";
        instance.setFieldOfExpertise(expResult);
        String result = instance.getFieldOfExpertise();
        assertEquals(expResult, result);
    }
    
}
