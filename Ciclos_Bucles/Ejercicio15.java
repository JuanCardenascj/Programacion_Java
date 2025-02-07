package Ciclos_Bucles;

/*Ejercicio 15:
* Una empresa.
* Se pide 5 facturas introducidas:
* Facturación total
* cantidad de litros vendidosdel articulo 1
* cuantas facturas se emitieron de mas de $600.*/

import javax.swing.*;

public class Ejercicio15 {
    public static void main(String[] args) {

        int codigo, litros, litrosArticulo1=0, conyroMas600 = 0;
        float precioLitro, importeFactura, facturacionTotal=0;

        for (int i = 1; i<=5; i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° " + i + "Digite el codigo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N° " + i + "Digite la cantidad de litros"));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N° " + i + "Digite el precio por litro"));

            importeFactura = (float) litros * precioLitro; //Importe por factura
            facturacionTotal += importeFactura; //Suma iterativa

            if (codigo == 1){
                litrosArticulo1 += litros;
            }
            if (importeFactura >  600){
                conyroMas600++;
            }
        }

        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total: " + facturacionTotal);
        System.out.println("Cantidad de litros vendidos del articulo 1" + litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600 "+ conyroMas600);

    }
}
