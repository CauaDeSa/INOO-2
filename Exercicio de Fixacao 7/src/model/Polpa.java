package model;

public class Polpa {
    private String sabor;
    private int custo;

    public Polpa(String sabor, int custo){
        this.sabor = sabor;
        this.custo = custo;
    }

    public String getSabor() {
        return sabor;
    }

    public int getCusto() {
        return custo;
    }
}
