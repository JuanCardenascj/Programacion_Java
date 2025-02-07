package Arrays;

import javax.swing.*;
import java.util.Scanner;

public class Metodo_Burbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElemento, aux;

        nElemento = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

        arreglo = new int[nElemento];

        for (int i = 0; i < nElemento; i++) {
            System.out.println((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

    //METODO BURBUJA
        for (int i=0; i<nElemento-1; i++){ //Cantidad de vueltas que da
            for (int j = 0; j < nElemento-1; j++){ //Para ordenar el arreglo
                if (arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j+1] = aux;
                }
            }
        }

        //Mostrando el arreglo ordenado crecientemente
        for (int i = 0; i < nElemento; i++){
            System.out.println(arreglo[i]+" - ");
        }

        System.out.println("Arreglo ordenado en forma decreciente");
        for (int i = (nElemento-1); i>0; i--){
            System.out.println(arreglo[i]+" - ");
        }

        System.out.println("");
    }
}
