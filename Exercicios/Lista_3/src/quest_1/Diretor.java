package quest_1;

public class Diretor extends Funcionarios { // Cria a classe 'Diretor' também contendo os atributos de 'Funcionarios'
 
    private int acoes; // Cria a variavel privada para as ações

    // Gera os get e set

        public int getAcoes() {
            return this.acoes;
        }

        public void setAcoes(int acoes) {
            this.acoes = acoes;
        }

    public void exe_infos_Diretor() { // Cria a função 'exe_infos_Diretor'

        // Imprime as informações
        System.out.println("Ola "+nome);
        System.out.println("Seu salario é de: "+salario);
        System.out.println("Você tem "+acoes+"% das ações da empresa");

    }
    
}
