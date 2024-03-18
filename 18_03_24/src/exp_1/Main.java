package exp_1;

import java.util.Scanner;

public class Main {
    
public static void main(String[] args) {
    
    Carro c = new Carro("Chevrolet", "Ônix", 2022);
    Carro c1 = new Carro();
    Carro c2 = new Carro("Fiat", "Uno");

    Scanner sc = new Scanner(System.in);

    System.out.println("Imprimindo o carro 0: ");

    System.out.println(c.getMarca());
    System.out.println(c.getModelo());
    System.out.println(c.getAno());

    System.out.println();

    System.out.print("Mude a marca :");
    c.setMarca(sc.next());
    System.out.print("Mude o modelo: ");
    c.setModelo(sc.next());
    System.out.print("Mude o ano: ");
    c.setAno(sc.nextInt());

    System.out.println();
    System.out.println("Imprimindo o carro 0 novamente: ");
    System.out.println();

    System.out.println(c.getMarca());
    System.out.println(c.getModelo());
    System.out.println(c.getAno());

}

}
