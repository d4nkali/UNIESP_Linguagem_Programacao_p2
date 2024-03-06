package quest_2;

public class Estoque {
    
    private int estoque_media; // Cria a variavel privada para calcular a media do estoque

    public void calc_media(int estoque_max, int estoque_min, int quant_atual){ // Cria o método 'calc_media'

        estoque_media = (estoque_max + estoque_min) / 2; // Calcula a media do estoque e guarda a informação

        if (estoque_media <= quant_atual ){ // Se a media do estoque for menor ou igual o que foi pedido, então:

            System.out.println("Não efetuar compra"); // Imprime que não pode comprar

        }

        else{ // Senão:

            System.out.println("Efetuar compra"); // Imprime para efetuar a compra

        }

    }

}
