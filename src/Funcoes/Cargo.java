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
        
        c.setId(Empresa.contC);
        System.out.println("Digite o Nome.: ");
        c.setNome(s.next());
        System.out.println("Digite a Titulação.: ");
        c.setTitulacaoMinima(s.next()); 
        
        Empresa.cargo[Empresa.contC] = c;
        Empresa.contC++;
    }
    
    public void cadastrarCargo(){
        
        Scanner in = new Scanner(System.in);
        Cargo c = new Cargo(); 
        Empresa e = new Empresa();
        
        c.id = (e.contC+1);
        
        System.out.println("Digite o cargo:");
        c.nome = in.next();
        
        System.out.println("Digite a titulacao minima:");
        c.titulacaoMinima = in.next();
        
        e.cargo[e.contC] = c;
        e.contC++;
    }
    public Cargo pesquisaCargo(){
        
        Cargo c = new Cargo();
        Scanner in = new Scanner(System.in);
        Empresa e = new Empresa();
        
        int resposta=0,h=0;
        
        System.out.println("Cargos existentes:");
        while(h < e.contC){
            System.out.println(h+"."+e.cargo[h].nome);
            h++;
        }
        System.out.println("Digite uma opcao:");
        resposta = in.nextInt();
        if(resposta > e.contC){
            System.out.println("Cargo nao existe.");
            return null;
        }else
            return e.cargo[resposta];
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
