package Arrays.Ejercicios;

/*Ejercicio7:
* Leer por teclado una serie de 10 numeros enteros.
* La aplicación debe indicarnos si los números están ordenados
* de forma creciente, decreciente, o si están desordenados.*/

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = false, decreciente = false;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++){
            System.out.println((i+1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        for (int i = 0; i < 9; i++){
            if (arreglo[i] < arreglo[i+1]) {
                creciente = true;
            } if (arreglo[i] > arreglo[i+1]){
                decreciente = true;
            }
        }

        if (creciente == true && decreciente == false){
            System.out.println("El arreglo esta en forma creciente");
        } else if (creciente==false && decreciente==true){
            System.out.println("El arreglo esta en forma decreciente");
        } else if (creciente==true && decreciente==true) {
            System.out.println("El arreglo esta en forma desordenado");
        } else if (creciente==false && decreciente==false) {
            System.out.println("El arreflo esta en forma igual");
        }
    }
}
