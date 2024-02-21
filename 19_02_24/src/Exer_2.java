// Exercicio 2

// Importa a biblioteca
import java.util.Scanner;

public class Exer_2 {
    
    public static void main(String[] args) {
        
        String r; // Cria variavel para ler se vai repetir o programa
        int matricula_funci; // Cria variavel do tipo matricula para a matricula
        String nome_funci; // Cria variavel do tipo string para guarda o nome
        double salario_bruto_funci; // Cria variavel do tipo double para guarda o salario

        Scanner sc = new Scanner(System.in); // Define o scaner do teclado

        do{ // Inicia a repetição

            System.out.println(); // Espaçamento
            System.out.println("Programa da folha de pagamento dos funcionarios"); // Imprime essa linha
            System.out.println(); // Espaçamento

            System.out.print("Digite o nome do funcionario: "); // Pergunta o nome do funcionario
            nome_funci = sc.next(); // Guarda em 'nome_funci'

            System.out.print("Digite a matricula do funcionario: "); // Pergunta a matricula
            matricula_funci = sc.nextInt(); // Guarda em 'matricula_funci'

            System.out.print("Digite o salario bruto do funcionario: "); // Pergunta o salario bruto
            salario_bruto_funci = sc.nextDouble(); // Guarda em 'salario_bruto_funci'


            double deducao = salario_bruto_funci * 0.15; // Calcula a dedução do INSS e armazena em 'deducao'
            double salario_liquido_funci = salario_bruto_funci - deducao; // Calcula o salario liquido descontando a dedução no salario bruto


            System.out.println(); // Espaçamento
            System.out.println("Exibindo os dados"); // Imprime essa linha
            System.out.println(); // Espaçamento
            System.out.println("Nome do Funcionario: " + nome_funci); // Imprime o nome
            System.out.println("Matricula: " + matricula_funci); // Imprime a matricula
            System.out.println("Salario Bruto: " + salario_bruto_funci); // Imprime o salario bruto
            System.out.println("Quanto sera deduzido do INSS (15%): " + deducao); // Imprime quanto foi de dedução
            System.out.println("Salario Liquido apos dedução: "+ salario_liquido_funci); // Imprime o salario liquido


            System.out.println(); // Espaçamento
            System.out.print("Para usar o programa denovo, digite 'S'; Se não quiser executar, digite 'N': "); // Imprime essa linha 
            r = sc.next();  // Ler o teclado e salva as informações em 'r'
    

            if (r.equalsIgnoreCase("N")){ // Se precionar 'N', então:

                System.out.println("Obrigado por usar o programa"); // Imprime essa linha
                break; // Para o codigo 
    
            }


        }while (r.equalsIgnoreCase("S")); // Irá repetir se 'S' for digitado


    }
    
}
