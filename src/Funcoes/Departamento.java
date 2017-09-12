package Funcoes;

import java.util.Scanner;

public class Departamento {
    
    
    private String nome;
    private int ramal;
    private String email;
    private Funcionario diretor;
    private Departamento depno[] = new Departamento [10];
    static int contD;
    
    public void Departamento(){
       Departamento departamento = new Departamento();
       
       departamento.nome = "Logista";
       departamento.email = "Logista@log.com";
       departamento.ramal = 4545;
       
       depno[contD] = departamento;
       contD++;
       
       departamento.nome = "Financeiro";
       departamento.email = "finan@fin.com";
       departamento.ramal = 5454;
       
       depno[contD] = departamento;
       contD++;
    }
    
    public void cadastrarDepto(){
        
        Scanner in = new Scanner(System.in);
        Departamento departamento = new Departamento();
        
        
        System.out.println("Digite o nome do departamento:");
        departamento.nome = in.next();
        System.out.println("Digite o Ramal:");
        departamento.ramal = in.nextInt();
        System.out.println("Digite o email:");
        departamento.email = in.next();
        System.out.println("Digito o nome do diretor responsavel:");
        departamento.diretor = buscaFuncionario();
        
        depno[contD] = departamento;
        contD++;
    }
    public Funcionario buscaFuncionario(){
        
        Funcionario f = new Funcionario();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionario:");
        String nome = in.next();
        
        for (int i = 0; i <= contD; i++) {
            if(f.fu[f.cont].equals(nome)){
                return f.fu[i];
            }
        }
        System.out.println("Funcionario nao existe.");
        return f;
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
