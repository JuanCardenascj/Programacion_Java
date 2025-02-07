/*Ejercicio 13:
* Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares
* con el siguiente menu de opcion:
* 1. ingresar dinero a la cuenta
* 2. retirar dinero de la cuenta
* 3. salir*/

package Condicionales;

import javax.swing.*;

public class Ejercicio13 {
    public static void main(String [] args){
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero Automatico\n"
        + "1. Ingresar dinero a la cuenta\n"
        + "2. Retirar dinero de la cuenta\n"
        + "3. Salir"));

        switch (opcion){

            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta"));
            saldoActual = saldo_inicial + ingreso;
            JOptionPane.showMessageDialog(null,"Dinero en cuenta: " + saldoActual);
            break;

            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de dinero que desea retirar en cuenta"));
            if (retiro > saldo_inicial){
                JOptionPane.showMessageDialog(null,"No cuenta con el saldo suficinete");
            } else {
                saldoActual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta" + saldoActual);
            }
            break;

            case 3: break;
            default: JOptionPane.showMessageDialog(null,"Se equivoco de opcion de menu: ");
            break;
        }


    }
}
