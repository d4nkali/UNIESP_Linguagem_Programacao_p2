package quest_1;

/* 

Questão 1 - Elabore um programa de uma indústria realiza a folha mensal de pagamentos 
de seus empregados baseando-se nas seguintes regras:

    a. Inicialmente, ler os dados de cada funcionário (matrícula, nome e salário bruto);

    b. Depois, o programa deve processar o desconto do INSS, que é 15% do salário bruto, 
    e o salário líquido é a diferença entre o salário bruto e a dedução do INSS.

    c. Por fim, exibir na tela o seu contracheque, cujo formato é dado a seguir 

        • Matrícula:
        • Nome completo:
        • Salário Bruto:
        • Dedução INSS:
        • Salário Líquido:

    Aluno: Danilo Pereira Viana - P2-B
    
*/

import java.util.Scanner; // Importa a biblioteca

public class Main {

    public static void main(String[] args) {

        String r; // Cria variavel para ler se vai repetir o programa

        Funcionarios f = new Funcionarios(); // Instancia o objeto 'f' a classe Funcionarios 
        Scanner sc = new Scanner(System.in); // Define o scaner do teclado

        do { // Inicia a repetição

            System.out.println(); // Espaçamento
            System.out.println("Programa da folha de pagamento dos funcionarios"); // Imprime essa linha
            System.out.println(); // Espaçamento

            System.out.print("Digite o nome do funcionario: "); // Pergunta o nome do funcionario
            f.nome = sc.next(); // Armazena em 'f.nome'

            System.out.print("Digite a matricula do funcionario: "); // Pergunta a matricula
            f.matricula = sc.nextInt(); // Armazena em 'f.matricula'

            System.out.print("Digite o salario bruto do funcionario: "); // Pergunta o salario bruto
            f.salario_bruto = sc.nextDouble(); // Armazena em 'f.salario_bruto'


            System.out.println(); // Espaçamento
            System.out.println("Exibindo os dados"); // Imprime essa linha
            System.out.println(); // Espaçamento
            System.out.println("Nome do Funcionario: " + f.nome); // Imprime o nome
            System.out.println("Matricula: " + f.matricula); // Imprime a matricula
            System.out.println("Salario Bruto: " + f.salario_bruto); // Imprime o salario bruto
            f.calc_deducao(); // Chama e executa a função 'calc_deducao'


            System.out.println(); // Espaçamento
            System.out.print("Para usar o programa denovo, digite 'S'; Se não quiser executar, digite 'N': "); // Imprime essa linha 
            r = sc.next();  // Ler o teclado e salva as informações em 'r'
    

            if (r.equalsIgnoreCase("N")){ // Se precionar 'N', então:

                System.out.println("Obrigado por usar o programa"); // Imprime essa linha
                break; // Para o codigo 
    
            }


        } while (r.equalsIgnoreCase("S")); // Irá repetir se 'S' for digitado

        
    }
    
}
