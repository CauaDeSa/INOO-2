public class Natal extends CartaoWeb{

    public Natal(String destinatario, String remetente){
        super(destinatario, remetente);
    }

    public String getMessage(){
        return ",\nFeliz Natal!\nAh, sinto lhe informar que o Papai Noel não existe.\nDe,\n";
    }
}