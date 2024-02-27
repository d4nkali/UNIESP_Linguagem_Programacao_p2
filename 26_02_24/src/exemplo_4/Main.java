package exemplo_4;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º numero: ");
        c.n1 = sc.nextInt();

        System.out.print("Digite o 2° numero: ");
        c.n2 = sc.nextInt();

        c.somar();
        System.out.println(c.total);

    }

}
