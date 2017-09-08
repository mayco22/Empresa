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
   

    
    public void Cadastro(){
        
        Departamento d = new Departamento();
        Cargo c = new Cargo();
        Scanner in  = new Scanner(System.in);
        
        try{    
            System.out.println("Digite o numero de registro:");
            numRegistro = in.nextInt();
            System.out.println("Digite o nome:");
            nome = in.next();
            System.out.println("Digite o CPF:");
            cpf = in.next();
            System.out.println("Digite o Email:");
            email = in.next();
            System.out.println("Digite o Logradouro:");
            logradouro = in.next();
            System.out.println("Digite o numero da residencia:");
            numLogradouro = in.nextInt();
            System.out.println("Digite o complemento:");
            complemento = in.next();
            System.out.println("Digite o salario bruto:");
            salarioBruto = in.nextFloat();
            System.out.println("Digite a quantidade de dependentes");
            qtDependentes = in.nextInt();
            System.out.println("Digite o cargo");
            c.setNome(in.next());
            System.out.println("Digite o Departamento");
            d.setNome(in.next());
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public float calcularSB(){
        float SBR=0;
        if (salarioBruto > 0) {
            float f = validarFaltas();
            SBR = salarioBruto -((salarioBruto/30)*f);
            System.out.println("Seu salario Bruto é:"+ SBR);
            
        }else
            System.out.println("Fassa seu cadastro para analizar seu salario.");
        return SBR;
    }
    public int validarFaltas(){
        Scanner in = new Scanner(System.in);
        int f = 0;
        System.out.println("Digite Suas faltas:");
        f = in.nextInt();
        while(f > 30){
            if (f > 30) {
                System.out.println("Digite um valor valido(de 1 a 30):");
                f = in.nextInt();
            }else
                System.out.print("Erro!,");
        }
        System.out.println(f +" Faltas.");
        return f;
    }
    public void calcularSL(){
        float SBR = calcularSB();
        if(SBR > 0){
            
        }else
            System.out.println("Erro");
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
