import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Za ispis teksa unesite broj 3!");
        Scanner scanner = new Scanner(System.in);
        int broj = scanner.nextInt();

        if (broj == 3) {
            System.out.println("Pozdrav Srbiji i njenim stanovnicima!");
        } else {
            System.out.println("Molimo Vas unesit broj 3!");
        }
    }
}
