import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {

        Dado jogada = new Dado();
        int result = 0;

        for (int i = 1; i < 4; i++) {
            result += jogada.Dado();
            result += jogada.Dado();
            
            System.out.println("Jogada [" + i + "]: " + result);

            result = 0;
        }
    }
}