package quest_1;

/*

Questão 1 - Elabore um programa que tenha uma classe chamada Funcionario com os seguintes atributos: 
nome e salario e crie duas subclasses: Gerente e Diretor, que herdam da classe Funcionário.

Na classe Gerente, adicione um atributo adicional chamado departamento (String). 
Nesta classe, o gerente possui um método para calcularBonus de 10% do salário.

Na classe Diretor, adicione um atributo adicional chamado ações (int) que representa a quantidade
de ações da empresa que o diretor possui.

Aluno: Danilo Pereira Viana - P2-B

*/

import java.util.Scanner; // Importando a biblioteca

public class Main { // Cria a classe 'Main'
    
    public static void main(String[] args) { // Cria a função principal
        
        Scanner sc = new Scanner(System.in); // Inicia o scanner do teclado
        Gerente g = new Gerente(); // Cria o objeto g e instancia ele para 'Gerente'
        Diretor d = new Diretor(); // Cria o objeto d e instancia ele para 'Diretor'

        int perg; // Cria a variavel inteira para a pergunta

        // Imprime a pergunta 
        System.out.print("Digite 1 se você é um Gerente ou digite 2 se você é Diretor: ");
        perg = sc.nextInt(); // Amazena o valor do teclado

        switch (perg) { // Se o teclado for:

            case 1:
                
                // Pergunta as informações e armazena nas variaveis

                    System.out.print("Digite seu nome: ");
                    g.setNome(sc.next());
                    System.out.print("Digite seu salario: ");
                    g.setSalario(sc.nextDouble());
                    System.out.print("Digite seu departamento: ");
                    g.setDepartamento(sc.next());
                    System.out.println();

                g.calc_bonus(); // Chama a função 'calc_bonus'

                break;

            case 2:

                // Pergunta as informações e armazena nas variaveis
                    
                    System.out.print("Digite seu nome: ");
                    d.setNome(sc.next());
                    System.out.print("Digite seu salario: ");
                    d.setSalario(sc.nextDouble());
                    System.out.print("Digite a a quantidade de ações que você possui: ");
                    d.setAcoes(sc.nextInt());
                    System.out.println();

                d.exe_infos_Diretor(); // Chama a função 'exe_infos_Diretor' 

                break;

            default: // Se não for nenhum dos anteriores, então:

                System.out.println("Operação errada"); // Imprime que esta errado 
                break;

        }

    }

}
