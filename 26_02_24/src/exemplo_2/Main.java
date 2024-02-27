package exemplo_2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        p.nome = sc.next();

        System.out.println("Nome "+p.nome);

        System.out.println("Antiga "+p.idade);
        p.niver();

        System.out.println("Atual "+p.idade);
    }

}