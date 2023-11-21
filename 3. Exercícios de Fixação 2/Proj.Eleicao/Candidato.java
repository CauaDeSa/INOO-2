public class Candidato {
    public String nome;
    public int código;
    public int votos;

    public Candidato(String nome, int código) {
        this.nome = nome;
        this.código = código;
        votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return código;
    }
    
    public int getVotos() {
        return votos;
    }

    public void votar() {
        votos++;
    }

    @Override
    public String toString() {
        return "Candidato: " + nome + " - Código: " + código + " - Votos: " + votos;
    }
}