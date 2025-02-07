package POO.EjerciciosPOO.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static int indiceCocheBarato(Vehiculo coche[]){
        float precio;
        int indice = 0;

        precio = coche[0].getPrecio();
        for (int i = 1; i < coche.length; i++){
            if (coche[i].getPrecio() < precio){
                precio = coche[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] arga) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;

        System.out.print("Digite la cantidad de vehículos: ");
        numeroVehiculos = entrada.nextInt();

        //Crea objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < numeroVehiculos; i++) {
            entrada.nextLine();
            System.out.println("Digite las caracteristicas del coche " + (i + 1) + ":");
            System.out.println("Introduzca Marca:");
            marca = entrada.nextLine();
            System.out.println("Introduzca el Modelo: ");
            modelo = entrada.nextLine();
            System.out.println("Introduzca el Precio: ");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        indiceBarato = indiceCocheBarato(coches);
        System.out.println("El coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
