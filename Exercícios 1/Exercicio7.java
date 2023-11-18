import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Helicopter, Police, Fugitive, Direction;

        Helicopter = input.nextInt();

        Police = input.nextInt();

        Fugitive = input.nextInt();

        Direction = input.nextInt();

        if(Direction == 1){
            while(Fugitive != Helicopter && Fugitive != Police){
                if(Fugitive == 15)
                    Fugitive = -1;

                System.out.printf("%d ", Fugitive);
                Fugitive++;
            }
            System.out.printf("\n");
        }
        
        else{
            while(Fugitive != Helicopter && Fugitive != Police){
                if(Fugitive == 0)
                    Fugitive = 16;

                System.out.printf("%d ", Fugitive);
                Fugitive--;
            }
            System.out.printf("\n");
        }

        if(Fugitive == Police)
            System.out.printf("N\n");

        else
            System.out.printf("S\n");
    }
}
