package view;

import model.Suco;

import java.util.ArrayList;
import java.util.List;

public class Cantina {
    public List<Suco> suco;
    public int quantidadeVendidos;

    public Cantina(int polpaPrincipal, int polpaComplementar) {
        suco = new ArrayList<>();
        quantidadeVendidos = -1;
    }

    public void pedirSuco(String saborPrincipal, int valorPrincipal, String saborComplementar, int valorComplementar){
        suco.add(new Suco(saborPrincipal, valorPrincipal, saborComplementar, valorComplementar));
        quantidadeVendidos++;
    }

    public String getSabor(){
        return suco.get(quantidadeVendidos).sabor;
    }

    public int getQuantidadeVendidos() {
        return quantidadeVendidos;
    }

    public Suco getPedido(int numeroPedido) {
        return suco.get(numeroPedido - 1);
    }
}
