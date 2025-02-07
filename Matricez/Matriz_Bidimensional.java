package Matricez;

import javax.swing.*;
import java.util.Scanner;

public class Matriz_Bidimensional {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol;
        boolean simetrica = true;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de filas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de columnas"));

         matriz = new int[nFilas][nCol];

        System.out.println("Digite la matriz");
         for (int i=0; i<nFilas; i++){
             for (int j = 0; j<nCol; j++){
                 System.out.println("Matriz [" +i+"]: ");
                 matriz[i][j] = entrada.nextInt();
             }
         }

        //Bucle anidado
        System.out.println("Ka matriz es: ");
        for (int i =0; i <3; i++){//Numero de filas
            for (int j = 0; j < 3; j++) { //Numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
     }
}
