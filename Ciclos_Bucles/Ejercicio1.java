package Ciclos_Bucles;

/*Ejercicio 1:
* Leer un número y mostrar su cuadrado, repetir el proceso
* hasta que se introduzca un  número negativo*/

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Declara variables
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero >= 0); { //Mientras el numero sea 0 o positivo
            cuadrado = (int) Math.pow(numero,2);

            JOptionPane.showMessageDialog(null,"El numero: " + numero + "Elevado al cuadrado es: " +cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
    }
}
