package Funcoes;

import java.util.Scanner;

public class Funcionario {

    private int numRegistro;
    private String nome;
    private String cpf;
    private String email;
    private String logradouro;
    private int numLogradouro;
    private String complemento;
    private float salarioBruto;
    private int qtDependentes;
    private Departamento deptno;
    private Cargo cargo;
    private int faltas;
    private final int tam = 100;
    Funcionario fu[] = new Funcionario [tam];
    static int cont;

    
    public void Cadastro(){
        
        
        Departamento d = new Departamento();
        Cargo c = new Cargo();
        Scanner in  = new Scanner(System.in);
         
        Funcionario f = new Funcionario();
        try{    
            System.out.println("Digite o numero de registro:");
            f.numRegistro = in.nextInt();
            System.out.println("Digite o nome:");
            f.nome = in.next();
            //System.out.println("Digite o CPF:");
            //f.cpf = in.next();
            //System.out.println("Digite o Email:");
           // f.email = in.next();
           // System.out.println("Digite o Logradouro:");
            //f.logradouro = in.next();
           // System.out.println("Digite o numero da residencia:");
           // f.numLogradouro = in.nextInt();
           // System.out.println("Digite o complemento:");
           // f.complemento = in.next();
            System.out.println("Digite o salario bruto:");
            f.salarioBruto = in.nextFloat();
           // System.out.println("Digite a quantidade de dependentes");
          //  f.qtDependentes = in.nextInt();
            System.out.println("Digite o cargo");
            c.setNome(in.next());
            System.out.println("Digite o Departamento");
            d.setNome(in.next());
            
            fu[cont] = f;
            cont++;
            
        }catch(Exception e){
            System.out.println("erro:" + e);
        }
        
    }
    public float calcularSB(){
        
        float SBR=0;
        int po = pesquisaNome();
        validarFaltas(po);
        if(po<=100){
            if (fu[po].salarioBruto > 0) {

                SBR = fu[po].salarioBruto -((fu[po].salarioBruto/30)* fu[po].faltas);
                System.out.println("Seu salario Bruto é:"+ SBR);
                fu[po].salarioBruto = SBR;
            }else
                System.out.println("Fassa seu cadastro para analizar seu salario.");
            return SBR;
        }else{
            System.out.println("Nao existe esse funcionario.");
            return 0;
        }
        
    }
    public void validarFaltas(int po){
        Scanner in = new Scanner(System.in);
        if (po <= 100) 
        {
            System.out.println("Digite Suas faltas:");
            fu[po].faltas = in.nextInt();
            while(fu[po].faltas > 30){
                if (fu[po].faltas > 30) {
                    System.out.println("Digite um valor valido(de 1 a 30):");
                    fu[po].faltas = in.nextInt();
                }else
                    System.out.print("Erro!,");
            }
            System.out.println(fu[po].faltas +" Faltas.");
        }else
            System.out.println("Funcionario nao existe.");
    }
    public void calcularSL(){
        int po = pesquisaNome();
        
        float SL=0,SBR = fu[po].salarioBruto;
        
        if(po<=100){
            if(SBR > 0){
                if (SBR <= 1903.98) {
                    SL = (float) (SBR - ((fu[po].salarioBruto * 0.11) + (fu[po].salarioBruto * 0)));
                }
                if (SBR <= 2826.65 && SBR > 1903.98) {
                    SL = (float) (SBR - ((fu[po].salarioBruto * 0.11) + (fu[po].salarioBruto*0.075)));
                }
                if (SBR <= 3751.05 && SBR > 2826.65) {
                    SL = (float) (SBR - ((fu[po].salarioBruto * 0.11) + (fu[po].salarioBruto*0.15)));
                }
                if (SBR <= 4664.68 && SBR > 3751.05) {
                    SL = (float) (SBR - ((fu[po].salarioBruto * 0.11) + (fu[po].salarioBruto*0.225)));
                }
                if (SBR > 4664.68) {
                    SL = (float) (SBR - ((fu[po].salarioBruto * 0.11) + (fu[po].salarioBruto*0.275)));
                }

                System.out.println("Salario Liquido:"+SL);

            }else
                System.out.println("Erro");
        }
        else
            System.out.println("Funcionario nao existe");
    }
    public int pesquisaNome(){
        int po =150;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionario:");
        String nome = in.next();
        
        try{
            for (int i = 0; i <= cont; i++) {
                if (fu[i].getNome().equals(nome)) {
                    po = i;
                    return po;
                }
            }
        }catch(Exception e){
            System.out.println("Erro:" + e);
        }
        return po;
    }
            
   
    /**
     * @return the numRegistro
     */
    public int getNumRegistro() {
        return numRegistro;
    }

    /**
     * @param numRegistro the numRegistro to set
     */
    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the numLogradouro
     */
    public int getNumLogradouro() {
        return numLogradouro;
    }

    /**
     * @param numLogradouro the numLogradouro to set
     */
    public void setNumLogradouro(int numLogradouro) {
        this.numLogradouro = numLogradouro;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the salarioBruto
     */
    public float getSalarioBruto() {
        return salarioBruto;
    }

    /**
     * @param salarioBruto the salarioBruto to set
     */
    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    /**
     * @return the qtDependentes
     */
    public int getQtDependentes() {
        return qtDependentes;
    }

    /**
     * @param qtDependentes the qtDependentes to set
     */
    public void setQtDependentes(int qtDependentes) {
        this.qtDependentes = qtDependentes;
    }

    /**
     * @return the deptno
     */
    public Departamento getDeptno() {
        return deptno;
    }

    /**
     * @param deptno the deptno to set
     */
    public void setDeptno(Departamento deptno) {
        this.deptno = deptno;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
