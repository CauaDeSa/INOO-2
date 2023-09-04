import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        int n, i, number = 0, next, quantity = 0;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(i = 0; i < n; i++){
            next = input.nextInt();

            if(next > number){
                number = next;
                quantity = 0;
            }

            if(next = number)
                quantity++;
        }

        System.out.printf("Maior número: %d\nEle apareceu: %d vez(es)\n", number, quantity);
    }
}