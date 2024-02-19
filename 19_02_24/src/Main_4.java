import java.util.Scanner;

public class Main_4 {

    public static void main(String[] args) {

        String r;
        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Caso escolha 1: Xbox, Caso 2: PS5");
            int x = sc.nextInt();

            switch (x) {

                case 1:
                    
                    System.out.println("Boa escolha");
                    break;

                case 2:

                    System.out.println("Excelente escolha");
                    break;
            
                default:
                
                    System.out.println("Valor errado");
                    break;
            }

        System.out.println("Para ver novamente, digite 's'");
        r = sc.next();

        }while (r.equalsIgnoreCase(r));

    }

}