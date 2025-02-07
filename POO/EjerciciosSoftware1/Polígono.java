package POO.EjerciciosSoftware1;

public abstract class Polígono {
    protected int numeroLados;

    public Polígono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    //  Método toString - Sobre Escribe toString!
    @Override
    public String toString() {
        return "Polígono{" + "Numero Lados = " + numeroLados + '}';
    }

    //Declara el método area como abstracto
    public abstract double area();
}
