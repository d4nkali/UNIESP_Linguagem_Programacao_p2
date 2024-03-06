import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        f.setHorasTrabalhadas(sc.nextInt());
        System.out.print("Digite o valor da hora trabalhada: R$");
        f.setValorHora(sc.nextDouble());
        f.calcularSalario();

    }
    
}