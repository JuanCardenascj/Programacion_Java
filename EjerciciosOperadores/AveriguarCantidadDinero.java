package EjerciciosOperadores;

import java.util.Scanner;

public class AveriguarCantidadDinero {

    /*
    * Ejercicio 2
    * Hacer un programa que cacule e imprima el salario semanal de un empleado
    * apartir de sus horas semanales trabajadas y de su salario por hora*/

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int salarioMes = 1536000;
        int salarioSem = 384000;
        int SalarioDia = 64000;
        int valorHora = 8000;

        int horasSemanales, multiplicacion;
        System.out.println("Digite sus horas semanales trabajadas: ");
        horasSemanales = scanner.nextInt();

        multiplicacion = horasSemanales*valorHora;
        System.out.println("El salario semanal es: "+multiplicacion);

    }
}
