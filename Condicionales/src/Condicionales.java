import javax.swing.*; //Solo maneja datos de tipo STRING

public class Condicionales {

    /*Condicionales: Son funciones que analizan porciones de codigo para determinar
    * si una condicion es verdadera o falsa.
    *   IF - ELSE - SWITCH*/

    public static void main(String[] args) {

        /*Creamos dos Variables*/
        String nombre; //Declaramos la variable Tipo Cadena pero no le damos ningun valor.
        int edad; //Declaramos la variable Tipó Entero pero no le damos ningun valor.

        /*Le pedimos los datos al usuario con JoptionPane....!
        * LEE ATENTAMENTE PARA QUE PUEDAS ENTEDER*/
        nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre...!", JOptionPane.WARNING_MESSAGE); //Pedimos el nombre al usuario
        /*Como JoptionPane - Recibe String entonces
        * Le pedimos al usuario que ingrese los datos como tipo string */
        String edad2 = JOptionPane.showInputDialog(null, "Ingresa tu edad.....!",JOptionPane.MESSAGE_PROPERTY ); //Pedimos el nombre al usuario
        edad = Integer.parseInt(edad2); //Luego guardamos los datos ingresados por le usuario de tipo string y lo convertimos en Entero

        /*Analizando datos - CONDCIONAL IF (SI)*/
        if (edad <= 12){ //Si edad es menor o igual a 12
            JOptionPane.showMessageDialog(null, "ERES UN NIÑO");
        } else if (edad > 12 && edad < 15){ //Pero si edad es mayor a 12 y edad menor a 15
            JOptionPane.showMessageDialog(null, "ES MENOR DE EDAD");
        } else if (edad > 15 && edad < 17){ //Pero si edad es mayor a 15 y edad menor a 17
            JOptionPane.showMessageDialog(null, "ES ADOLECENTE");
        } else if (edad >= 18){ //Pero si edad es mayor o igual a 18
            JOptionPane.showMessageDialog(null, "ERES UN ADULTO JOVEN");
        } else if (edad > 18 && edad < 25){ //Pero si edad es mayor a 18 y edad menor a 25
            JOptionPane.showMessageDialog(null, "ERES UN ADULTO");
        } else if (edad >= 25) { //Pero si edad es mayor o igual a 25
            JOptionPane.showMessageDialog(null, "ERES UN ADULTO RESPONSABLE");
        }
    }
}
