package quest_1;

/*
 
Questão 1 - As maçãs custam 1,30 cada, se forem compradas menos de uma dúzia, e 1,00 se forem compradas pelo menos 12. 
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 

*/

import java.util.Scanner; // Importa a biblioteca 

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Cria o Scanner do teclado

        System.out.print("Digite o número de maçãs que serão compradas: ");
        int quant_maca = sc.nextInt();

        // Criando um objeto da classe Compra
        Compra c = new Compra();

        // Chamando o método para calcular o custo total
        double total = c.calc_maca(quant_maca);

        // Exibindo o resultado
        System.out.println("Você comprou "+quant_maca+" Maçãs. O total da compra é de: R$" + total);
        
    }

}
