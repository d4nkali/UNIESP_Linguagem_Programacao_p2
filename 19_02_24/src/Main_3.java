// Usando input do teclado na estrutura switch case

// Importa a biblioteca
import java.util.Scanner;

public class Main_3 {

    public static void main(String[] args) {

        int r; // Criando a variavel inteira 'r'
        Scanner sc = new Scanner(System.in); // Define o scaner do teclado

        do{ // Inicia a repetição

            System.out.println("Caso escolha 1: Xbox, Caso 2: PS5"); // Imprime essa linha
            int x = sc.nextInt(); // Ler o teclado e armazena em 'x'

            switch (x) { // Se 'x' for:

                case 1: // Se 'x' for 1:
                    
                    System.out.println("Boa escolha"); // Imprime essa linha
                    break;

                case 2: // Se 'x' for 2:

                    System.out.println("Excelente escolha"); // Imprime essa linha
                    break;
            
                default: // Se 'x' for nenhuma das alternativas acima:
                
                    System.out.println("Valor errado"); // Imprime essa linha 
                    break;
            }

        System.out.println("Para ver novamente digite 0"); // Imprime essa liha
        r = sc.nextInt(); // Ler o teclado e armazena em 'r'

        }while (r == 0); // Ficara repetindo quando 'r' continua 0

    }

}