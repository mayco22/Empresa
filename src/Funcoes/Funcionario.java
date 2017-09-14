package Funcoes;
import empresa.Empresa;
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
    

    public void Funcionario(){
        
        Funcionario f = new Funcionario();
        Departamento d = new Departamento();
        Cargo c = new Cargo();
        Empresa e = new Empresa();
        
        f.numRegistro = 3422;
        f.nome = "lucas";
        f.cpf = "324654782";
        f.email = "lu@lu.com";
        f.logradouro = "rua una";
        f.numLogradouro = 321;
        f.complemento = "Apartamento";
        f.salarioBruto = 2050;
        f.qtDependentes = 3;
        f.deptno = e.depno[0];//compras
        f.cargo = e.cargo[0]; //operador
        
        e.fu[e.contF] = f;
        e.contF++;
    }
    
    public void Cadastro(){
        
        Empresa e = new Empresa();
        Departamento d = new Departamento();
        Cargo c = new Cargo();
        Scanner in  = new Scanner(System.in);
        Funcionario f = new Funcionario();
        try{    
//            System.out.println("Digite o numero de registro:");
//            f.numRegistro = in.nextInt();
            System.out.println("Digite o nome:");
            f.nome = in.next();
//            System.out.println("Digite o CPF:");
//            f.cpf = in.next();
//            System.out.println("Digite o Email:");
//            f.email = in.next();
//            System.out.println("Digite o Logradouro:");
//            f.logradouro = in.next();
//            System.out.println("Digite o numero da residencia:");
//            f.numLogradouro = in.nextInt();
//            System.out.println("Digite o complemento:");
//            f.complemento = in.next();
            System.out.println("Digite o salario bruto:");
            f.salarioBruto = in.nextFloat();
//            System.out.println("Digite a quantidade de dependentes");
//            f.qtDependentes = in.nextInt();
            cargo = c.pesquisaCargo();
//            System.out.println("Digite o Departamento");
            deptno = d.buscaDept();
            
            e.fu[e.contF] = f;
            e.contF++;
            
        }catch(Exception h){
            System.out.println("erro:" + h);
        }
        
    }
    public float calcularSB(){
        
        Empresa e = new Empresa();
        
        float SBR=0;
        int po = pesquisaNome();
        validarFaltas(po);
        
        if(po<=100){
            if (e.fu[po].salarioBruto > 0) {

                SBR = e.fu[po].salarioBruto -((e.fu[po].salarioBruto/30)* e.fu[po].faltas);
                System.out.println("Seu salario Bruto é:"+ SBR);
                e.fu[po].salarioBruto = SBR;
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
        Empresa e = new Empresa();
        
        if (po <= 100) 
        {
            System.out.println("Digite Suas faltas:");
            e.fu[po].faltas = in.nextInt();
            while(e.fu[po].faltas > 30){
                if (e.fu[po].faltas > 30) {
                    System.out.println("Digite um valor valido(de 1 a 30):");
                    e.fu[po].faltas = in.nextInt();
                }else
                    System.out.print("Erro!,");
            }
            System.out.println(e.fu[po].faltas +" Faltas.");
        }else
            System.out.println("Funcionario nao existe.");
    }
    public void calcularSL(){
        Empresa e = new Empresa();
        int po = pesquisaNome();
        float SL=0,SBR = e.fu[po].salarioBruto;
        
        if(po<=100){
            if(SBR > 0){
                if (SBR <= 1903.98) {
                    SL = (float) (SBR - ((e.fu[po].salarioBruto * 0.11) + (e.fu[po].salarioBruto * 0)));
                }
                if (SBR <= 2826.65 && SBR > 1903.98) {
                    SL = (float) (SBR - ((e.fu[po].salarioBruto * 0.11) + (e.fu[po].salarioBruto*0.075)));
                }
                if (SBR <= 3751.05 && SBR > 2826.65) {
                    SL = (float) (SBR - ((e.fu[po].salarioBruto * 0.11) + (e.fu[po].salarioBruto*0.15)));
                }
                if (SBR <= 4664.68 && SBR > 3751.05) {
                    SL = (float) (SBR - ((e.fu[po].salarioBruto * 0.11) + (e.fu[po].salarioBruto*0.225)));
                }
                if (SBR > 4664.68) {
                    SL = (float) (SBR - ((e.fu[po].salarioBruto * 0.11) + (e.fu[po].salarioBruto*0.275)));
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
        Empresa e = new Empresa();
        
        System.out.println("Digite o nome do funcionario:");
        String nome = in.next();
        
        try{
            for (int i = 0; i <= e.contF; i++) {
                if (e.fu[i].getNome().equals(nome)) {
                    po = i;
                    return po;
                }
            }
        }catch(Exception h){
            System.out.println("Erro:" + h);
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
