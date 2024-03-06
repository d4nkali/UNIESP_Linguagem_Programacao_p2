package quest_3;

public class Calculadora { // Cria a classe Calculadora
    
    int total; // Cria a variavel inteira total

    public int somar(int n1, int n2){ // Cria a função 'somar'

        total = n1 + n2;
        return total;

    }

    public int subtracao(int n1, int n2) { // Cria a função 'subtracao'

        total = n1 - n2;
        return total;

    }

    public int multiplicacao(int n1, int n2) { // Cria a função 'multiplicacao'

        total = n1 * n2;
        return total;

    }

    public int divisao(int n1, int n2) { // Cria a função 'divisao'

        total = n1 / n2;
        return total;

    }

}
