import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        double media = 0;

        for(int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            media += input.nextDouble();
        }

        System.out.printf("Media: %.1lf\n", media / 10);
    }
}
