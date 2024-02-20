import java.util.Scanner;

public class Exer_1 {

    public static void main(String[] args) {

        String r;
        String nome;
        int idade;
        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Digite seu Nome: ");
            nome = sc.next();
            System.out.println("Digite sua Idade: ");
            idade = sc.nextInt();


        System.out.println("Para ver novamente, digite 'S'; Se não quiser executar, digite 'N'");
        r = sc.next();

        if (r.equalsIgnoreCase("N")){

            break;

        }

        }while (r.equalsIgnoreCase("S"));

    }

}