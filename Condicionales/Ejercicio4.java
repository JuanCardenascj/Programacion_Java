/*Ejercicio 4
* En MegaPlaza se hace un 20% de descuento a los clientes
* cuya compra supére los $300. ¿Cúal será ña cantidad que
* pagara una persona por su compra?*/

package Condicionales;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        float descuento = 0.20f;

        String valorCompraStr = JOptionPane.showInputDialog("Digite el valor de su compra");

        float valorCompra = Float.parseFloat(valorCompraStr);

        if (valorCompra > 300) {
            // Calcular el precio con descuento
            float precioConDescuento = valorCompra * (1 - descuento);
            JOptionPane.showMessageDialog(null, "El valor final con el descuento es: $" + precioConDescuento);
        } else {
            // Si no supera los $300, no hay descuento
            JOptionPane.showMessageDialog(null, "El valor de la compra no supera los $300. El total a pagar es: $" + valorCompra);
        }
    }
}
