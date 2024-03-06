package quest_1;

public class Compra {

    // Criam as variaveis privadas dos preços das maçãs

    private double preco_normal = 1.30;
    private double preco_desconto = 1.00;

    public double calc_maca(int quant_maca) { // Cria o método 'calc_maca'

        double total; // Cria a variavel para o preço final

        if (quant_maca < 12) { // Se o usuario comprar menos de uma duzia, então:

            total = quant_maca * preco_normal; // Cobra o preço normal

        } 

        else { // Senão:

            total = quant_maca * preco_desconto; // Aplica o preço com desconto

        }

        return total;

    }

}
