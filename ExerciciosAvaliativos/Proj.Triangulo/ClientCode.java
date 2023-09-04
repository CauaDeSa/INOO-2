import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangulo triangulo;

        float a, b, c;

        triangulo = new Triangulo(a, b, c);

        for (int i = 0; i != 5; i++) {
            System.out.println("Digite os três lados: ");

            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();

            if (triangulo.isEscaleno()) {
                System.out.println("É escaleno!");
            }

            else if (triangulo.isEquilatero()) {
                System.out.println("É equilátero!");
            }

            else if (triangulo.isIsoceles()) {
                System.out.println("É isoceles");
            }

            else{
                System.out.println("Não é um triângulo válido!");
            }
        }
    }
}
