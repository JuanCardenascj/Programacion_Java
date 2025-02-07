package Arrays;

    /* Arreglo[] = {3,1,2,5,4}; dato = 2
    * */

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Busqueda_Secuencial {
    public static void main(String[] args){
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));

        //  Busqueda secuencial
        int i=0;
        while (i<5 && band == false) {
            if (arreglo[i] == dato) {
                band = true;
            }
            i++;
        }

        if (band == false) {
            JOptionPane.showMessageDialog(null,"No se ha encontrado el número");
        } else {
            JOptionPane.showMessageDialog(null,"El numero ha sido encontrado en la posicion: " +(i-1));
        }

    }
}
