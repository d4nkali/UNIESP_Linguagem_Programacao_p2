// Usando input do teclado na estrutura switch case (loop corrigido)

// Importa a biblioteca
import java.util.Scanner;

public class Main_4 {

    public static void main(String[] args) {

        String r; // Criando a variavel 'r'
        Scanner sc = new Scanner(System.in); // Define o scaner do teclado

        do{ // Inicia a repetição

            System.out.println("Caso escolha 1: Xbox, Caso 2: PS5"); // Imprime essa linha
            int x = sc.nextInt();  // Define o scaner do teclado

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

        System.out.println("Para ver novamente, digite 's'; Se não quiser executar, digite 'n'"); // Imprime essa linha
        r = sc.next(); // Ler o teclado e armazena em 'r'

        if (r.equalsIgnoreCase("N")){ // Se 'N' for precionado, então:

            break; // Para o codigo

        }

        }while (r.equalsIgnoreCase("s")); // Irá repetir se 'S' for digitado

    }

}