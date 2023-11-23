package Equipamentos.model;

public class Atomico {
    String nome;
    double preco;

    public Atomico(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getDescricao(){
        return "Equipamento: " + nome + " - preço: R$" + preco + "\n"; 
    }

    public double getPreco(){
        return preco;
    }
}
