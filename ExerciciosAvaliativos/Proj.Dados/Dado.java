import java.util.Random;

public class Dado {
    
    Random generator = new Random();
    int result;

    public int Dado(){
        result = generator.nextInt(6) + 1;
        
        return result;
    }
}