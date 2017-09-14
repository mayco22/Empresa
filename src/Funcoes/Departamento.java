package Funcoes;

import empresa.Empresa;
import java.util.Scanner;

public class Departamento {
    
    
    private String nome;
    private int ramal;
    private String email;
    private Funcionario diretor;
    
    public void Departamento(){
       
       Departamento departamento1 = new Departamento();
   
       Empresa e = new Empresa();
       
       departamento1.nome = "Logistica";
       departamento1.email = "Logista@log.com";
       departamento1.ramal = 4545;
       
       e.depno[e.contD] = departamento1;
       e.contD++;
       
       departamento1.nome = "compras";
       departamento1.email = "compras@pras.com";
       departamento1.ramal = 5454;
       
       e.depno[e.contD] = departamento1;
       e.contD++;
       
       departamento1.nome = "Faturametno";
       departamento1.email = "faturamento@fatu.com";
       departamento1.ramal = 5432;
       
       e.depno[e.contD] = departamento1;
       e.contD++;
    }
    
    public void cadastrarDepto(){
        
        Scanner in = new Scanner(System.in);
        Departamento departamento = new Departamento();
        Empresa e = new Empresa();
        
        System.out.println("Digite o nome do departamento:");
        departamento.nome = in.next();
        System.out.println("Digite o Ramal:");
        departamento.ramal = in.nextInt();
        System.out.println("Digite o email:");
        departamento.email = in.next();
        System.out.println("Digito o nome do diretor responsavel:");
        departamento.diretor = buscaFuncionario();
        
        e.depno[e.contD] = departamento;
        e.contD++;
    }
    public Funcionario buscaFuncionario(){
        
        Funcionario f = new Funcionario();
        Empresa e = new Empresa();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionario:");
        String nome = in.next();
        int h=0;
        while(h <= e.contF){
            if (e.fu[h].equals(nome)){
                return e.fu[h];
            }
        }
        return null;
    }
    public Departamento buscaDept(){
        Scanner in = new Scanner(System.in);
        Empresa e = new Empresa();
        int resposta=0,h=0;
        
        System.out.println("Departamentos existentes:");
        while(h < e.contD){
            System.out.println(e+"."+e.depno[h].nome);
            h++;
        }
        System.out.println("Digite uma opcao:");
        resposta = in.nextInt();
        if(resposta > e.contD){
            System.out.println("departamento nao existe.");
            return null;
        }else
            return e.depno[resposta];
    }


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ramal
     */
    public int getRamal() {
        return ramal;
    }

    /**
     * @param ramal the ramal to set
     */
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    /**
     * @return the emial
     */
    public String getEmial() {
        return email;
    }

    /**
     * @param emial the emial to set
     */
    public void setEmial(String emial) {
        this.email = emial;
    }

    /**
     * @return the diretor
     */
    public Funcionario getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }
}
