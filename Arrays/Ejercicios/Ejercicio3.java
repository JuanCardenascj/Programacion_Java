package Arrays.Ejercicios;

/*Ejercicio 3:
Leer 5 números por teclado, almacenarlos
en un arreglo y a continación realizar la media
de los números positivos, la media de los negativos y
contar el número de ceros.
* */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[5];
        float suma_positivos = 0, suma_negativos = 0, media_positivos, media_negativos;
        int conteo_positivos = 0, conteo_negativos = 0, conteo_ceros = 0;

        System.out.println("Guardando los números en el arreglo");
        for (int i = 0; i < 5; i++){
            System.out.println((i+1) + "Digite un número: ");
            numeros[i] = entrada.nextFloat();

            if (numeros[i] == 0){
                conteo_ceros++;
            } else if (numeros[i] > 0) {
                suma_positivos = numeros[i];
                conteo_positivos++;
            } else {
                suma_negativos += numeros[i];
                conteo_negativos++;
            }
        }

        //Media de los numeros positivos
        if (conteo_positivos == 0){
            System.out.println("No se puede sacar la media de los números positivos");
        } else {
            media_positivos = suma_positivos / conteo_positivos;
            System.out.println("La media de los numeros positivos: " + media_positivos);
        }

        //Media de los números negativos
        if (conteo_negativos == 0){
            System.out.println("No se puede sacar la media de los numeros negativos");
        } else {
            media_negativos = suma_negativos / conteo_negativos;
            System.out.println("La media de los numeros negativos es:" + media_negativos);
        }

        System.out.println("La cantidad de ceros es: " + conteo_ceros);


    }
}
