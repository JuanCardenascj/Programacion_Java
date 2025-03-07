import javax.swing.*;

public class Ejercicio {

    /*Crea un programa donde le pida datos al Usuario en ventana*/

    public static void main(String[] args) {
        String nombre;
        String apellido;
        int edad;

        nombre = JOptionPane.showInputDialog(null, "DIGITE SU NOMBRE..!", "BIENVENID@S", JOptionPane.QUESTION_MESSAGE);
        apellido = JOptionPane.showInputDialog(null, "DIGITE SU APELLIDO..!", "BIENVENID@S", JOptionPane.QUESTION_MESSAGE);
        String edad2 = JOptionPane.showInputDialog(null, "DIGITE SU EDAD..!", "BIENBENID@S", JOptionPane.QUESTION_MESSAGE);
        edad = Integer.parseInt(edad2);

        JOptionPane.showMessageDialog(null, "SU NOMBRE ES: " + nombre, "NOMBRE USUARIO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "SU APELLIDO ES: " + apellido, "APELLIDO USUARIO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "SU EDAD ES: " + edad, "EDAD USUARIO", JOptionPane.INFORMATION_MESSAGE);

        if (edad >= 18){
            JOptionPane.showMessageDialog(null,"ERES MAYOR DE EDAD");
        } else if (edad < 18){
            JOptionPane.showMessageDialog(null, "ERES MENOR DE EDADC");
        }



    }
}
