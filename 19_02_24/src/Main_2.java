// Usando input do teclado no programa java

// Importa a biblioteca
import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Define o scaner do teclado

        System.out.println("Informe um número: "); // Imprime essa linha
        int x = sc.nextInt(); // Ler o numero que foi digitado e armazena na variavel 'x'
        System.out.println(x); // Imprime 'x'

    }
    
}