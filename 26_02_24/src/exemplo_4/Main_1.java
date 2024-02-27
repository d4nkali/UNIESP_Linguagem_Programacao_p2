package exemplo_4;

import java.util.Scanner;

public class Main_1 {
    
    public static void main(String[] args) {
        
        Calculadora_1 c1 = new Calculadora_1();
        Scanner sc = new Scanner(System.in);

        int n1,n2;
        System.out.print("Digite o 1° numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite o 2° numero: ");
        n2 = sc.nextInt();
        System.out.println(c1.somar(n1,n2));

    }

}
