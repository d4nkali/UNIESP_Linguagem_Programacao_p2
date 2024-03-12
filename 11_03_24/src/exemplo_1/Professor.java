package exemplo_1;

public class Professor extends Pessoa {
    
    private int qtd_hora, valor_hora, salario; // Define as variaveis

    // Criando sets e gets

        public int getQtd_hora() {
            return this.qtd_hora;
        }

        public void setQtd_hora(int qtd_hora) {
            this.qtd_hora = qtd_hora;
        }

        public int getValor_hora() {
            return this.valor_hora;
        }

        public void setValor_hora(int valor_hora) {
            this.valor_hora = valor_hora;
        }

        public int getSalario() {
            return this.salario;
        }
    
        public void setSalario(int salario) {
            this.salario = salario;
        }
    
    public void calc_salario() { // Cria a função 'calc_salario'

        salario = (qtd_hora * valor_hora); // Calcula o salario
        System.out.println("O salario é de: " + salario); // Exibe as informações

    }
}
