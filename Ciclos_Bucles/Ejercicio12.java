package Ciclos_Bucles;

/*Ejercicio 12:
* Pedir un número y calcular su factorial.*/

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número
        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Inicializar la variable para almacenar el factorial
        long factorial = 1;

        // Calcular el factorial utilizando un bucle
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // Multiplicar el valor actual de factorial por i
        }

        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        // Cerrar el scanner
        scanner.close();
    }
}