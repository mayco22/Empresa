package Funcoes;

import java.util.Scanner;

public class Cargo {
    
    private int id;
    private String nome;
    private String titulacaoMinima;
    
    public void CadastraCargo(){
        Scanner in = new Scanner(System.in);
        
        setId(in.nextInt());
        System.out.println("Digite o Nome.: ");
        setNome(in.next());
        System.out.println("Digite a Titulação.: ");
        setTitulacaoMinima(in.next()); 
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
