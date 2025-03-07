import java.util.Scanner;

public class Datos_Usuario {

    /*En este clase vamos a prender a utilizar el Scanner
    * Lo utilizamos para pedir los datos al usuario
    * No lo ingresamos directamente en el programa
    * Sino que el usuario sera quien los ingrese.
    *
    * Llamamos al objeto Scanner escribiendolo así no mas
    * el y automaticamente se importara.!*/

    public static void main(String[] args) {

        /*Para pedir los datos al usuario*/
        Scanner entrada = new Scanner(System.in); //Es una clase que necesitamos para que le usuario ingrese datos

        /*Definimos una variable de tipo String y una Int*/
        String nombre;
        int edad;

        /*Para pedir los datos al usuario procedemos a escribir le siguiente codigo
        *             entrada (que seria el scanner) . next;
        *Para ser mas claro    entrada.next();
        * Dependiendo del tipo de variable puede ser: next() - nextInt() - nextFloat()
        * etc.....*/

        /*Procedemos a pedir datos al usuario
        * Utilizamos entrada.next(String) que es
        * para que el usuario ingrese datos de tipo cadena*/
        System.out.println("Escribe tu nombre...");
        nombre = entrada.next();

        /*Procedemos a pedir datos al usuario Utilizamos
        * entrada.nextInt(Entero) para que el usuario
        * ingrese datos de tipo entero*/
        System.out.println("Escribe tu edad...");
        edad = entrada.nextInt();

        /*Para la Salida de los o imprimir los datos ingresados por el usuario en consola
        * Procedemos*/
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }
}
