package EjerciciosOperadores;

import java.util.Scanner;

public class CalcularSumaNotas {

    public static void main(String[] args) {

        //Bloque Operadores.
        /*Ejercicio 1: Hacer un progrmaa que calcule e imprima la suma de tres calificaciones */

        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;

        System.out.println("Digite tres calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1+nota2+nota3; //Suma de las notas

        System.out.println("suma es: "+suma);


    }
}
