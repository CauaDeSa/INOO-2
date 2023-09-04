public class Triangulo {

    private float lado1, lado2, lado3;

    public Triangulo (float lado1, float lado2, float lado3) {
        
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