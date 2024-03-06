package quest_2;

/*

Questão 2 - Faça um algoritmo para receber a quantidade atual em estoque, quantidade máxima em
estoque e quantidade mínima em estoque de um produto. 
O sistema deve calcular e exibir a quantidade média usando a seguinte fórmula: 

quantidade média = (quantidade máxima + quantidade mínima) / 2 

Se a quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem
'Não efetuar compra', senão escrever a mensagem 'Efetuar compra' 

*/

import java.util.Scanner; // Importa a biblioteca

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Cria o Scanner do teclado
        Estoque e = new Estoque(); // Criando o objeto e da classe Estoque

        // Criam as variaveis do tipo inteiro
        int quant_atual, estoque_min, estoque_max;

        System.out.print("Digite a quantidade do estoque atual: "); // Pergunta o estoque atual
        quant_atual = sc.nextInt(); // Guarda as informações

        System.out.print("Digite a quantidade maxima do estoque: "); // Pergunta o estoque maximo
        estoque_max = sc.nextInt(); // Guarda as informações

        System.out.print("Digite a quantidade minima do estoque: "); // Pergunta o estoque minimo
        estoque_min = sc.nextInt(); // Guarda as informações

        e.calc_media(estoque_max, estoque_min, quant_atual); // Chamando o método 'calc_media'

    }
    
}
