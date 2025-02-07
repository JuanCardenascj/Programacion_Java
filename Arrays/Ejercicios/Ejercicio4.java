package Arrays.Ejercicios;

/*Ejercicio 4:
Leer 10 números enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden:
Primero, ultimo, segundo, penúltimo, tercer, etcc...
* */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        // Declarar un arreglo para almacenar 10 números
        int[] numeros = new int[10];

        // Leer 10 números enteros y guardarlos en el arreglo
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar los números en el orden especificado
        System.out.println("Números en el orden solicitado:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]); // Muestra el número en la posición i (primero, segundo, tercero, etc.)
            System.out.println(numeros[9 - i]); // Muestra el número en la posición 9 - i (último, penúltimo, etc.)
        }
    }
}