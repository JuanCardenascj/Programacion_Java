/*Ejercicio 11:
* Construir un programa que simule el funcionamiento de una calculadora
* que puede realizar las cuatro operaciones aritmeticas basicas con valores numericos enteros.
* El usuario debe especificar la operacion con el primer caracter del primer
* parametro de la línea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para el
* producto y D o d para la division. */

package Condicionales;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Ejercicio11 {
    public static void main(String [] args) {
        int numero1, numero2, suma, resta, multiplicacion, division;
        char operacion;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar").charAt(0);

        switch (operacion){
            case 's':
            case 'S': suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null,"La suma es: " + suma);
            break;

            case 'r':
            case 'R': resta = numero1 - numero2;
            JOptionPane.showMessageDialog(null,"La resta es: " + resta);
                break;

            case 'p':
            case 'P':
            case 'm':
            case 'M': multiplicacion = numero1 * numero2;
            JOptionPane.showMessageDialog(null,"La multiplicacion es: " + multiplicacion);
                break;

            case 'd':
            case 'D': division = numero1 / numero2;
            JOptionPane.showMessageDialog(null,"La division es: " + division);
                break;
            default: JOptionPane.showMessageDialog(null,"Error se equivoco de operacion");
        }
    }
}
