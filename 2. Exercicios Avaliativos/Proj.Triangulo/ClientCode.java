import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangulo triangulo;

        int a, b, c;

        for (int i = 0; i != 5; i++) {
            System.out.println("Digite os três lados: ");

            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            triangulo = new Triangulo(a, b, c);

            if (triangulo.isEscaleno()) {
                System.out.println("\nÉ escaleno!\n");
            }

            else if (triangulo.isEquilatero()) {
                System.out.println("\nÉ equilátero!\n");
            }

            else if (triangulo.isIsoceles()) {
                System.out.println("\nÉ isoceles!\n");
            }

            else{
                System.out.println("\nNão é um triângulo válido!\n");
            }
        }
    }
}
