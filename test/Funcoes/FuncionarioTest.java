package Funcoes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mayco
 */
public class FuncionarioTest {
    
   //Teste com Salario Bruto.
    @Test
    public void Semfaltas() {
        
        Funcionario f = new Funcionario();
        f.setSalarioBruto(1000);
        f.setFaltas(0);
        f.calcularSB();
        assertEquals("Salario",1000,f.getSalarioBruto(),0.0);
    }
    //teste com Salario BRuto
    @Test
    public void FaltasValida() {
        
        Funcionario f = new Funcionario();
        f.setSalarioBruto(1000);
        f.setFaltas(3);
        f.calcularSB();
        assertEquals("Salario",900,f.getSalarioBruto(),0.0);
    }
    // teste com Salario Bruto
    @Test
    public void FaltasInvalidas() {
        
        Funcionario f = new Funcionario();
        f.setSalarioBruto(1000);
        f.setFaltas(31);
        f.calcularSB();
        assertEquals("Salario",1000,f.getSalarioBruto(),0.0);
    }
    //Teste com salario Liquido
    @Test
    public void SemFaltasSL() {
        
        Funcionario f = new Funcionario();
        f.setSalarioBruto(1000);
        f.setFaltas(0);
        f.calcularSB();
        f.calcularSL();
        assertEquals("Salario",890,f.getSalarioBruto(),0.0);
    }
    //Com com salario liquido
    @Test
    public void FaltasValidasSL() {
        
        Funcionario f = new Funcionario();
        f.setSalarioBruto(4000);
        f.setFaltas(2);
        f.calcularSL();
        assertEquals("Salario",2393.33,f.getSalarioBruto(),0.1);
    }
    //Com com salario liquido
    @Test
    public void semfaltasSL2() {
        
        Funcionario f = new Funcionario();
        f.setSalarioBruto(2500);
        f.setFaltas(0);
        f.calcularSL();
        assertEquals("Salario",2037.5,f.getSalarioBruto(),0.0);
    }
    
}
