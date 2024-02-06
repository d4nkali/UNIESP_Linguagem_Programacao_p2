// Exercicio 3 - Soma de 3 notas, faz a media e verifica se o aluno foi aprovado ou não

public class Main_3 {

    public static void main(String[] args) { 

        // Definindo as notas
        int nota_1 = 50;
        int nota_2 = 70;
        int nota_3 = 100;
        int nota_f;

        nota_f = (nota_1+nota_2+nota_3)/3; // Soma as 3 notas, divide por 3 e armazena em nota_f

        if (nota_f >= 70){ // Se a nota for maior ou igual a 70, então:

            System.out.println("Ele foi aprovado com media: "+nota_f); // Imprime que foi aprovaado

        }

        else { // Senão:

            System.out.println("Ele foi para a final com media: "+nota_f); // Imprime que foi reprovado

        }

    }

}

// FIM!