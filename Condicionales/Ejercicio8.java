/*Ejercicio 8:
* Pedir un número entre 0 y 99 999 y decir cuántas cifras tiene*/

package Condicionales;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número entre 0 y 99,999
        System.out.print("Introduce un número entre 0 y 99,999: ");
        int numero = scanner.nextInt();

        // Comprobar que el número esté en el rango correcto
        if (numero < 0 || numero > 99999) {
            System.out.println("El número debe estar entre 0 y 99,999.");
        } else {
            // Convertir el número a una cadena y contar cuántas cifras tiene
            String numeroStr = String.valueOf(numero);
            System.out.println("El número tiene " + numeroStr.length() + " cifras.");
        }

        scanner.close();
    }
}
