import java.util.Random;

public class Dado {
    
    Random generator = new Random();
    int value;

    public int Dado(){
        value = 0;
    }

    public int jogar(){
        value = generator.nextInt(6) + 1;
        return value;
    }
}