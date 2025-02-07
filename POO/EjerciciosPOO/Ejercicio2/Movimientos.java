package POO.EjerciciosPOO.Ejercicio2;

/*Ejercicio 2:
* Construir un programa que permita dirigir el movimiento de un objeto
* dentro de un tablero y actualice de un objeto dentro de un tablero
* y actualice su posición dentro del mismo. Los movimientos posibles
* son ARRIBA, ABAJO, IZQUIERDA Y DERECHA. Tras cada movimineto el programa
* mostrará la nueva direccion elegida y las coordenadas de situación del
* objeto del tablero*/

import java.util.Scanner;

public class Movimientos {

    // Coordenadas del objeto
    private int x, y;

    // Constructor que inicializa las coordenadas
    public Movimientos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método para mover el objeto
    public void mover(String direccion) {
        switch (direccion.toUpperCase()) {
            case "ARRIBA":
                y--;
                break;
            case "ABAJO":
                y++;
                break;
            case "IZQUIERDA":
                x--;
                break;
            case "DERECHA":
                x++;
                break;
            default:
                System.out.println("Dirección no válida.");
                return;
        }
        // Mostrar nueva dirección y coordenadas
        System.out.println("Dirección elegida: " + direccion);
        System.out.println("Posición actual: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto con posición inicial
        Movimientos objeto = new Movimientos(5, 5); // Empezamos en la posición (5, 5)

        while (true) {
            // Solicitar movimiento
            System.out.println("Introduce una dirección (ARRIBA, ABAJO, IZQUIERDA, DERECHA) o 'salir' para terminar:");
            String direccion = scanner.nextLine();

            // Salir si el usuario lo desea
            if (direccion.equalsIgnoreCase("salir")) {
                break;
            }

            // Mover el objeto en la dirección indicada
            objeto.mover(direccion);
        }

        scanner.close();
    }
}
