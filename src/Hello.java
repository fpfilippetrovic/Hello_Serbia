import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Za ispis teksa unesite broj 3!");
        Scanner scanner = new Scanner(System.in);
        int broj = scanner.nextInt();

        if (broj == 3) {
            System.out.println("Pozdrav Srbiji i njenim stanovnicima!");
        } else if (broj != 3){
            System.out.println("Netacan unos, sledeci put unesite broj 3!");
        }

        System.out.println("Po narodnoj krilatici, sta Srbina spasava?");
        String odgovor = scanner.next();
        String odgovor1 = "sloga";

        if (odgovor == odgovor1) {
            System.out.println("Cestitamo, Vi ste pravi Srbin!");
        } else if (odgovor != odgovor1) {
            System.out.println("Netacan odgovor!");
        }
    }
}
