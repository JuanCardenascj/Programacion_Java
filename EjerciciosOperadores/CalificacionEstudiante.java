/*Ejercicio 5:
La calificaion final de un estudiante de informatica se calcula
con base a las calificaciones de cuatro aspectos de su rendimiento académico:
participación, primer examen parcial,segundo examen parcial y examen final.
La calificación final con ponderaciones del 10%, 25%, y 40%,
Hacer un programa que calcule e imprima la calificacion final obtenido por un estudiante.
* */

package EjerciciosOperadores;

import java.util.Scanner;

public class CalificacionEstudiante {
    public static void main(String[] args) {
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        Scanner entrada = new Scanner(System.in);

        //Pedir los datos necesarios al usuario
        System.out.println("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primerExamen: ");
        primerExamen = entrada.nextFloat();
        System.out.println("Digite la nota del segundoExamen: ");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digite la nota del examenFinal: ");
        examenFinal = entrada.nextFloat();

        //Sacamos calculos de los porcentajes
        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *=0.40f;

        //Sumamos las notas
        notaFinal = participacion+primerExamen+segundoExamen+examenFinal;

        System.out.println("La nota final es: " + notaFinal);



    }

}
