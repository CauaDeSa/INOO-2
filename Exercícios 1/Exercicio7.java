import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int H, P, F, D, i;

        H = input.nextInt();

        P = input.nextInt();

        F = input.nextInt();

        D = input.nextInt();

        if(D == 1){
            while(F != H && F != P){
                if(F == 15)
                    F = -1;

                System.out.printf("%d ", F);
                F++;
            }
            System.out.printf("\n");
        }
        
        else{
            while(F != H && F != P){
                if(F == 0)
                    F = 16;

                System.out.printf("%d ", F);
                F--;
            }
            System.out.printf("\n");
        }

        if(F == P)
            System.out.printf("N\n");

        else
            System.out.printf("S\n");
    }
}