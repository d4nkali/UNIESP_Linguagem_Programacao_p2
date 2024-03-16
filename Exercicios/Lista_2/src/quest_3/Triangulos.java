package quest_3;

public class Triangulos {
    
    double lado_1, lado_2, lado_3; // Criam as variaveis do tipo double (float)

    // Gerando set e get

        public double getLado_1() {
            return this.lado_1;
        }

        public void setLado_1(double lado_1) {
            this.lado_1 = lado_1;
        }

        public double getLado_2() {
            return this.lado_2;
        }

        public void setLado_2(double lado_2) {
            this.lado_2 = lado_2;
        }

        public double getLado_3() {
            return this.lado_3;
        }

        public void setLado_3(double lado_3) {
            this.lado_3 = lado_3;
        }

    public void desc_Triangulo(){ // Cria o método 'desc_Triangulo'

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
