import java.util.Scanner;

public class Candidato{
    Scanner scan = new Scanner(System.in);
    private String nome;
    private int notaTeorica;
    private int notaPratica;
    private int notaEntrevista;

    public Candidato(String nome){
        this.nome = nome;
        this.notaTeorica = 0;
        this.notaPratica = 0;
        this.notaEntrevista = 0;
    }

    public Candidato(String nome, int notaTeorica, int notaPratica, int notaEntrevista){
        this.nome = nome;
        this.notaTeorica = notaTeorica;
        this.notaPratica = notaPratica;
        this.notaEntrevista = notaEntrevista;
    }

    public void setNome(String nome){
        if (nome.length() == 0){
            System.out.println("Nome inválido");

            do{
                System.out.println("Digite um nome válido: ");
                nome = scan.nextLine();
            } while (nome.length() == 0);
        }

        this.nome = nome;
    }
    
    public void setNotaTeorica(int notaTeorica){
        if (notaTeorica < 0 || notaTeorica > 100){
            System.out.println("Nota teórica inválida");

            do{
                System.out.println("Digite uma nota teórica válida: ");
                notaTeorica = scan.nextInt();
            } while (notaTeorica < 0 || notaTeorica > 100);

        } 

        this.notaTeorica = notaTeorica;
    }

    public void setNotaPratica(int notaPratica){
        if (notaPratica < 0 || notaPratica > 100){
            System.out.println("Nota prática inválida");

            do{
                System.out.println("Digite uma nota prática válida: ");
                notaPratica = scan.nextInt();
            } while (notaPratica < 0 || notaPratica > 100);

        }

        this.notaPratica = notaPratica;
    }

    public void setNotaEntrevista(int notaEntrevista){
        if (notaEntrevista < 0 || notaEntrevista > 100){
            System.out.println("Nota entrevista inválida");

            do{
                System.out.println("Digite uma nota de entrevista válida: ");
                notaEntrevista = scan.nextInt();
            } while (notaEntrevista < 0 || notaEntrevista > 100);
        }

        this.notaEntrevista = notaEntrevista;
    }

    public String getNome(){
        return nome;
    }
    
    public int getNotaTeorica(){
        return notaTeorica;
    }

    public int getNotaPratica(){
        return notaPratica;
    }

    public int getNotaEntrevista(){
        return notaEntrevista;
    }

    public int getNotaFinal(){
        return (int) ((getNotaTeorica() * 0.3) + (getNotaPratica() * 0.4) + (getNotaEntrevista() * 0.3));
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + " - Nota final: " + getNotaFinal() + " { nota teórica: " + getNotaTeorica() + ", nota prática: " + getNotaPratica() + ", nota entrevista: " + getNotaEntrevista() + "}\n";
    }
}