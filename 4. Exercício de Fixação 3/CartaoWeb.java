public abstract class CartaoWeb{

    private String destinatario;
    private String remetente;

    public CartaoWeb(String destinatario, String remetente){
        this.destinatario = destinatario;
        this.remetente = remetente;
    }

    public void showMessage(){
        System.out.println(destinatario + getMessage() + remetente);
    }

    public abstract String getMessage();
}