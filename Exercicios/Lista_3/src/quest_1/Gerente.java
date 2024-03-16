package quest_1;

public class Gerente extends Funcionarios {  // Cria a classe 'Gerente' também contendo os atributos de 'Funcionarios'

    // Criam as variaveis privadas para essa classe
        
        private String departamento;
        private double bonus = 0.1, novo_salario;

    // Gera os get e set

        public String getDepartamento() {
            return this.departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public double getBonus() {
            return this.bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }
    
    public void calc_bonus() { // Cria a função 'calc_bonus'

        novo_salario = salario * bonus; // Calcula o slario apos o bonus

        // Imprime as informações
        System.out.println("Ola "+nome);
        System.out.println("Você é do departamento de: "+departamento);
        System.out.println("Seu salario com o acrecimo é de: "+novo_salario);

    }

}
