package Funcoes;

import java.util.Scanner;

public class Cargo {
    
    private int id;
    private String nome;
    private String titulacaoMinima;
    static Cargo cargo[] = new Cargo [10];
    static int contC = 0;
    
    
    public static void Cargo(){
        
        Cargo c = new Cargo();
        Cargo c1 = new Cargo();  
        
        
        c.id = contC;
        c.nome = "operador";
        c.titulacaoMinima = "Tecnico";
        
        cargo[contC] = c;
        contC++;
        
        c1.id = contC;
        c1.nome = "Supervisor";
        c1.titulacaoMinima = "Superior";
        
        cargo[contC] = c1;
        contC++;
        
    }
    
    public void cadastrarCargo(){
        
        Scanner in = new Scanner(System.in);
        Cargo c = new Cargo(); 
        
        
        c.id = (contC+1);
        
        System.out.println("Digite o cargo:");
        c.nome = in.next();
        
        System.out.println("Digite a titulacao minima:");
        c.titulacaoMinima = in.next();
        
        cargo[contC] = c;
        contC++;
    }
    public Cargo pesquisaCargo(){
        
        Cargo c = new Cargo();
        Scanner in = new Scanner(System.in);
        
        int resposta=0;
        
        System.out.println("Cargos existentes:");
        
        for (int i = 0; i < 1; i++) {
            System.out.println("Digite uma opcao:");
            for (int j = 0; j <= contC; j++) {
                System.out.println((j+1)+"."+cargo[j].nome);
            }
            resposta = in.nextInt();
            if(resposta > contC)
                System.out.println("");
            else
                return cargo[resposta-1];
        }
        return c;
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
