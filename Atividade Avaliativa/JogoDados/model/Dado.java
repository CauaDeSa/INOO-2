package JogoDados.model;

import java.util.Random;

public class Dado {
    Random rng = new Random();

    private int face;

    public Dado(){
        this.face = 0;    
    }

    public int getFace(){
        return face;
    }

    public void jogarDado(){
        this.face = rng.nextInt(6) + 1;
    } 
}
