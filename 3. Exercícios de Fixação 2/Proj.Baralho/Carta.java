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

    public Value getNumero() {
        return value;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNumero(int numero) {
        this.value = define(numero);
    }

    public void setNaipe(String naipe) {
        this.naipe = define(naipe);
    }

    public static Value define(int arg){
        if(arg == 1)
            return Value.UM;
        else if(arg == 2)
            return Value.DOIS;
        else if(arg == 3)
            return Value.TRES;
        else if(arg == 4)
            return Value.QUATRO;
        else if(arg == 5)
            return Value.CINCO;
        else if(arg == 6)
            return Value.SEIS;
        else if(arg == 7)
            return Value.SETE;
        else if(arg == 8)
            return Value.OITO;
        else if(arg == 9)
            return Value.NOVE;
        else if(arg == 10)
            return Value.DEZ;
        else if(arg == 11)
            return Value.VALETE;
        else if(arg == 12)
            return Value.DAMA;
        else if(arg == 13)
            return Value.REI;
        return null;
    }

    public static Naipe define(String arg){
        if(arg.toUpperCase().equals("COPAS"))
            return Naipe.COPAS;
        else if(arg.toUpperCase().equals("OURO"))
            return Naipe.OURO;
        else if(arg.toUpperCase().equals("PAUS"))
            return Naipe.PAUS;
        else if(arg.toUpperCase().equals("ESPADA"))
            return Naipe.ESPADA;
        return null;
    }

    @Override
    public String toString() {
        return value + " de " + naipe;
    }
}