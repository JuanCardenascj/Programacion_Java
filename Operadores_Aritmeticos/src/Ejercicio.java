import java.util.Scanner;

public class Ejercicio {

    /*Cree un programa donde se evidencie la utilizacion de operadores aritmeticos*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int valor1 = 500; //Cree una constante para un valor fijo.!
        int valor2, valor3, valor4, resultado;

        System.out.println("INGRESE EL VALOR 2....!");
        valor2 = entrada.nextInt();
        System.out.println("INGRESE EL VALOR 3.....!");
        valor3 = entrada.nextInt();
        System.out.println("INGRESE EL VALOR 4.....!");
        valor4 = entrada.nextInt();

        resultado = valor1 + valor2 + valor3 + valor4;
        System.out.println("EL RESULTADO ES: " + resultado);

        resultado = valor1 * valor2 * valor3 * valor4;
        System.out.println("EL RESULTADO ES: " + resultado);

        resultado = valor1 - valor2 - valor3 - valor4;
        System.out.println("EL RESULTADO ES:" + resultado);

        resultado = valor1 / valor2 / valor3 / valor4;
        System.out.println("EL RESULTADO ES: " + resultado);

        resultado = valor1 % valor2 % valor3 % valor4;
        System.out.println("EL RESULTADO ES: " + resultado);
    }
}
