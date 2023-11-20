import java.util.Scanner;

public class ClientCode {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int dollars, cents;

        System.out.println("Dollars quantity: ");
        dollars = scan.nextInt();

        System.out.println("Cents quantity: ");
        cents = scan.nextInt();

        USMoney bancoA = new USMoney(dollars, cents);

        System.out.println("Dollars quantity: ");
        dollars = scan.nextInt();

        System.out.println("Cents quantity: ");
        cents = scan.nextInt();
        
        USMoney bancoB = new USMoney(dollars, cents);

        bancoA.plus(bancoB);
    }
}