package Ciclos_Bucles;

import javax.swing.*;

/*Ejercicio 2:
Leer un número e indicar si es positivo o negativo
El proceso se repetirá hasta que se introduzca un 0.
* */
public class Ejercicio2 {
    public static void main(String[] args){

        int numero;

        // Iniciar un bucle que continuará hasta que el número sea 0
        do {
            // Pedir al usuario que ingrese un número
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (0 para salir):"));

            // Verificar si el número es positivo, negativo o 0
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo.");
            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo.");
            } else {
                JOptionPane.showMessageDialog(null, "Has introducido 0, el programa terminará.");
            }
        } while (numero != 0); // El bucle se repite hasta que se ingrese un 0
    }
}
