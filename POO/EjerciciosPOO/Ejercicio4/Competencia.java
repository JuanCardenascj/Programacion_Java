package POO.EjerciciosPOO.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Competencia {

    private List<Atleta> atletas;

    // Constructor
    public Competencia() {
        atletas = new ArrayList<>();
    }

    // Método para agregar un atleta
    public void agregarAtleta(Atleta atleta) {
        atletas.add(atleta);
    }

    // Método para obtener el ganador
    public Atleta obtenerGanador() {
        if (atletas.isEmpty()) {
            return null; // No hay atletas
        }

        Atleta ganador = atletas.get(0);

        for (Atleta atleta : atletas) {
            if (atleta.getTiempoCarrera() < ganador.getTiempoCarrera()) {
                ganador = atleta;
            }
        }

        return ganador;
    }

    // Método para mostrar los resultados
    public void mostrarResultados() {
        Atleta ganador = obtenerGanador();
        if (ganador != null) {
            System.out.println("El ganador de la competencia es:");
            System.out.println(ganador);
        } else {
            System.out.println("No hay atletas en la competencia.");
        }
    }

    public static void main(String[] args) {
        // Crear competencia
        Competencia competencia = new Competencia();

        // Agregar algunos atletas
        competencia.agregarAtleta(new Atleta(1, "Juan Pérez", 12.5));
        competencia.agregarAtleta(new Atleta(2, "Ana López", 11.2));
        competencia.agregarAtleta(new Atleta(3, "Carlos García", 13.0));

        // Mostrar el ganador
        competencia.mostrarResultados();
    }
}

