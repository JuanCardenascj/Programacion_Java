/*Ejercicio 9:
* Pedir el díam mes y año de una fecha e indicar
* si la fechas es correcta. Suponiendo que todos los meses son de 30 dias*/

package Condicionales;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "La fecha es correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "El año es incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes es incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El día es incorrecto");
        }
    }
}

