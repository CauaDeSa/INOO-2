import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {

        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        int result = 0;

        for (int i = 1; i < 4; i++) {
            dado1.jogar();
            result += dado1.getValor();
            
            dado2.jogar();
            result += dado2.getValor();
            
            System.out.println("Jogada [" + i + "]: " + result);

            result = 0;
        }
    }
}