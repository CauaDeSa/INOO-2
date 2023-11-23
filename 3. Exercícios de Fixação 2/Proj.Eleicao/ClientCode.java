import java.util.Scanner;

public class ClientCode {
    public static void main (String[] args) {
        Candidato c1 = new Candidato("Vaccare", 1);
        Candidato c2 = new Candidato("Filipe", 2);
        Candidato c3 = new Candidato("Mahara", 3);
        Scanner scan = new Scanner(System.in);
        
        int branco = 0;
        int nulo = 0;

        do {
            System.out.println("Digite o código do candidato: ");
            int voto = scan.nextInt();

            if (voto == c1.getCodigo()) {
                c1.votar();
            } else if (voto == c2.getCodigo()) {
                c2.votar();
            } else if (voto == c3.getCodigo()) {
                c3.votar();
            } else if (voto == 4) {
                nulo++;
            } else if (voto == 5) {
                branco++;
            } else {
                System.out.println("Código inválido!");
            }

            System.out.println("Deseja continuar? (1 - Sim / 0 - Não)");
        } while (scan.nextInt() == 1);

        System.out.println("Quantidade de votos:");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println("Nulos: " + nulo);
        System.out.println("Brancos: " + branco);
    }
}