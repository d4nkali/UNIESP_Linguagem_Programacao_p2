// Exemplo 1 - Estrutura switch case

public class Main {

    public static void main(String[] args) {
    
        int x = 1; // Cria uma variavel numero inteiro 'x'

        switch (x) { // Se 'x' for:

            case 0: // Se 'x' for 0

                System.out.println("Opção 0 escolhida"); // Imprime essa linha
                break;
            
            case 1 :  // Se 'x' for 1

                System.out.println("Opção 1 escolhida"); // Imprime essa linha
                break;
            
            case 2 :  // Se 'x' for 2

                System.out.println("Opção 2 escolhida"); // Imprime essa linha
                break;
            
            default: // Caso for nenhuma das opções acima

                System.out.println("Opção invalida"); // Imprime essa linha

        }

    }

}