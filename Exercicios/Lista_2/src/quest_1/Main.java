package quest_1;

/*
 
Questão 1 - As maçãs custam 1,30 cada, se forem compradas menos de uma dúzia, e 1,00 se forem compradas pelo menos 12. 
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 

Aluno: Danilo Pereira Viana - P2-B

*/

import java.util.Scanner; // Importa a biblioteca 

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Cria o Scanner do teclado
        Compra c = new Compra(); // Criando o objeto c da classe Compra

        System.out.print("Digite o número de maçãs que serão compradas: "); // Pergunta a quantidade de maçãs
        c.setQuant_maca(sc.nextInt()); // Guarda na variavel 'quant_macas'

        c.calc_maca();  // Chamando o método 'calc_maca'

        // Exibindo o resultado
        System.out.println("Você comprou "+c.getQuant_maca()+" Maçãs. O total da compra é de: R$" + c.getTotal());
        
    }

}
