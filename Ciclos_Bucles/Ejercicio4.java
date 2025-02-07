package Ciclos_Bucles;

/*Ejercicio 4:
* Pedir números hasta que se teclee uno negativo,
* y mostrar cuántos números se han introducido..*/

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        int numero;
        int contador = 0;

        // Usar un ciclo do-while para seguir pidiendo números hasta que se ingrese uno negativo
        do {
            // Solicitar al usuario que ingrese un número
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));

            // Si el número no es negativo, incrementar el contador
            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);  // Continuar mientras el número ingresado sea positivo o cero

        // Mostrar el total de números ingresados
        JOptionPane.showMessageDialog(null, "Se han introducido " + contador + " números.");
    }
}
