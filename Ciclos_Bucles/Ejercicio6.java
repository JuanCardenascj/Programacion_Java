package Ciclos_Bucles;

/*Ejercici 6:
* Pedir números hasta que se teclee un 0,
* mostrar la suma de todos los numeros introducidos.*/

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        int numero, suma = 0;

        // Solicitar al usuario que ingrese un número
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));

        // Bucle que se ejecuta mientras el número no sea 0
        while (numero != 0) {
            suma += numero;  // Sumar el número a la variable suma

            // Pedir un nuevo número
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 para terminar):"));
        }

        // Mostrar la suma total de los números introducidos
        JOptionPane.showMessageDialog(null, "La suma de los números introducidos es: " + suma);
    }
}
