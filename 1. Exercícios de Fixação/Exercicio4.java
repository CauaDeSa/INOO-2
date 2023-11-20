import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args) {
        int[] array;
        array = new int[20];
        int bigger = 0, minor = 0;

        for(int i = 0; i < 20; i++){

            Scanner input = new Scanner(System.in);
            array[i] = input.nextInt();
            
            if(i == 1)
                bigger = minor = array[0];

            if(i > 0)
            {
                if(minor > array[i])
                    minor = array[i];
                
                if(bigger < array[i])
                    bigger = array[i];
            }
        }

        System.out.printf("Maior: %d\nMenor: %d\n", bigger, minor);
    }
}
