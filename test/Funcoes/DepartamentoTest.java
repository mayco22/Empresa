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
public class DepartamentoTest {
    
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

    
    
}
