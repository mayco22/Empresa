package Funcoes;

import java.util.Scanner;

public class Departamento {
    
    private int id;
    private String nome;
    private int ramal;
    private String email;
    private Funcionario diretor;
    
    public void cadastrarDepto(){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome do departamento:");
        nome = in.next();
        System.out.println("Digite o Ramal:");
        ramal = in.nextInt();
        System.out.println("Digite o email:");
        email = in.next();
        System.out.println("Digito o nome do diretor responsavel:");
        diretor = buscaFuncionario();
        
        id++;
    }
    public Funcionario buscaFuncionario(){
        
        Funcionario f = new Funcionario();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionario:");
        String nome = in.next();
        
        return f;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
