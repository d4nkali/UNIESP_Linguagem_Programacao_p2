// Exercicio 3

// Importa as bibliotecas
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exer_3 {
    
    public static void main(String[] args) {
        
        String r; // Cria variavel do tipo string para ler se vai repetir o programa
        double media_notas;  // Cria variavel do tipo double para a media das notas
        double nova_nota; // Cria variavel do tipo double para guardar novas notas
        int count_notas = 0; // Cria variavel do tipo inteiro para contar quantas notas foram inseridas

        List<Double> list_notas = new ArrayList<>(); // Cria uma lista do tipo double para guardar as notas
        Scanner sc = new Scanner(System.in); // Define o scaner do teclado

        System.out.println(); // Espaçamento
        System.out.println("Programa calcular media dos alunos"); // Imprime essa linha

        do{ // Inicia a repetição


            System.out.println(); // Espaçamento
            System.out.print("Digite uma nota do aluno: "); // Pergunta a nota
            nova_nota = sc.nextInt(); // Guarda em 'nova_nota'
            list_notas.add(nova_nota); // Adiciona para a lista
            count_notas += 1; // Adiciona mais 1 para o contador

            System.out.println(); // Espaçamento
            System.out.print("Deseja adicionar mais uma nota, digite 'S'; Se não quiser mais adicionar, digite 'N': "); // Imprime essa linha 
            r = sc.next();  // Ler o teclado e salva as informações em 'r'
    

            if (r.equalsIgnoreCase("N")){ // Se precionar 'N', então:

                double soma_notas = 0; // Cria uma variavel para a soma das notas na lista

                // Soma as notas da lista
                for (double nota : list_notas) {
                    soma_notas += nota;
                }

                media_notas = soma_notas / count_notas; // Calcula a media das notas

                System.out.println(); // Espaçamento
                System.out.println("Exibindo a média das notas do aluno: " + media_notas); // Imprime essa linha

                System.out.println("Obrigado por usar o programa"); // Imprime essa linha
                break; // Para o codigo 
    
            }


        }while (r.equalsIgnoreCase("S")); // Irá repetir se 'S' for digitado


    }
    
}
