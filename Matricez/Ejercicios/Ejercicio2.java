package Matricez.Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Definir el tamaño de las matrices (3x3 en este caso)
        int nFilas = 3, nCol = 3;

        // Crear las dos matrices de tamaño 3x3
        int[][] matriz1 = new int[nFilas][nCol];
        int[][] matriz2 = new int[nFilas][nCol];
        int[][] suma = new int[nFilas][nCol];  // Matriz para guardar la suma

        // Entrada para la primera matriz
        System.out.println("Digite los valores para la primera matriz (3x3): ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        // Entrada para la segunda matriz
        System.out.println("Digite los valores para la segunda matriz (3x3): ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        // Sumar las dos matrices
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Mostrar la suma de las matrices
        System.out.println("La suma de las matrices es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();  // Cambiar de línea después de cada fila
        }
    }
}
