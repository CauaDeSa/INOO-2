import java.util.Scanner;
import model.*;

public class ClientCode{

    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
    
        System.out.printf("Destinatário: ");
        String destinatario = ler.nextLine();
    
        System.out.printf("Remetente: ");
        String remetente = ler.nextLine();
    
        CartaoWeb CartaoNatal = new Natal(destinatario, remetente);
        
        CartaoNatal.showMessage();
    }
}