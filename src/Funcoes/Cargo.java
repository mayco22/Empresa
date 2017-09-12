package Funcoes;

import java.util.Scanner;

public class Cargo {
    
    private int id;
    private String nome;
    private String titulacaoMinima;
    private Cargo cargo[] = new Cargo [10];
    static int contC;
    
    
    public void Cargo(){
        
        Cargo cargo = new Cargo(); 
        
        
        cargo.id = (contC+1);
        cargo.nome = "operador";
        cargo.titulacaoMinima = "Major";
        
        this.cargo[contC] = cargo;
        contC++;
        
        cargo.id = (contC+1);
        cargo.nome = "Supervisor";
        cargo.titulacaoMinima = "tenente";
        
        this.cargo[contC] = cargo;
        contC++;
    }
    
    public void cadastrarCargo(){
        
        Scanner in = new Scanner(System.in);
        Cargo cargo = new Cargo(); 
        
        
        cargo.id = (contC+1);
        
        System.out.println("Digite o cargo:");
        cargo.nome = in.next();
        
        System.out.println("Digite a titulacao minima:");
        cargo.titulacaoMinima = in.next();
        
        this.cargo[contC] = cargo;
        contC++;
    }
    public void pesquisaCargo(){
        
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
     * @return the titulacaoMinima
     */
    public String getTitulacaoMinima() {
        return titulacaoMinima;
    }

    /**
     * @param titulacaoMinima the titulacaoMinima to set
     */
    public void setTitulacaoMinima(String titulacaoMinima) {
        this.titulacaoMinima = titulacaoMinima;
    }
}
