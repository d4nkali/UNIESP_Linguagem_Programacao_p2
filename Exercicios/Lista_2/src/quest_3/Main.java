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

        // Criam as variaveis do tipo double (float)
        double lado_1, lado_2, lado_3;

        // Pergunta os lados e armazena nos repectivas variaveis 

            System.out.print("Digite o valor do 1° lado: ");
            lado_1 = sc.nextDouble();

            System.out.print("Digite o valor do 2° lado: ");
            lado_2 = sc.nextDouble();

            System.out.print("Digite o valor do 3° lado: ");
            lado_3 = sc.nextDouble();

        t.desc_Triangulo(lado_1, lado_2, lado_3); // Chamando o método 'desc_Triangulo'

    }

}
