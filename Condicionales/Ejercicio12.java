/*Ejercicio 12:
* Pedir una nota de 0 a 10 y mostrarla de la forma:
* Insuficinete, Suficiente, Bien, Notable y Sobresaliente.*/

package Condicionales;

import javax.swing.*;

public class Ejercicio12 {
    public static void main(String [] args) {
        int nota;
        char forma;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite su nota obtenida"));

        if (nota < 0 || nota > 10) {
            JOptionPane.showMessageDialog(null,"La nota ingresada no es válida.");
        } else if (nota < 5) {
            JOptionPane.showMessageDialog(null,"Insuficiente");
        } else if (nota >= 5 && nota < 6) {
            JOptionPane.showMessageDialog(null,"Suficiente");
        } else if (nota >= 6 && nota < 7) {
            JOptionPane.showMessageDialog(null,"Bien");
        } else if (nota >= 7 && nota < 8) {
            JOptionPane.showMessageDialog(null,"Notable");
        } else if (nota >= 8 && nota < 9) {
            JOptionPane.showMessageDialog(null,"Sobresaliente");
        } else if (nota >=9 && nota < 10){
            JOptionPane.showMessageDialog(null,"Excelente");
        } else {
            JOptionPane.showMessageDialog(null,"Enminecia");
        }
    }
}
