package quest_2;

public class Televisao extends Produtos{

    private int canal_cadrastrado; // Cria variavel privada

    // Definido o get e set

        public int getCanal_cadrastrado() {
            return this.canal_cadrastrado;
        }

        public void setCanal_cadrastrado(int canal_cadrastrado) {
            this.canal_cadrastrado = canal_cadrastrado;
        }

    public void acessarCanais() { //* Criando a função "acessarCanais"

        // Imprime as informações

            System.out.println("Testando canal " + getCanal_cadrastrado() + " ...");
            System.out.println("Canal " + getCanal_cadrastrado() + " esta funcionando.");
            System.out.println();

    }

}
