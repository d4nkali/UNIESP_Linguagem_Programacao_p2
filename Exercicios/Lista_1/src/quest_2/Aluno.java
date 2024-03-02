package quest_2;

public class Aluno { // Cria a classe Aluno
    
    String nome; // Cria a variavel 'nome' do tipo String

    // Criam variaveis do tipo Double (Float)

    Double nota_1;
    Double nota_2;
    Double nota_3;
    Double media;

    public void calcular_media(){ // Cria a função 'calcular_media'

        media = (nota_1+nota_2+nota_3) / 3; // Calcula e armazena na variavel 'media'

    }

}
