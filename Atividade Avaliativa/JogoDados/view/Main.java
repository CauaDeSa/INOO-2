package JogoDados.view;
import JogoDados.model.*;

public class Main {
    public static void main(String[] args) {
        Partida p1 = new Partida();

        p1.jogar();
        p1.lancar();
        p1.lancar();
        p1.lancar();
        p1.lancar();
        
        p1.jogar();
        p1.lancar();
        p1.lancar();
        p1.parar();
    }
}