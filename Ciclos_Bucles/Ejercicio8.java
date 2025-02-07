package Ciclos_Bucles;

/*Ejercicio 8:
* Pedir un número N,
* y mostrar todos los números del 1 al N*/

import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {

        int N = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número N;"));

        // Usar un ciclo for para mostrar los números del 1 al N
        StringBuilder resultado = new StringBuilder(); // Para almacenar los números en un solo string

        for (int i = 1; i <= N; i++) {
            resultado.append(i).append("\n"); // Agregar el número actual y un salto de línea
        }

        // Mostrar los números del 1 al N
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
