import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
        int lines, count = 1, value = 1;
        
        Scanner input = new Scanner(System.in);
        lines = input.nextInt();

        for(int j = 0; j < lines; j++){
            for(int i = 0; i < count; i++){
                if(i == 0)
                    System.out.printf("%d", value++);
                
                else
                    System.out.printf(" %d", value++);
            }

            count++;

            System.out.printf("\n");
        }
    }
}
