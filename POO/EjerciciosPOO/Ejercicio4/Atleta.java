package POO.EjerciciosPOO.Ejercicio4;

/*Ejercicio 4:
* Construir un programa para una competencia de atletismo, el programa debe gestionar
* una serie de atletas caracterizados por su número de atleta, nombre y tiempo de
* carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera*/

public class Atleta {
    //Atributos
    private int numeroAtleta;
    private String nombreAtleta;
    private double tiempoCarrera;

    //Consctrutor

    public Atleta(int numeroAtleta, String nombreAtleta, double tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombreAtleta = nombreAtleta;
        this.tiempoCarrera = tiempoCarrera;
    }

    //Getters and Setters
    public int getNumeroAtleta() {
        return numeroAtleta;
    }

    public void setNumeroAtleta(int numeroAtleta) {
        this.numeroAtleta = numeroAtleta;
    }

    public String getNombreAtleta() {
        return nombreAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public double getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(double tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    @Override
    public String toString(){
        return  "Atleta [Número: " + numeroAtleta + ", Nombre: " + nombreAtleta + ", Tiempo: " + tiempoCarrera + " segundos]";
    }
}
