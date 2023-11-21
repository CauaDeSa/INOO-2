public class DiaDosNamorados extends CartaoWeb{
    
    public DiaDosNamorados(String destinatario, String remetente){
        super(destinatario, remetente);
    }

    public String getMessage(){
        return ",\nFeliz Dia dos Namorados!\nDe coração,\n";
    }
}