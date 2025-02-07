/*Ejercicio 3: Guillermo tiene N dólares.
Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que
tiene entre los tres.
* */
package EjerciciosOperadores;

import java.util.Scanner;

public class AveriguarCantidadDinero2 {

    public static void main(String[] args ) {
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total; //Se definen las variables sin valor

        System.out.println("Digite la cantidad de dinero que tiene Guillermo: ");
        guillermo = entrada.nextFloat();

        luis = guillermo/2; //Luis tiene la mitad de lo que tiene guillermo
        juan = (guillermo+luis)/2; //Juan tiene la mitad de lo que tiene luis y guillermo

        total = guillermo+luis+juan;

        System.out.println("La cantidad de dinero entre los 3 es: "+total);



    }
}
