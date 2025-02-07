package Matricez.Ejercicios;

/*Ejercicio 1:
* Crear y cargar una matriz de tamaño n x m y decir si es simetrica o no*/

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int matriz [][], nFilas, nCol;
        boolean simetrica = true;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));

        matriz = new int[nFilas][nCol];

        System.out.println("Digite una matriz: ");
        for (int i = 0; i < nFilas; i++){
            for (int j = 0; j < nCol; j++){
                System.out.println("Matriz{"+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        if (nFilas == nCol) { //Si el nfilas == ncol  es matriz cuadrada
            int i,j;
            i = 0;
            while (i < nFilas && simetrica == true){
                j = 0;
                while (j < i && simetrica == true){
                    if (matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica == true){
                JOptionPane.showMessageDialog(null,"La matriz es simétrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
            }
        }else {
            JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
        }


    }
}
