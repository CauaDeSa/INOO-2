import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        int numbersQuantity, next, frequency = 0, number = 0;

        Scanner input = new Scanner(System.in);
        numbersQuantity = input.nextInt();

        for(int i = 0; i < numbersQuantity; i++){
            next = input.nextInt();

            if(next > number){
                number = next;
                frequency = 0;
            }

            if(next = number)
                frequency++;
        }

        System.out.printf("Maior número: %d\nEle apareceu: %d vez(es)\n", number, frequency);
    }
}
