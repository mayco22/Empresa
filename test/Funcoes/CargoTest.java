/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mayco
 */
public class CargoTest {
    
    public CargoTest() {
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
     * Test of Cargo method, of class Cargo.
     */
    @Test
    public void testCargo() {
        System.out.println("Cargo");
        Cargo instance = new Cargo();
        instance.Cargo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarCargo method, of class Cargo.
     */
    @Test
    public void testCadastrarCargo() {
        System.out.println("cadastrarCargo");
        Cargo instance = new Cargo();
        instance.cadastrarCargo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisaCargo method, of class Cargo.
     */
    @Test
    public void testPesquisaCargo() {
        System.out.println("pesquisaCargo");
        Cargo instance = new Cargo();
        instance.pesquisaCargo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

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

    /**
     * Test of setId method, of class Cargo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Cargo instance = new Cargo();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Cargo.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Cargo instance = new Cargo();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Cargo.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Cargo instance = new Cargo();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulacaoMinima method, of class Cargo.
     */
    @Test
    public void testGetTitulacaoMinima() {
        System.out.println("getTitulacaoMinima");
        Cargo instance = new Cargo();
        String expResult = "";
        String result = instance.getTitulacaoMinima();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulacaoMinima method, of class Cargo.
     */
    @Test
    public void testSetTitulacaoMinima() {
        System.out.println("setTitulacaoMinima");
        String titulacaoMinima = "";
        Cargo instance = new Cargo();
        instance.setTitulacaoMinima(titulacaoMinima);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
