package Funcoes;

import java.util.Scanner;

public class Departamento {
    
    
    private String nome;
    private int ramal;
    private String email;
    private String diretor;
    
    public void cadastrarDepto(){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome do departamento:");
        setNome(in.next());
        System.out.println("Digite o Ramal:");
        setRamal(in.nextInt());
        System.out.println("Digite o email:");
        setEmial(in.next());
        System.out.println("Digite Nome do diretor:");
        setDiretor(in.next());
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
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
