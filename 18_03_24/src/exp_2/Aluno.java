package exp_2;

public class Aluno extends Pessoa{

    private int matricula;

        public int getMatricula() {
            return this.matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

    public Aluno (String nome, int matricula) {

        super(nome);
        this.matricula = matricula;

    }
    
}
