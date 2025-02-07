package POO.EjerciciosSoftware1;

public class Rectángulo extends Polígono {
    private double lado1;
    private double lado2;

    public Rectángulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectángulo: {" + super.toString() + " lado1 =" + lado1 + ", lado2 =" + lado2 + '}';
    }

    @Override
    public double area(){
        return lado1 * lado2;
    }
}
