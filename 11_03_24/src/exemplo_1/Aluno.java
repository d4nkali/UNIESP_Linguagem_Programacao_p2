package exemplo_1;

public class Aluno extends Pessoa{

    private double nota_1, nota_2, media; // Definindo as variaveis

    // Criando sets e gets

        public double getNota_1() {
            return this.nota_1;
        }

        public void setNota_1(double nota_1) {
            this.nota_1 = nota_1;
        }

        public double getNota_2() {
            return this.nota_2;
        }

        public void setNota_2(double nota_2) {
            this.nota_2 = nota_2;
        }

        public double getMedia() {
            return this.media;
        }

        public void setMedia(double media) {
            this.media = media;
        }


    public void calc_media() { // Criando a função 'calc_media'

        media = (nota_1 + nota_2) / 2; // Calcula a media
        System.out.println("A media foi de" + media); // Imprime os resultados
    
    }

}

