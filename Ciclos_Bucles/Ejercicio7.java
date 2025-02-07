package Ciclos_Bucles;

/*Ejercicio 7:
* Pedir números hasta que se introduzca uno negativo,
* y calcular la medida.*/

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Ejercicio7 {
    public static void main(String[] args){

        int numero, elementos = 0, suma = 0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero >= 0) {
            suma = suma + numero; //suma iterativa
            elementos++; // Aumentamos en uno

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }

        if (elementos == 0) {
            System.out.println("Error! La division entre 0 no existe");
        } else {
            media = (float)suma/elementos;
            System.out.println("La media es: " + media);
        }


    }
}
