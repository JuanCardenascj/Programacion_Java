package Ciclos_Bucles;

/*Ejercicio 14:
* Pedir 10 sueldos.
* Mostrar su suma y cuantos hay mayores de $1000.*/

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar variables
        double sumaSueldos = 0;
        int countMayores1000 = 0;

        // Pedir 10 sueldos
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el sueldo " + i + ": ");
            double sueldo = scanner.nextDouble();

            // Sumar el sueldo al total
            sumaSueldos += sueldo;

            // Contar cuántos sueldos son mayores a 1000
            if (sueldo > 1000) {
                countMayores1000++;
            }
        }

        // Mostrar los resultados
        System.out.println("La suma total de los sueldos es: $" + sumaSueldos);
        System.out.println("Cantidad de sueldos mayores a $1000: " + countMayores1000);

        // Cerrar el scanner
        scanner.close();
    }
}
