package Arrays.Ejercicios;

/*Ejercicio 1:
* Leer 5 números, guardarlos en un arreglo y mostrarlos
* en el mismo orden introducido*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);
        float[] numeros = new float[5]; //Se Crea el Arreglo

        System.out.println("Guardando los datos en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + "Digite un numero: "); // I+1 Para el contador
            numeros[i] =entrada.nextFloat();
        }

        System.out.println("Imprimir los elementos del arreglo");
        for (float i : numeros){ //Imprime ForEach
            System.out.println(i);
        }
    }
}
