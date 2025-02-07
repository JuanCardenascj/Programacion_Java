package Ciclos_Bucles;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;

        System.out.println("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();

        while (i<=contador){
            System.out.println(i);
            i++; //Avancen de 1 en 1.
        }
    }
}
