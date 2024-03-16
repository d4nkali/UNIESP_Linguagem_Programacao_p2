package quest_3;

/*

Questão 3 - Crie um programa em Java que recebe três comprimentos de lados e determina se esses 
comprimentos podem  formar  um  triângulo. Caso positivo, o programa deve indicar o tipo 
de triângulo formado (equilátero, isósceles ou escaleno).   

Aluno: Danilo Pereira Viana - P2-B

*/

import java.util.Scanner; // Importa a biblioteca

public class Main {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Cria o Scanner do teclado
        Triangulos t = new Triangulos(); // Criando o objeto e da classe Triangulos

        // Pergunta os lados e armazena nos repectivas variaveis 

            System.out.print("Digite o valor do 1° lado: ");
            t.setLado_1(sc.nextDouble());

            System.out.print("Digite o valor do 2° lado: ");
            t.setLado_2(sc.nextDouble());

            System.out.print("Digite o valor do 3° lado: ");
            t.setLado_3(sc.nextDouble());

        t.desc_Triangulo(); // Chamando o método 'desc_Triangulo'

    }

}
