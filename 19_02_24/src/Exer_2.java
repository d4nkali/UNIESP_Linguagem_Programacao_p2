// Exercicio 2

// Importa a biblioteca
import java.util.Scanner;

public class Exer_2 {
    
    public static void main(String[] args) {
        
        String r;
        int matricula_funci;
        String nome_funci;
        double salario_bruto_funci;

        Scanner sc = new Scanner(System.in);

        do{ 

            System.out.println("Programa da folha de pagamento dos funcionarios");
            System.out.println();
            System.out.print("Digite o nome do funcionario: ");
            nome_funci = sc.next();

            System.out.print("Digite a matricula do funcionario: ");
            matricula_funci = sc.nextInt();

            System.out.print("Digite o salario bruto do funcionario: ");
            salario_bruto_funci = sc.nextDouble();

            double deducao = salario_bruto_funci * 0.15;
            double salario_liquido_funci = salario_bruto_funci - deducao;

            System.out.println();
            System.out.println("Exibindo os dados");
            System.out.println();
            System.out.println("Nome do Funcionario: " + nome_funci);
            System.out.println("Matricula: " + matricula_funci);
            System.out.println("Salario Bruto: " + salario_bruto_funci);
            System.out.println("Quanto sera deduzido do INSS (15%): " + deducao);
            System.out.println("Salario Liquido apos dedução: "+ salario_liquido_funci);


            System.out.print("Para usar o programa denovo, digite 'S'; Se não quiser executar, digite 'N': "); // Imprime essa linha 
            r = sc.next();  // Ler o teclado e salva as informações em 'r'
    
            if (r.equalsIgnoreCase("N")){ // Se precionar 'N', então:

                System.out.println("Obrigado por usar o programa"); // Imprime essa linha
                break; // Para o codigo 
    
            }

        }while (r.equalsIgnoreCase("S")); // Irá repetir se 'S' for digitado


    }
    
}
