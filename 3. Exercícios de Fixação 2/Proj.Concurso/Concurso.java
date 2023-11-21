import java.util.Scanner;

public class Concurso{
    public static void main(String[] args) {
        Candidato candidato1 = cadastrarCandidato();
        Candidato candidato2 = cadastrarCandidato();
        Candidato candidato3 = cadastrarCandidato();

        if (candidato1.getNotaFinal() < candidato2.getNotaFinal()){
            Candidato aux = candidato1;
            candidato1 = candidato2;
            candidato2 = aux;

        } else if (candidato2.getNotaFinal() < candidato3.getNotaFinal()){
            Candidato aux = candidato2;
            candidato2 = candidato3;
            candidato3 = aux;

        } else if (candidato1.getNotaFinal() < candidato2.getNotaFinal()){
            Candidato aux = candidato1;
            candidato1 = candidato2;
            candidato2 = aux;
        }

        System.out.println("1º lugar: " + candidato1.toString());
        System.out.println("2º lugar: " + candidato2.toString());
        System.out.println("3º lugar: " + candidato3.toString());
    }

    public static Candidato cadastrarCandidato(){
        String nome;
        int notaTeorica, notaPratica, notaEntrevista;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite o nome do candidato: ");
        nome = scan.nextLine();

        System.out.println("Digite a nota teórica do candidato: ");
        notaTeorica = scan.nextInt();

        System.out.println("Digite a nota prática do candidato: ");
        notaPratica = scan.nextInt();

        System.out.println("Digite a nota da entrevista do candidato: ");
        notaEntrevista = scan.nextInt();

        Candidato candidato = new Candidato(nome, notaTeorica, notaPratica, notaEntrevista);

        return candidato;
    }
}