package quest_2;

/*

Questão 2 - Elabore um programa em java que informe se um aluno ele está aprovado, reprovado ou na final.
O sistema deve solicitar o nome e as notas do aluno. Em seguida, realiza o cálculo da média e
informa a situação acadêmica. Se a média for >= 70 está aprovado, abaixo de 40 está reprovado,
senão, está na final.

Aluno: Danilo Pereira Viana - P2-B

*/

import java.util.Scanner; // Importa a biblioteca

public class Main {
    
    public static void main(String[] args) {
        
    Aluno a = new Aluno(); // Instancia o objeto 'a' a classe Aluno 
    Scanner sc = new Scanner(System.in); // Cria um novo scanner

    System.out.print("Digite o nome do aluno: "); // Pergunta o nome
    a.nome = sc.next(); // Armazena o valor digitado em 'a.nome'

    System.out.print("Digite a 1° Nota: "); // Pergunta a nota 1
    a.nota_1 = sc.nextDouble(); // Armazena o valor digitado em 'nota_1.nome'

    System.out.print("Digite a 2° Nota: "); // Pergunta a nota 2
    a.nota_2 = sc.nextDouble(); // Armazena o valor digitado em 'nota_2.nome'

    System.out.print("Digite a 3° Nota: "); // Pergunta a nota 3
    a.nota_3 = sc.nextDouble(); // Armazena o valor digitado em 'nota_3.nome'

    a.calcular_media(); // Chama e executa a função 'calcular_media'

    System.out.println("A media de "+a.nome+" foi de: "+a.media); // Imprime os resultaados

    if (a.media >= 7) { // Se a media for maior que 7, então:

        System.out.println("Aluno aprovado"); // Imprime que o aluno foi aprovado

    }

    else { // Senão:

        System.out.println("Aluno reprovado"); // Imprime que o aluno foi reprovado

    }

    }

}
