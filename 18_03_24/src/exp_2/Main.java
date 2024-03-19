package exp_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Aluno a = new Aluno("João", 12345);
        Scanner sc = new Scanner(System.in);

        System.out.println("Imprimindo as informações: ");
        System.out.println();

        System.out.println("Nome: " + a.getNome());
        System.out.println("Matricula: " + a.getMatricula());

        System.out.println();
        System.out.println("Digite novas informações: ");
        System.out.println();

        System.out.print("Digite o novo nome: ");
        a.setNome(sc.next());
        System.out.print("Digite a nova matricula: ");
        a.setMatricula(sc.nextInt());

        System.out.println();
        System.out.println("Imprimindo as informações: ");
        System.out.println();

        System.out.println("Nome: " + a.getNome());
        System.out.println("Matricula: " + a.getMatricula());

    }
    
}
