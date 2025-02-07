package Arrays.Ejercicios;
/*Ejercicio 6:
* Leer los datos correspondientes a dos tablas de 12
* elementos numéricos, y mezclarlos en una tercera de la forma:
* 3 de la tabla A, 3 de la B, y otros 3 de A, otros 3 de B, etc...*/

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            int a[], b[], c[];

            a = new int[12]; //Arreglo 10 elementos
            b = new int[12]; //Arreglo 10 elementos
            c = new int[24]; //Arreglo 20 elementos A - B

            //Pedimos el arreglo A
            System.out.println("Digite el primer arreglo A: ");
            for (int i = 0; i < 12 ; i++) {
                System.out.println((i+1) + "Digite un número: ");
                a[i] = entrada.nextInt();
            }

            //Pedimos el arreglo B
            System.out.print("Digite el primer arreglo A: ");
            for (int i = 0; i < 12 ; i++) {
                System.out.print((i+1) + "Digite un número: ");
                b[i] = entrada.nextInt();
            }

        // Mezclamos los arreglos A y B en C
        int j = 0;
        for (int i = 0; i < 12; i += 3) {
            // Copiamos 3 elementos de A a C
            c[j] = a[i];
            c[j + 1] = a[i + 1];
            c[j + 2] = a[i + 2];
            j += 3;

            // Copiamos 3 elementos de B a C
            c[j] = b[i];
            c[j + 1] = b[i + 1];
            c[j + 2] = b[i + 2];
            j += 3;
        }

        // Mostramos el arreglo C resultante
        System.out.println("El arreglo mezclado C es: ");
        for (int i = 0; i < 24; i++) {
            System.out.print(c[i] + " ");
        }
    }
}