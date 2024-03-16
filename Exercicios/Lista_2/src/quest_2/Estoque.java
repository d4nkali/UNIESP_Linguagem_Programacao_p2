package quest_2;

public class Estoque {
    
    private int estoque_media; // Cria a variavel privada para calcular a media do estoque

    // Criam as variaveis do tipo inteiro
    int quant_atual, estoque_min, estoque_max;

    // Cria o get e set

        public int getEstoque_media() {
            return this.estoque_media;
        }

        public void setEstoque_media(int estoque_media) {
            this.estoque_media = estoque_media;
        }

        public int getQuant_atual() {
            return this.quant_atual;
        }

        public void setQuant_atual(int quant_atual) {
            this.quant_atual = quant_atual;
        }

        public int getEstoque_min() {
            return this.estoque_min;
        }

        public void setEstoque_min(int estoque_min) {
            this.estoque_min = estoque_min;
        }

        public int getEstoque_max() {
            return this.estoque_max;
        }

        public void setEstoque_max(int estoque_max) {
            this.estoque_max = estoque_max;
        }

    public void calc_media(){ // Cria o método 'calc_media'

        estoque_media = (estoque_max + estoque_min) / 2; // Calcula a media do estoque e guarda a informação

        if (estoque_media <= quant_atual ){ // Se a media do estoque for menor ou igual o que foi pedido, então:

            System.out.println("Não efetuar compra"); // Imprime que não pode comprar

        }

        else{ // Senão:

            System.out.println("Efetuar compra"); // Imprime para efetuar a compra

        }

    }

}
