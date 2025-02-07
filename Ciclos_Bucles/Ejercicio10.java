package Ciclos_Bucles;

/*Ejercicio 10:
* Pedir 10 números y escribir la suma total.*/

import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i <= 10; i++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero " + i + " :"));

            suma += numero;
        }

        JOptionPane.showMessageDialog(null,"La suma total de los 10 numeros es: " + suma);

    }
}
