package Condicionales;

import javax.swing.*;

public class CondicionalIFSI {
    public static void main(String[] args){
         int numero, dato = 5;

         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

         if (numero == dato){
             JOptionPane.showMessageDialog(null, "El numero es 5");
         } else {
             JOptionPane.showMessageDialog(null, "El numero es diferentes de 5");
         }
    }

}
