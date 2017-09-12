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
public class FuncionarioTest {
    
    /**
     * Test of pesquisaNome method, of class Funcionario.
     */
    @Test
    public void testPesquisaNome() {
        System.out.println("pesquisaNome");
        Funcionario instance = new Funcionario();
        int expResult = 0;
        int result = instance.pesquisaNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
