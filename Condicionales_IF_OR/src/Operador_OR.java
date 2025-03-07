import javax.swing.*;

public class Operador_OR {

    public static void main(String[] args) {

        /*Creamos Dos variables*/
        boolean Domingo = true; //Declaramos, definimos y le damos un valor a la variable
        boolean Vacaciones = true; //Declaramos, definimos y le damos un valor a la variable

        /*Creamos Condicionales*/
        if (Domingo == true || Vacaciones == true){ //Si domingo es igual a verdadero o vacaciones es igual a verdadero
            JOptionPane.showMessageDialog(null, "ACCESO DEGENEGADO A LA EMPRESA", "", JOptionPane.WARNING_MESSAGE);
        } else { //Sino no lo es entonces.!
            JOptionPane.showMessageDialog(null, "ACCESO CONCEDIDO A LA EMPRESA", "", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
