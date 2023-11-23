package JogoDados.model;
import java.util.Scanner;

public class Partida{
    private boolean playing;
    private int jogos;

    Jogador j1;

    Scanner scan = new Scanner(System.in);

    public Partida(){
        this.jogos = 3;
        this.playing = false;
    } 

    public void jogar(){
        if (!isPlaying()) {
            playing = true;
            
            System.out.printf("Nome jogador: ");            
            j1 = new Jogador(scan.nextLine());
        }
    }

    public void lancar(){
        if (isPlaying()){
            j1.jogarDados();
            setJogos();

            if (j1.getResultado() == 7 || j1.getResultado() == 11){
                System.out.println("VENCEU!");    
            } else {
                System.out.println("PERDEU!");
            }
        }
    }

    public void parar(){
        playing = false;
        jogos = 3;
    }

    private boolean isPlaying(){
        if (jogos == 0){
            playing = false;
            jogos = 3;
        }

        return playing;
    }

    private void setJogos(){
        jogos--;
    }
}
