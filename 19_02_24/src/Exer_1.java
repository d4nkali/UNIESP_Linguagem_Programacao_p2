// Exercicio 1 - Criar um aplicativo que o usuario insira o nome e idade, exiba e pergunta se quer repetir ou não

// Importando a bibilioteca
import java.util.Scanner;

public class Exer_1 {

    public static void main(String[] args) {

        String r; // Cria a variavel string 'r'
        String nome; // Cria a variavel string 'nome'
        int idade; // Cria a variavel inteira 'idade'

        Scanner sc = new Scanner(System.in); // Define o scaner do teclado

        do{ // Inicia a repetição

            System.out.println("Digite seu Nome: "); // Imprime essa linha
            nome = sc.next(); // Ler o teclado e salva as informações em 'nome'
            System.out.println("Digite sua Idade: "); // Imprime essa linha 
            idade = sc.nextInt(); // Ler o teclado e salva as informações em 'idade'


        System.out.println("Para ver novamente, digite 'S'; Se não quiser executar, digite 'N'"); // Imprime essa linha 
        r = sc.next();  // Ler o teclado e salva as informações em 'r'

        if (r.equalsIgnoreCase("N")){ // Se precionar 'N', então:

            break; // Para o codigo 

        }

        }while (r.equalsIgnoreCase("S")); // Irá repetir se 'S' for digitado

    }

}