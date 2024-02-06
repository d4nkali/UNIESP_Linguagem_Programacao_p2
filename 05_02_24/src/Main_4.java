// Exercicio 4 - Com base do salario, exibe o desconto do IR

public class Main_4 {

    public static void main(String[] args) {

        int salario = 606; // Definindo o salario

        if (salario <= 606) { // Se o salario for menor ou igual a 606

            System.out.println("Isento do Leão"); // Imprime que esta isento

        }

        else if ((salario > 901) && (salario <= 1500)) { // Se for entre 901 a 1500

            System.out.println("Leão foi bom e deu um desconto de 5%"); // Imprime que o desconto foi de 5%

        }

        else if ((salario > 1501) && (salario <= 2500)) { // Se for entre 1501 a 2500

            System.out.println("Leão foi bom e deu um desconto de 10%"); // Imprime que o desconto foi de 10%

        }

        else { // Senão for nenhuma das anteriores:

            System.out.println("Leão foi bom e deu um desconto de 20%"); // Imprime que o desconto foi de 20%

        }

    }
}

// FIM!