import javax.swing.*;

public class Ejercicio {

    /*Cree un programa donde se demuestre la utilizacion del operador OR.!*/

    public static void main(String[] args) {
        boolean Monday = false;
        boolean Work = true;

        if (Monday  == true || Work == true) {
            JOptionPane.showMessageDialog(null, "ACCESO CONDEDIDO", "", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"ACCESO DENEGADO", "", JOptionPane.ERROR_MESSAGE);
        }

    }
}
