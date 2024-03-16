package quest_1;

public class Compra {

    private double preco_normal = 1.30, preco_desconto = 1.00; // Criam as variaveis privadas dos preços das maçãs

    int quant_maca; // Cria a variavel para a quantidade de maças
    double total; // Cria a variavel para o preço final

    // Cria os get e set das variaveis

        public double getTotal() {
            return this.total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

        public double getPreco_normal() {
            return this.preco_normal;
        }

        public void setPreco_normal(double preco_normal) {
            this.preco_normal = preco_normal;
        }

        public double getPreco_desconto() {
            return this.preco_desconto;
        }

        public void setPreco_desconto(double preco_desconto) {
            this.preco_desconto = preco_desconto;
        }

        public int getQuant_maca() {
            return this.quant_maca;
        }

        public void setQuant_maca(int quant_maca) {
            this.quant_maca = quant_maca;
        }    
    
    public void calc_maca() { // Cria o método 'calc_maca'

        if (quant_maca < 12) { // Se o usuario comprar menos de uma duzia, então:

            total = quant_maca * preco_normal; // Cobra o preço normal

        } 

        else { // Senão:

            total = quant_maca * preco_desconto; // Aplica o preço com desconto

        }

        setTotal(total); // Armazena o valor do total

    }

}
