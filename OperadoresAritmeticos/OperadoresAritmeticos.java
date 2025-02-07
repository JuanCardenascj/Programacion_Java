package OperadoresAritmeticos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperadoresAritmeticos {

    //Cinco Operaciones Fundamentales.

    public static void main(String[] args) {

        //Importa Scanner para que lea los datos que ingresa el usuario
        Scanner scanner = new Scanner(System.in);

        //Define Variables
        float numero1, numero2, suma,resta,multiplicacion,division,resto;

        //Le pedimos al usuario
        System.out.println("Digite 2 numeros: ");

        //Para guardar los numeros que se le pidan al usuario
        numero1 = scanner.nextFloat();
        numero2 = scanner.nextFloat();

        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion = numero1*numero2;
        division = numero1/numero2;
        resto = numero1%numero2; //Saca el resto o el residuo

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El residuo es: "+resto);


    }
}
