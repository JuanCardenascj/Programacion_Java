package Arrays.Ejercicios;

/*Ejercicio 5:
* Leer por telcoad dos tablas de 10 números enteros
* y mezclarlas en ua tercera de la forma:
* 1° de a
* 1° de b
* 2° de a*/

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];

        a = new int[10]; //Arreglo 10 elementos
        b = new int[10]; //Arreglo 10 elementos
        c = new int[20]; //Arreglo 20 elementos A - B

        //Pedimos el arreglo A
        System.out.println("Digite el primer arreglo A: ");
        for (int i = 0; i < 10 ; i++) {
            System.out.println((i+1) + "Digite un número: ");
            a[i] = entrada.nextInt();
        }

        //Pedimos el arreglo B
        System.out.print("Digite el primer arreglo A: ");
        for (int i = 0; i < 10 ; i++) {
            System.out.print((i+1) + "Digite un número: ");
            b[i] = entrada.nextInt();
        }

        //Pedimos el arreglo c, junta A y B.
        //Utilizamos Iterador I para a y b
        // y interador J para c

        int j = 0;
        for (int i = 0; i < 10; i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }

        System.out.print("El tercer arreglo es: ");
        for (int i = 0; i < 20; i++){
            System.out.print(c[i] + "");
        }





    }
}
