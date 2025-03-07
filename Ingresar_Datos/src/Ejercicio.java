import java.util.Scanner;

public class Ejercicio {

    /*Segun la lectura anterior:
    *
    * Cree un programa donde solicite datos al usuario y los imprima en pantalla*/

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        String nombre;
        String apellido;
        int edad, peso;
        double altura;

        System.out.println("Digite su nombre:....!");
        nombre = entradaDatos.next();

        System.out.println("Digite su apellido...!");
        apellido = entradaDatos.next();

        System.out.println("Digite su edad...!");
        edad = entradaDatos.nextInt();

        System.out.println("Digite su peso...!");
        peso = entradaDatos.nextInt();

        System.out.println("Digite su altura...!");
        altura = entradaDatos.nextDouble();


        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Estatura: " + altura);


    }
}
