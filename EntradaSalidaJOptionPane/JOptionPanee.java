package EntradaSalidaJOptionPane;

import javax.swing.JOptionPane;

public class JOptionPanee {
    public static void main(String[] args) {

        //Crea ventanas

        //Define variables
        String candena;
        int entero;
        char letra;
        double decimal;

        //Pide los datos al usuario
        //Los muestra en ventanas emergentes
        //SHOWINPUTDIALOG ES PARA LA ENTRADA DEL DATO DEL USUARIO
        candena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

        JOptionPane.showMessageDialog(null, "La cadena es: "+candena);
        JOptionPane.showMessageDialog(null, "El numero entero: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El numero decimal es: "+decimal);


    }
}
