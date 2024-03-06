package quest_3;

import java.util.Scanner; // Importa a biblioteca

public class Main {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora(); // Instancia o objeto 'calc' a classe Calculadora
        Scanner sc = new Scanner(System.in); // Cria um novo scanner

        int r,n1,n2; // Criam as variaveis inteiras r, n1 e n2

        System.out.println("Calculadora Java");

        do { // Inicia a repetição

            System.out.println("Digite qual a operação que voce deseja fazer.");
            System.out.print("1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão: ");
            int escolha = sc.nextInt(); // Salva o valor digitado em escolha


            System.out.print("Digite o 1° numero: ");
            n1 = sc.nextInt(); // Salva o primeiro numero digitado em n1
            System.out.print("Digite o 2° numero: ");
            n2 = sc.nextInt(); // Salva o segundo numero digitado em n2

            switch (escolha) { // Se escolha for:

                case 1: // Digitado 1

                    System.out.println(calc.somar(n1,n2)); // Faz a operação da adição com n1 e n2
                    break;

                case 2: // Digitado 2

                    System.out.println(calc.subtracao(n1,n2)); // Faz a operação da subtração com n1 e n2
                    break; 

                case 3: // Digitado 3

                    System.out.println(calc.multiplicacao(n1, n2)); // Faz a operação da multiplicação com n1 e n2
                    break;

                case 4: // Digitado 4

                    System.out.println(calc.divisao(n1, n2)); // Faz a operação da divisão com n1 e n2
                    break;

                default: // Digitado nenhuma das anteriores

                    System.out.println("Ação invalida"); // Imprime mensagem de erro
                    break;

            }
            
        System.out.print("Para uma executar uma nova operação, digite '0': ");
        r = sc.nextInt();  // Ler o teclado e salva as informações em 'r'

        }while (r == 0); // Irá repetir se 0 for digitado

        System.out.println("Obrigado por usar nosso programa :)"); 

    }

}
