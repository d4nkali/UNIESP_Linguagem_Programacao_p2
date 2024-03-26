package quest_2;

// ? Questão 2 - Elabore um programa para realizar o cadastro e venda.

import java.util.Scanner; // Importa a biblioteca

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //! Cria objeto de scanner do teclado

        //* Cria os objetos da Televisao e do Smartphone 

            Televisao t = new Televisao();
            Smartphone s = new Smartphone();

        // Cria as variaveis

            int perg;
            String perg_compra;

        // Pergunta ao usuario qual o produto que vai cradrastar
        System.out.print("Voce deseja Cradrastar uma Televisão [1] ou Smartphone [2]?: ");
        perg = sc.nextInt(); // Salva a resposta

        switch (perg) { //* Cria um switch de multiplas escolhas

            case 1: //* Se digitou 1:

                System.out.println("Criando o cadrastro da televisão...");
                System.out.println();

                // Pergunta e armazena as informações

                    System.out.print("Digite o nome/marca da televisão: ");
                    t.setNome(sc.next());
                    System.out.print("Digite a quantidade do produto no estoque: ");
                    t.setEstoque(sc.nextInt());
                    System.out.print("Digite o preço desse produto: ");
                    t.setPreço(sc.nextDouble());

                System.out.println("Exebindo o cadrastro da televisão...");
                System.out.println();

                // Imprime as informações atravez do get

                    System.out.println(t.getNome());
                    System.out.println(t.getEstoque());
                    System.out.println(t.getPreço());

                System.out.println();
                // Pergunta se quer vender o produto
                System.out.print("Deseja efetura a compra desse produto? (s/n): ");
                perg_compra = sc.next(); // Armazena em perg_compra
                perg_compra.toLowerCase(); // Converte a informação para caixa baixa

                if (perg_compra.equals("s")) { //* Se a resposta for 's', então:

                    // Pergunta e armazena as informações

                        System.out.println("Antes de comprar a televisão, teste algum canal");
                        System.out.print("Digite o canal que queira testar: ");
                        t.setCanal_cadrastrado(sc.nextInt());

                    t.acessarCanais(); //* Chama a função 'acessarCanais'

                    System.out.print("Digite a quantidade de produtos para a venda: ");
                    t.setQuant_venda(sc.nextInt());
                    t.venderProduto(); //* Chama a função 'venderProduto'

                }

                else { //* Senão: 

                    System.out.println("Sem efetuar a venda.");

                }

                break;

            case 2: //* Se digitou 2:

                System.out.println("Criando o cadrastro do smartphone...");
                System.out.println();

                // Pergunta e armazena as informações

                    System.out.print("Digite o nome/marca da smartphone: ");
                    s.setNome(sc.next());
                    System.out.print("Digite a quantidade do produto no estoque: ");
                    s.setEstoque(sc.nextInt());
                    System.out.print("Digite o preço desse produto: ");
                    s.setPreço(sc.nextDouble());

                System.out.println("Exebindo o cadrastro da smartphone...");
                System.out.println();

                // Imprime as informações atravez do get

                    System.out.println(s.getNome());
                    System.out.println(s.getEstoque());
                    System.out.println(s.getPreço());

                System.out.println();
                // Pergunta se quer vender o produto
                System.out.print("Deseja efetura a compra desse produto? (s/n): ");
                perg_compra = sc.next(); // Armazena em perg_compra
                perg_compra.toLowerCase(); // Converte para caixa baixa

                if (perg_compra.equals("s")) { //* Se a resposta for 's', então:

                    // Pergunta e armazena as informações

                        System.out.println("Antes de comprar o smartphone, teste ligando para algum numero");
                        System.out.print("Digite o numero para testar: ");
                        s.setNumero(sc.nextInt());

                    s.testeLigacao(); //* Chama a função 'testeLigacao'

                    System.out.print("Digite a quantidade de produtos para a venda: ");
                    s.setQuant_venda(sc.nextInt());

                    s.venderProduto(); //* Chama a função 'venderProduto'

                }

                else { //* Senão:

                    System.out.println("Sem efetuar a venda.");

                }

                break;

            default: //* Se foi outro valor

                System.out.println("Valor invalido"); // Imprime mensagem de erro
                break;

        }

    }

}