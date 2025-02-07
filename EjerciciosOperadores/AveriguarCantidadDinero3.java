
/*Ejercicio 4:
Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales
mas una comisión de $150 por cada carro vendido, mas el 5% del valor de la venta por carro.
Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
* */
package EjerciciosOperadores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AveriguarCantidadDinero3 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        float salarioBase = 1000f;
        float comisionFija = 150f;
        float porcentajeComision = 0.05f; // 5% de la venta por carro
        float salarioTotal;

        // Solicitar el número de carros vendidos
        System.out.println("Digite la cantidad de carros vendidos en el mes: ");
        int carrosVendidos = entrada.nextInt();

        // Solicitar el valor promedio de venta de cada carro
        System.out.println("Digite el valor promedio de los carros vendidos: ");
        float valorVenta = entrada.nextFloat();

        // Calcular el salario total
        float comisionPorCarrosVendidos = carrosVendidos * comisionFija;
        float comisionPorPorcentajeVenta = carrosVendidos * valorVenta * porcentajeComision;
        salarioTotal = salarioBase + comisionPorCarrosVendidos + comisionPorPorcentajeVenta;

        // Mostrar el salario total
        System.out.println("El salario total del vendedor es: $" + salarioTotal);
    }
}
