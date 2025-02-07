/*Ejercicio 2:
* Pedir dos números y decir cual es el mayor o
* si son iguales*/

package Condicionales;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "El número: " + numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "El número: " + numero2 + " es mayor que " + numero1);
        } else {
            JOptionPane.showMessageDialog(null, "Ambos números son iguales.");
        }
    }
}
