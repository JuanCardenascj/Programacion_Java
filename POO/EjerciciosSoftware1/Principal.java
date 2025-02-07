package POO.EjerciciosSoftware1;

/*Ejercicio_:
* Hacer un programa para calcular el área de Poligonos
* (Triangulos y rectangulos), el programa debe sere capaz
* de almancenar en un arreglo N tríangulos y rectángulos,
* y al final mostrar el área y los datos de cada uno.
* Para ellos se tendrá lo siguiente:
*
* __ Una super clase llamada Polígono
* __ Una sub clase llamada Rectángulo
* __ Una sub clase llamada Triángulo */

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    //Arrays Dinamicos - Arreglos
    static ArrayList<Polígono> poligono = new ArrayList<Polígono>();
    static Scanner entrada = new Scanner(System.in); // Statico o estatico para que lo use todo publico

    public static void main(String[]args) {
        //Método un poligono
        llenarPoligono();

        //Mostrar los datos y el area de cada poligono
        mostrarResultados();
    }

    public static void llenarPoligono(){
        char respuesta;
        int opcion;
        do {
            do {
                System.out.println("Digite que Poligono desea ");
                System.out.println("1. Ese Poligono puede ser un Triangulo ");
                System.out.println("2. Ese Poligono puede ser un Rectangulo ");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion){
                case 1: llenarTrigangulo();//Llenar un Triangulo
                    break;
                case 2: llenarRectangulo();//Llenar un Rectangulo
                    break;
            }

            System.out.println("Desea introducir otro Poligonomo (S/N): ");
            respuesta = entrada.next().charAt(0);
        } while (respuesta=='S' || respuesta=='s');
    }

    /*SWITCH
    * LLENAR TRIANGULO*/
    public static void llenarTrigangulo(){
        double lado1, lado2, lado3;

        System.out.println("Digite el lado1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite el lado2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.println("Digite el lado3 del triangulo: ");
        lado3 = entrada.nextDouble();

        //Crea objeto
        Triángulo triangulo = new Triángulo(lado1,lado2,lado3);

        //Almacena dentro del arreglo poligono el objeto triangulo
        /*Polimorfismo*/
        poligono.add(triangulo);
    }

    /*SWITCH
    * LLENAR RECTANGULO*/
    public static void llenarRectangulo(){
        double lado1, lado2;

        System.out.println("Digite el lado1 del Rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite el lado2 del Rectangulo: ");
        lado2 = entrada.nextDouble();

        //Crea el objeto
        Rectángulo rectángulo = new Rectángulo(lado1,lado2);

        //Almacena dentro del Array Poligono
        /*Polimorfismo*/
        poligono.add(rectángulo);
    }

    public static void mostrarResultados(){

        //Recorriendo el Array Poligonos
        for (Polígono poli: poligono ){
            System.out.println(poli.toString());
            System.out.println("Area _ "+ poli.area());
            System.out.println("");
        }
    }
}
