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
public class DepartamentoTest {
    
    public DepartamentoTest() {
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
     * Test of Departamento method, of class Departamento.
     */
    @Test
    public void testDepartamento() {
        System.out.println("Departamento");
        Departamento instance = new Departamento();
        instance.Departamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarDepto method, of class Departamento.
     */
    @Test
    public void testCadastrarDepto() {
        System.out.println("cadastrarDepto");
        Departamento instance = new Departamento();
        instance.cadastrarDepto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaFuncionario method, of class Departamento.
     */
    @Test
    public void testBuscaFuncionario() {
        System.out.println("buscaFuncionario");
        Departamento instance = new Departamento();
        Funcionario expResult = null;
        Funcionario result = instance.buscaFuncionario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Departamento.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Departamento instance = new Departamento();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Departamento.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Departamento instance = new Departamento();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRamal method, of class Departamento.
     */
    @Test
    public void testGetRamal() {
        System.out.println("getRamal");
        Departamento instance = new Departamento();
        int expResult = 0;
        int result = instance.getRamal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRamal method, of class Departamento.
     */
    @Test
    public void testSetRamal() {
        System.out.println("setRamal");
        int ramal = 0;
        Departamento instance = new Departamento();
        instance.setRamal(ramal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmial method, of class Departamento.
     */
    @Test
    public void testGetEmial() {
        System.out.println("getEmial");
        Departamento instance = new Departamento();
        String expResult = "";
        String result = instance.getEmial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmial method, of class Departamento.
     */
    @Test
    public void testSetEmial() {
        System.out.println("setEmial");
        String emial = "";
        Departamento instance = new Departamento();
        instance.setEmial(emial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiretor method, of class Departamento.
     */
    @Test
    public void testGetDiretor() {
        System.out.println("getDiretor");
        Departamento instance = new Departamento();
        Funcionario expResult = null;
        Funcionario result = instance.getDiretor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiretor method, of class Departamento.
     */
    @Test
    public void testSetDiretor() {
        System.out.println("setDiretor");
        Funcionario diretor = null;
        Departamento instance = new Departamento();
        instance.setDiretor(diretor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
