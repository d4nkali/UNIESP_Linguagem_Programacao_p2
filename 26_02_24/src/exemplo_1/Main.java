package exemplo_1;

public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();

        System.out.println("Nome "+p.nome);

        System.out.println("Antiga "+p.idade);
        p.niver();

        System.out.println("Atual "+p.idade);
    }

}