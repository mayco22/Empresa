package empresa;
import Funcoes.Funcionario;
import Funcoes.Departamento;
import Funcoes.Cargo;
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Cargo c = new Cargo();
        Departamento d = new Departamento();
        Scanner in = new Scanner(System.in);
        int menu=0;
        c.Cargo();
        d.Departamento();
      
        do{
            System.out.println("Digite Uma opcao:");
            System.out.println("1.Cadastrar Funcionario.");
            System.out.println("2.Cadastrar departemento.");
            System.out.println("3.Cadastar cargo.");
            System.out.println("4.calcular salario Bruto.");
            System.out.println("5.Calcular Salario Liquido.");
            System.out.println("6.Sair.");
            menu = in.nextInt();
            switch(menu){
                   case 1:f.Cadastro();break;
                   case 2:d.cadastrarDepto();break;
                   case 3:c.cadastrarCargo();break;
                   case 4:f.calcularSB();break;
                   case 5:f.calcularSL();break;
                   case 6:break;
                   default:System.out.println("Opcao incorreta! Digite Novamente");break;
            }
        }
        while(menu!=6);
    }
}
