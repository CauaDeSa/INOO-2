import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        float media = 0;

        for(int i = 0; i < 10; i++) {

            Scanner input = new Scanner(System.in);
            media += input.nextFloat();
        }

        System.out.printf("Media: %.1f\n", media / 10);
    }
}

