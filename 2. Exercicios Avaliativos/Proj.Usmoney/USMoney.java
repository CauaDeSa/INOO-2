public class USMoney {
    private int dollars, cents;

    public USMoney(int dollars, int cents) {
        if (dollars < 0) {
            System.out.println("Invalid dollars value");
        }

        else if (cents < 0) {
            System.out.println("Invalid cents value");
        }

        else {
            if (cents > 99) {
                dollars += cents / 100;
                cents = cents % 100;
            }
    
            this.dollars = dollars;
            this.cents = cents;
        }
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public USMoney plus(USMoney bankB) {
        int dollars, cents;
        
        dollars = bankB.getDollars() + this.getDollars();
        cents = bankB.getCents() + this.getCents();
        
        if (cents > 99) {
            dollars += cents / 100;
            cents = cents % 100;
        }

        USMoney bankC = new USMoney(dollars, cents);
        return bankC;
    }
}