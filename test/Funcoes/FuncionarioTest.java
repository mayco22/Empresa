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
    public void salarioBruto() {
        Funcionario f = new Funcionario();
        f.fu[0].nome = "roberto";
        f.fu[0].salarioBruto = 2200;
        f.fu[0].calcularSB();
        assertEquals("",2200,f.fu[0].salarioBruto,0.0);
        
    }

    
}
