package Ciclos_Bucles;

/*Ejercicio 5:
* Realizar un juego para adivinar un número.
* Para ello generar un número aleatorio entre 0-100,
* y luego ir pidiendo números indicando "es mayor" o
* "es menor" según sea mayor o menor con respecto a N.
* El proceso termina cuando el usuario acierta y mostrar
* el número de intentos.*/

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Ejercicio5 {
    public static void main(String[] args) {

        int numero,aleatorio,contador = 0;


        aleatorio = (int) (Math.random()*100); //Genera un numero Aleatorio

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if (aleatorio > numero){
                System.out.println("Digite un numero mayor");
            } else {
                System.out.println("Digite un numero menor");
            }
            contador++; //Aumenta en 1 el contador
        } while (numero != aleatorio);

        System.out.println("Genial!! Adivinaste el número en: " + contador + " " + "intentos" );
    }
}
