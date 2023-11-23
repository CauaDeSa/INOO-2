package Equipamentos.model;
import java.util.Scanner;
import java.util.ArrayList;

public class Composto extends Atomico{
    Scanner scan = new Scanner(System.in);
    private String nome;
    private double preco;
    private int choose;

    ArrayList<Atomico> itens;

    public Composto(String nome, double preco){
        super(nome, preco);
        itens = new ArrayList<>();
    }

    public void inserirParte(){
        System.out.printf("Nome da peça: ");
        nome = scan.nextLine();

        System.out.printf("Preço da peça: ");
        preco = scan.nextDouble();

        System.out.println("Equipamento é composto? ( Não - 0, Sim - 1 )");
        choose = scan.nextInt();

        if (choose == 1){
            Composto equipment = new Composto(nome, preco);

            do{
                equipment.inserirParte();
                System.out.printf("Deseja inserir mais uma peça? ( Não - 0, Sim - 1 )");
            } while (scan.nextInt() != 0);

            itens.add(equipment); 
        } else {
            Atomico equipment = new Atomico(nome, preco);
            itens.add(equipment); 
        }
    }

    @Override
    public String getDescricao() {
        String txt = super.getDescricao() + "É composto por:\n-----\n";

        for (Atomico element : itens) {
            txt += element.getDescricao();
        }

        txt += "\n-----";

        return txt;
    }
}
