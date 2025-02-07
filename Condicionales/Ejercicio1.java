/*Ejercicio 1:
Hacer un programa que lea un numero entero y muestre
si el numero es multiplo de 10.
* */

package Condicionales;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if (numero%10 == 0) { // modd - % (divide el numero)
            JOptionPane.showMessageDialog(null,"El numero " + numero + "es multiplo de 10" );
        } else {
            JOptionPane.showMessageDialog(null,"El numero no es multiplo de 10");
        }
        }
}
