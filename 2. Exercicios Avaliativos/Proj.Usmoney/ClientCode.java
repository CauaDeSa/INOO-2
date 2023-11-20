import java.util.Scanner;

public class ClientCode {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int dollars, cents;

        System.out.println("(Bank A) Dollars quantity: ");
        dollars = scan.nextInt();

        System.out.println("(Bank A) Cents quantity: ");
        cents = scan.nextInt();

        USMoney bankA = new USMoney(dollars, cents);

        System.out.println("\n(Bank B) Dollars quantity: ");
        dollars = scan.nextInt();

        System.out.println("(Bank B) Cents quantity: ");
        cents = scan.nextInt();

        USMoney bankB = new USMoney(dollars, cents);

        USMoney bankC = bankA.plus(bankB);

        System.out.println("\n(Bank C) Dollars quantity: " + bankC.getDollars());
        System.out.println("(Bank C) Cents quantity: " + bankC.getCents());
    }
}