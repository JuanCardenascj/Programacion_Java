package Matricez.Ejercicios;

/*Ejercicio 3:
* Crear y cargar una matriz de tamaño 3x3
* trasponerla y mostrarla.*/

import java.util.Scanner;

public class Ejercico3 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        //Matriz
        int matriz [][] = new int[3][3]; // Tres filas y tres columnas

        System.out.println("Digite la matriz");
        //Bucles Anidados
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Matriz: ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz Original: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(matriz[i][j]);
            }
            System.out.println("");
        }


        //Matriz Transpuesta
        //dos bucles anidados
        int aux;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        System.out.println("La matriz transpuesta es: ");
        for (int i =0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(matriz[i][j]+"");
            }
            System.out.println("");
        }
    }
}
