public class USMoney {
    int dollars, cents;

    public USMoney(int dollars, int cents) {
        
        while (cents > 99) {
            dollars += 1;
            cents -= 100;
        }

        this.dollars = dollars;
        this.cents = cents;
    }

    public void plus(USMoney bancoB) {
        int dollars, cents;
        
        dollars = bancoB.dollars + this.dollars;
        cents = bancoB.cents + this.cents;
        
        while (cents > 99) {
            dollars += 1;
            cents -= 100;
        }

        System.out.println("$" + dollars + "," + cents + "\n");
    }
}