package model;

public class Suco {
    public String sabor;
    public double custo;
    private Polpa polpaPrincipal, polpaSecundaria;

    public Suco(String saborPrincipal, int valorPrincipal, String saborSecundario, int valorComplementar) {
        polpaPrincipal = new Polpa(saborPrincipal, valorPrincipal);
        polpaSecundaria = new Polpa(saborSecundario, valorComplementar);
        this.sabor = "Suco de " + polpaPrincipal.getSabor() + " com " + polpaSecundaria.getSabor() + "\n";
        this.custo = polpaPrincipal.getCusto() + polpaSecundaria.getCusto();
    }

    public String getSabor() {
        return sabor;
    }

    private int getPreco(){
        return calcularPreco();
    }

    private int calcularPreco(){
        return Math.min(arredondar(custo * 1.35), 20);
    }

    private int arredondar(double valor){
        int result = (int) Math.round(valor);

        if (result < valor){
            result += 1;
        }

        return result;
    }

    @Override
    public String toString(){
        int preco = calcularPreco();
        String text = new String();

        text = sabor + "Custo de producao: R$" + custo + "\nPreco: R$" + preco +
                "\nStatus: ";
        if (custo > preco) {
            text = "Prejuízo ";
        } else if(custo < preco){
            text = "Lucro ";
        }

        text += "de: R$\n" + (custo - preco);

        return text;
    }
}