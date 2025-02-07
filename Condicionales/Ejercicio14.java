/*Ejercicio 14:
*Hacer un programa que pase de KG a otra unidad de medida
* de masa, mostrar en pantalla un menú con las opciones posibles. */

package Condicionales;

import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Pedimos al usuario la cantidad de masa en kilogramos
        double kg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de masa en kilogramos (kg):"));

        // Menú de opciones para convertir de kg a otra unidad
        String[] opciones = {"Gramos (g)", "Libras (lb)", "Onzas (oz)"};
        String opcion = (String) JOptionPane.showInputDialog(null,
                "Seleccione la unidad a la que desea convertir:",
                "Menú de Conversión",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        double resultado = 0;
        String unidad = "";

        // Conversiones según la opción seleccionada
        switch (opcion) {
            case "Gramos (g)":
                resultado = kg * 1000;  // 1 kg = 1000 g
                unidad = "gramos";
                break;
            case "Libras (lb)":
                resultado = kg * 2.20462;  // 1 kg = 2.20462 lb
                unidad = "libras";
                break;
            case "Onzas (oz)":
                resultado = kg * 35.274;  // 1 kg = 35.274 oz
                unidad = "onzas";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                return;
        }

        // Mostramos el resultado de la conversión
        JOptionPane.showMessageDialog(null,
                kg + " kilogramos equivalen a " + resultado + " " + unidad);
    }
}
