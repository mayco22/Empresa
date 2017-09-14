package Funcoes;

import empresa.Empresa;
import java.util.Scanner;

public class Cargo {
    
    private int id;
    private String nome;
    private String titulacaoMinima;
    
    public void CadastraCargo(){
        
        Scanner s = new Scanner(System.in);
        Cargo c = new Cargo();
        
        c.setId(id);
        System.out.println("Digite o Nome.: ");
        c.setNome(s.next());
        System.out.println("Digite a Titulação.: ");
        c.setTitulacaoMinima(s.next()); 
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
