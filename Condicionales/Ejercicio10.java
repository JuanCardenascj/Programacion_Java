/*Ejercicio 10:
*Pedir el dia, mes y el año de una fecha e indicar si la fecha es correcta.
* Con meses de 28, 30 y 21 dias. Sin años bisiestos.! */

package Condicionales;

import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {

        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        // Validar el mes
        if (mes < 1 || mes > 12) {
            JOptionPane.showMessageDialog(null, "El mes es incorrecto");
        } else {
            // Validación del día según el mes
            boolean fechaCorrecta = false;

            switch (mes) {
                case 2: // Febrero (28 días)
                    if (dia >= 1 && dia <= 28) {
                        fechaCorrecta = true;
                    }
                    break;
                case 4: // Abril (30 días)
                case 6: // Junio (30 días)
                case 9: // Septiembre (30 días)
                case 11: // Noviembre (30 días)
                    if (dia >= 1 && dia <= 30) {
                        fechaCorrecta = true;
                    }
                    break;
                default: // Los demás meses tienen 31 días
                    if (dia >= 1 && dia <= 31) {
                        fechaCorrecta = true;
                    }
                    break;
            }

            // Validar el día y el año
            if (fechaCorrecta) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "La fecha es correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "El año es incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El día es incorrecto");
            }
        }
    }
}
