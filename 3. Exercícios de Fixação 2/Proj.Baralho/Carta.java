public class Carta {
    enum Value {
        UM, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REI
    }

    enum Naipe {
        COPAS, OURO, PAUS, ESPADA
    }

    Value value;
    Naipe naipe;

    public Carta(int numero, String naipe) {
        this.value = define(numero);
        this.naipe = define(naipe);
    }

    public int getNumero() {
        return numero;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNumero(int numero) {
        this.value = define(numero);
    }

    public void setNaipe(String naipe) {
        this.naipe = define(naipe);
    }

    public static Value define(String arg){
        if(arg.equals(1))
            return Value.UM;
        else if(arg.equals(2))
            return Value.DOIS;
        else if(arg.equals(3))
            return Value.TRES;
        else if(arg.equals(4))
            return Value.QUATRO;
        else if(arg.equals(5))
            return Value.CINCO;
        else if(arg.equals(6))
            return Value.SEIS;
        else if(arg.equals(7))
            return Value.SETE;
        else if(arg.equals(8))
            return Value.OITO;
        else if(arg.equals(9))
            return Value.NOVE;
        else if(arg.equals(10))
            return Value.DEZ;
        else if(arg.equals(11))
            return Value.VALETE;
        else if(arg.equals(12))
            return Value.DAMA;
        else if(arg.equals(13))
            return Value.REI;
        return null;
    }

    public static Naipe define(int arg){
        if(arg.equals(1))
            return Naipe.COPAS;
        else if(arg.equals(2))
            return Naipe.OURO;
        else if(arg.equals(3))
            return Naipe.PAUS;
        else if(arg.equals(4))
            return Naipe.ESPADA;
        return null;
    }

    @Override
    public String toString() {
        return numero + " de " + naipe;
    }
}