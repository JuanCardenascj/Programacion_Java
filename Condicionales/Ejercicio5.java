/*Ejercicio 5
* Un obrero necesita calcular su salario semanal,
* el cual se obtiene de la siguiente manera:
* 1. Si trabaja 40 horas o menos se le paga $16 por hora
* 2. si trabaja mas de 40 horas se le paga $16 por cada una de las primeras
* 40 horas y $20 por cada hora extra.*/

package Condicionales;

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de horas trabajas"));

        if (horasTrabajadas <= 40) {
            salarioTotal = horasTrabajadas * 16;
        } else {
            salarioTotal = (40*16) + ((horasTrabajadas-40) * 20);
        }
        JOptionPane.showMessageDialog(null,"El salario total es: " + salarioTotal);
    }
}
