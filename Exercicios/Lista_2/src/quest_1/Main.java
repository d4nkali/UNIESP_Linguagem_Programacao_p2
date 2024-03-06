package quest_1;

/*
 
Questão 1 - As maçãs custam 1,30 cada, se forem compradas menos de uma dúzia, e 1,00 se forem compradas pelo menos 12. 
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 

*/

import java.util.Scanner; // Importa a biblioteca 

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Cria o Scanner do teclado

        System.out.print("Digite o número de maçãs que serão compradas: "); // Pergunta a quantidade de maçãs
        int quant_maca = sc.nextInt(); // Guarda na variavel 'quant_macas'

        Compra c = new Compra(); // Criando o objeto c da classe Compra

        double total = c.calc_maca(quant_maca);  // Chamando o método 'calc_maca'

        // Exibindo o resultado
        System.out.println("Você comprou "+quant_maca+" Maçãs. O total da compra é de: R$" + total);
        
    }

}
