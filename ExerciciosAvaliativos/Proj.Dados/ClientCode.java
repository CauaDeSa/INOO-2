import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {

        Dado dado = new Dado();
        int result = 0;

        for (int i = 1; i < 4; i++) {
            result += dado.jogar();
            result += dado.jogar();
            
            System.out.println("Jogada [" + i + "]: " + result);

            result = 0;
        }
    }
}