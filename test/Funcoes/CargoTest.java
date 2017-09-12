/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mayco
 */
public class CargoTest {
    
    

    /**
     * Test of getId method, of class Cargo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Cargo instance = new Cargo();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
}
