package quest_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Televisao t = new Televisao();
        Smartphone s = new Smartphone();

        int perg;
        String perg_compra;

        System.out.print("Voce deseja Cradrastar uma Televisão [1] ou Smartphone [2]?: ");
        perg = sc.nextInt();

        switch (perg) {

            case 1:

                System.out.println("Criando o cadrastro da televisão...");
                System.out.println();

                System.out.print("Digite o nome/marca da televisão: ");
                t.setNome(sc.next());
                System.out.print("Digite a quantidade do produto no estoque: ");
                t.setEstoque(sc.nextInt());
                System.out.print("Digite o preço desse produto: ");
                t.setPreço(sc.nextDouble());

                System.out.println("Exebindo o cadrastro da televisão...");
                System.out.println();

                System.out.println(t.getNome());
                System.out.println(t.getEstoque());
                System.out.println(t.getPreço());

                System.out.println();
                System.out.print("Deseja efetura a compra desse produto? (s/n): ");
                perg_compra = sc.next();
                perg_compra.toLowerCase();

                if (perg_compra.equals("s")) {

                    System.out.println("Antes de comprar a televisão, teste algum canal");
                    System.out.print("Digite o canal que queira testar: ");
                    t.setCanal_cadrastrado(sc.nextInt());
                    t.acessarCanais();

                    System.out.print("Digite a quantidade de produtos para a venda: ");
                    t.setQuant_venda(sc.nextInt());
                    t.vender_produto();

                }

                else {

                    System.out.println("Sem efetuar a venda.");

                }

                break;

            case 2:


            break;
        
            default:

                System.out.println("Valor invalido");
                break;

        }

    }

}