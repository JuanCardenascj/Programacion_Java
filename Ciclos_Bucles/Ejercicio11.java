package Ciclos_Bucles;

/*Ejercicio 11:
* Diseñar un programa que muestre el producto
* de los 10 primeros números impares.*/

public class Ejercicio11 {
    public static void main(String[] args){

        long producto = 1;

        for (int i=1; i<=20; i+=2) {
            producto = producto * i;
        }
        System.out.println("El producto es: " + producto);
    }
}
