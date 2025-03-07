import javax.swing.*; //Es el paquete de JOPTIONPANE

public class Datos_JoptionPane {

    /*Es otra forma de pedir los datos al usuario pero en este caso
    * Interactuamos directamente con una ventana.!
    *
    * Veamos el ejemplo*/

    public static void main(String[] args) {
        /*Creamos dos Variables*/
        String nombre;
        int edad;

        /*Entrada de datos*/

        /*Ingreso o pedimos datos al usuario
        * Utilizamos el ShowInputDialog
        *
        * Aclarar JOPTIONPAIN Solo maneja valores de tipo texto*/
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ....!");

        /*Para la edad le pedimos nuevamente la edad con tipo cadena*/
        String edad2 = JOptionPane.showInputDialog(null, "Ingrese su edad: ...!");
        edad = Integer.parseInt(edad2); //Luego convertimos el valor ingresado en edad2 a entero.!

        /*Mostramos los datos*/
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" +
                                                                    "Edad: " + edad); // \n Salto de linea
    }
}
