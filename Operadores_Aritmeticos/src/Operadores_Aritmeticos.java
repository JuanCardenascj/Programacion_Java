import java.util.Scanner;

public class Operadores_Aritmeticos {

    public static void main(String[] args){
        /*Inicializamos y llamamos el Scanner*/
        Scanner entrada = new Scanner(System.in);

        /*Creamos dos variables*/
        int valor1, valor2, resultado;

        /*Solicitamos los datos al usuario*/
        System.out.println("INGRESE VALOR 1....");
        valor1 = entrada.nextInt(); //Para guardar la informacion ingresada
        System.out.println("INGRESE VALOR 2.....");
        valor2 = entrada.nextInt();

        /*Operador Suma*/
        resultado = valor1 + valor2;
        System.out.println("EL RESULTADO ES: " + resultado);

        /*Operador Multiplicacion*/
        resultado = valor1 * valor2;
        System.out.println("EL RESULTADO ES: " + resultado);

        /*Operador Resta*/
        resultado = valor1 - valor2;
        System.out.println("EL RESULTADO ES: " + resultado);

        /*Operador Division*/
        resultado = valor1 / valor2;
        System.out.println("EL RESULTADO ES: " + resultado);

        /*Operador Residuo*/
        resultado = valor1 % valor2;
        System.out.println("EL RESULTADO ES: " + resultado);


    }
}
