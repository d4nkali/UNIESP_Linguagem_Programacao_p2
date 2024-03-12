package exemplo_1;

import java.util.Scanner; // Importa a biblioteca

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Inicia o scanner

        Professor p = new Professor();
        Aluno a = new Aluno();

        int perg_loggin;

        System.out.print("Você é Aluno digite 1 ou Professor digite 2: ");
        perg_loggin = sc.nextInt();

        switch (perg_loggin) {

            case 1:
                
                System.out.print("Digite sua primeira nota: ");
                a.setNota_1(sc.nextDouble());
                System.out.print("Digite sua segunda nota: ");
                a.setNota_2(sc.nextDouble());

                a.calc_media();
                break;

            case 2:

                System.out.print("Digite a quantidade de horas trabalhadas: ");
                p.setQtd_hora(sc.nextInt());
                System.out.print("Digite o valor da hora trabalhada: ");
                p.setValor_hora(sc.nextInt());

                p.calc_salario();
                break;

            default:

                System.out.println("Valor errado");
                break;

        }

    }
}
