public class Cidade {
    public String nome;
    public int populacaoAtual;
    public double taxaCrescimento;

    public Cidade(String nome, int populacaoAtual, double taxaCrescimento) {
        this.nome = nome;
        this.populacaoAtual = populacaoAtual;
        this.taxaCrescimento = taxaCrescimento;
    }

    public void setTaxaCrescimento(double taxaCrescimento) {
        this.taxaCrescimento = taxaCrescimento;
    }

    public int getPopulacaoAtual() {
        return populacaoAtual;
    }

    public double getTaxaCrescimento() {
        return taxaCrescimento;
    }

    public void crescerPopulacao() {
       setPopulacaoAtual((int) (this.populacaoAtual * this.taxaCrescimento));
    }

    private void setPopulacaoAtual(int populacaoAtual) {
        this.populacaoAtual = populacaoAtual;
    }

    @Override
    public String toString() {
        return "Cidade: " + nome + " - População atual: " + populacaoAtual;
    }
}