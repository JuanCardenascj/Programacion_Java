import javax.swing.*;

public class Ejercicio {

    /*Cree un programa donde le pida los datos al usuario en una ventana
    * y los imprima en esa misma ventanada.
    *
    * Recuerda Utilizar el Metodo JoptionPane*/

    public static void main(String[] args) {
        String nombre;
        String apellido;
        String city;
        String civil;

        int edad;
        int estatura;

        nombre = JOptionPane.showInputDialog(null, "Escriba su nombre");
        apellido = JOptionPane.showInputDialog(null, "Escriba su apellido");
        city = JOptionPane.showInputDialog(null, "Escriba la ciudad");
        civil = JOptionPane.showInputDialog(null, "Ingrese su estado civil");
        String edad2 = JOptionPane.showInputDialog(null, "Digite su edad");
        edad = Integer.parseInt(edad2);
        String estatura2 =JOptionPane.showInputDialog(null, "Digite su estatura");
        estatura = Integer.parseInt(estatura2);

        JOptionPane.showMessageDialog(null, "NOMBRE: " + nombre + "\n" +
                                                                   "APELLIDO: " + apellido + "\n" +
                                                                   "CITY: " + city + "\n"+
                                                                    "CIVIL: " + civil + "\n");




    }
}
