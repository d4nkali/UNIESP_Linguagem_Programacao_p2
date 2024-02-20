// Criando um loop infinito

public class Main_1 {

    public static void main(String[] args) {
    
        int x = 1; // Cria uma variavel numero inteiro 'x'
        int repetir = 0; // Cria uma variavel numero inteiro 'repetir' com valor 0

        do{ // Inicia a repetição

                System.out.println("Caso escolha..."); // Imprime essa linha

            switch (x) { // Se 'x' for:

                case 1: // Se 'x' for 0

                    System.out.println("Opção 0 escolhida"); // Imprime essa linha
                    break;
                
                case 2 :  // Se 'x' for 1

                    System.out.println("Opção 1 escolhida"); // Imprime essa linha
                    break;
                
                case 3 :  // Se 'x' for 2

                    System.out.println("Opção 2 escolhida"); // Imprime essa linha
                    break;
                
                default: // Caso for nenhuma das opções acima

                    System.out.println("Opção invalida"); // Imprime essa linha

            }
            System.out.print("Para repetir, digite 0"); // Imprime essa linha

        }while (repetir ==0); // Ficara repetindo quando 'repetir' continua 0

    }

}