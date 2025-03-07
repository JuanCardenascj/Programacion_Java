import javax.swing.JOptionPane;

public class Ejercicio {

    public static void main(String[] args) {
        // Declaración de las constantes
        final int salarioBase = 5712345;
        final int bonificacion = 9;

        // Cálculo del salario total con la bonificación
        int salarioTotal = salarioBase * bonificacion;

        // Creación del mensaje para mostrar
        String mensaje = "Salario Base: " + salarioBase + "\nBonificación: " + bonificacion + "\nSalario Total: " + salarioTotal;

        // Mostrar el mensaje en una ventana emergente
        JOptionPane.showMessageDialog(null, mensaje, "Detalles del Salario", JOptionPane.INFORMATION_MESSAGE);
    }
}



