import java.util.Random;

public class Dado {
    
    Random generator = new Random();
    private int value;

    public Dado(){
        value = 0;
    }

    public void jogar(){
        value = generator.nextInt(6) + 1;
    }

    public int getValor(){
        return value;
    }
}