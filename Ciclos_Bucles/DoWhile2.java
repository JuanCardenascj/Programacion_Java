package Ciclos_Bucles;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i=1, contador;

        System.out.println("Digite la cantidad de termino: ");
        contador = entrada.nextInt();

        do {
            System.out.println(i);
        } while (i<=contador);
    }
}
