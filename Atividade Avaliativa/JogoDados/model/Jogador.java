package JogoDados.model;

public class Jogador{
    private String nome;
    private int vitorias;

    Dado d1 = new Dado();
    Dado d2 = new Dado();

    public Jogador(String nome){
        this.nome = nome;
        this.vitorias = 0;
    }

    public int getVitorias(){
        return vitorias;
    }

    public String getNome(){
        return nome;
    }

    public void jogarDados(){
        d1.jogarDado();
        d2.jogarDado();
    }

    public int getResultado(){
        int result = d1.getFace() + d2.getFace();

        return result;
    }

    public boolean isWinner(){
        return vitorias >= 2;
    }

    protected void win(){
        vitorias++;
    }
}