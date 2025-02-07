package Matricez.Ejercicios;

/*Ejercicio 4:
Crear una matriz de tamaño 7x7 y rellenarla
de forma que los elementos de la diagonal principal sea 1 y el resto 0.
* */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Matriz
        int matriz [][] = new int[7][7]; // Tres filas y tres columnas

        // Llenar la matriz de acuerdo con la condición: 1 en la diagonal principal y 0 en el resto
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                // Si i == j, es la diagonal principal
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0; // Resto de la matriz se llena con 0
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz 7x7 con 1 en la diagonal principal y 0 en el resto:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Cambio de línea después de cada fila
        }
    }
}