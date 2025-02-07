package Arrays;

import javax.swing.*;
import java.util.Scanner;

public class LLenar_Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Crea variable
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de enteros en el arreglo"));

        char[] letras = new char[nElementos]; //nElementos, son los elementos ingresados por el usuario

        System.out.println("Digite los elementos del arreglo:");
        for (int i = 0; i <  nElementos; i++){
            System.out.println((i+1) + "Digite un caracter: "); // I+1 Para que comience desde 1 el conteo
            letras[i] = entrada.next().charAt(0); //Letras[i] para guardar datos del escanner
        }

        System.out.println("Los caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++){
            System.out.println(letras[i] + " ");
        }

    }
}
