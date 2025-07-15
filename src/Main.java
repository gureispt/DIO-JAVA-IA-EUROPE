import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos ingressos você deseja ?");
        int tickets = sc.nextInt();
        sc.nextLine();
        //
            System.out.println("Qual o filme ?");
            String filmName = sc.nextLine();
            System.out.println("Dublado ou legendado ?");
            String tipe = sc.nextLine();
            sc.nextLine();
            HalfTicket half = new HalfTicket(20, filmName, tipe);
            FamilyTicket family = new FamilyTicket(15, filmName, tipe, tickets);

            System.out.println("Ingresso Meia Entrada:");
            System.out.println("Filme: " + half.filmName);
            System.out.println("Tipo: " + half.tipe);
            System.out.println("Valor: R$" + half.getValue());
            System.out.println("-----------------------------");

            System.out.println("Ingresso Familia:");
            System.out.println("Filme: " + family.filmName);
            System.out.println("Tipo: " + family.tipe);
            System.out.println("Valor: R$" + family.getValue());
            System.out.println("-----------------------------");
    }
}
