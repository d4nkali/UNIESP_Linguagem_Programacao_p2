package quest_1;

public class Funcionarios { // Cria a classe Funcionarios
    
    int matricula; // Cria variavel do tipo inteiro para a matricula
    String nome; // Cria variavel do tipo string para guardar o nome
    double salario_bruto; // Cria variavel do tipo double para guardar o salario


    public void calc_deducao() { // Cria a função 'calc_deducao'

        double deducao = salario_bruto * 0.15; // Calcula a dedução do INSS e armazena em 'deducao'
        double salario_liquido = salario_bruto - deducao; // Calcula o salario liquido descontando a dedução no salario bruto

        System.out.println("Quanto sera deduzido do INSS (15%): " + deducao); // Imprime quanto foi de dedução
        System.out.println("Salario Liquido apos dedução: "+ salario_liquido); // Imprime o salario liquido
        return;

    }

}