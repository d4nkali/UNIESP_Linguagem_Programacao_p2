package quest_3;

public class Triangulos {
    
    public void desc_Triangulo(double lado_1, double lado_2, double lado_3){ // Cria o método 'desc_Triangulo'

        if (lado_1 == lado_2 && lado_2 == lado_3) { // Se todos os lados forem iguais, então:
            
            System.out.println("É um triangulo equilatero."); // Imprime que é um triangulo equilatero

        }

        else if (lado_1 == lado_2 || lado_1 == lado_3 || lado_2 == lado_3){ // Se 2 lados forem iguais, então:

            System.out.println("É um triangulo isosceles."); // Imprime que é um triangulo isosceles

        }

        else{ // Senão for nenhuma das anteriores:

            System.out.println("É um triangulo escaleno."); // Imprime que é um triangulo escaleno

        }

    }

}
