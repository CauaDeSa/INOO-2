public class ClientCode {
    public static void main (String[] args) {
        Cidade araraquara = new Cidade("Araraquara", 210000, 3.0);
        Cidade marilia = new Cidade("Marília", 230000, 2.0);

        int anos = 0;

        while (araraquara.getPopulacaoAtual() < marilia.getPopulacaoAtual()) {
            araraquara.crescerPopulacao();
            marilia.crescerPopulacao();
            
            System.out.println("Ano: " + anos + "\n");
            System.out.println(araraquara.toString());
            System.out.println(marilia.toString());
            
            anos++;
        }
    }
}