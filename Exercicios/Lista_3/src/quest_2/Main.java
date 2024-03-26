package quest_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Televisao t = new Televisao();
        Smartphone s = new Smartphone();

        int perg;

        System.out.print("Voce deseja Cradrastar uma Televisão [1] ou Smartphone [2]?: ");
        perg = sc.nextInt();

        switch (perg) {

            case 1:

                System.out.println("Criando o cadrastro da televisão");
                System.out.println();
                
                System.out.print("Digite o nome/marca da televisão: ");
                t.setNome(sc.next());
                System.out.print("Digite a quantidade do produto no estoque: ");
                t.setEstoque(sc.nextInt());
                System.out.print("Digite o preço desse produto: ");
                t.setPreço(sc.nextDouble());

                System.out.println("Exebindo o cadrastro da televisão");
                System.out.println();

                System.out.println(t.getNome());
                System.out.println(t.getEstoque());
                System.out.println(t.getPreço());

                break;
        
            default:

                System.out.println("Valor invalido");
                break;

        }

    }

}