package Ciclos_Bucles;

/*Ejercicio 3:
* Leer números hasta que se introduzca un 0.
* Para cada uno indicar si es par o impar.*/

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        int numero;

        // Solicitar al usuario que ingrese un número
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));

        while (numero != 0) { //Mientras el numero sea distinto de 0
            if (numero %2 == 0) { //Si el numero es par
                System.out.println("El numero " + numero + "es par");
            } else {
                System.out.println("El numero " + numero + " es impar");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número:"));
        }


    }
}