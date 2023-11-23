package Equipamentos.view;
import Equipamentos.model.*;

public class Main {
    public static void main(String[] args){
        Atomico a1 = new Atomico("Mouse", 198.6);
        System.out.println(a1.getDescricao());

        Composto c1 = new Composto("PC", 2001.2);
        c1.inserirParte();
        c1.inserirParte();

        System.out.println(c1.getDescricao());
    }
}
