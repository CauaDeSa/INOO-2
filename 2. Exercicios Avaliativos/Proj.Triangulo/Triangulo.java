public class Triangulo {

    private int lado1, lado2, lado3;

    public Triangulo (int lado1, int lado2, int lado3) {
        
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;   
    }

    private boolean isTriangulo(){
        return lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2;
    }

    public boolean isEquilatero(){
        if (isTriangulo()){
            return lado1 == lado2 && lado2 == lado3;
        }

        return false;
    }

    public boolean isEscaleno(){
        if (isTriangulo()){
            return lado1 != lado2 && lado2 != lado3 && lado3 != lado1;
        }

        return false;
    }

    public boolean isIsoceles(){
        if(isTriangulo()){
            return lado1 == lado2 || lado2 == lado3 || lado3 == lado1;
        }

        return false;
    }
}