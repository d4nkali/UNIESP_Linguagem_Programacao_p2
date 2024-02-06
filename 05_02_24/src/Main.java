// Aula 1 - Primeiros codigos no Java

public class Main {

    public static void main(String[] args ) {

        System.out.println("Olá mundo"); // Imprime Olá mundo

        // Codigo de variaveis de numero inteiro e calculo das variaveis

        int num1 = 90; 
        int num2 = 70; 
        int total;

        total = num1 + num2; // Soma os 2 numeros na variavel total

        System.out.println(total); // Imprime o resultado da variavel total

        // Codigo de comparação das variaveis

        if (num1 > num2) { // Se numero 1 for maior que o numero 2, então:

            System.out.println("é maior"); // Imprime que é maior

        } 
        
        else if (num1 == num2) { // Se numero 1 for igual ao numero 2, então:

            System.out.println("é igual"); // Imprime que é igual

        } 
        
        else { // Se não for nenhuma das outras alternativas

            System.out.println("é menor"); // Imprime que é menor 

        }

    }

}

// FIM!