package POO.EjerciciosPOO;

import javax.swing.*;

public class Main {
    public static void main(String[]args){
        Cuadrilatero c1;
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2: "));

        if (lado1 == lado2){ // Es un cuadrado
            c1 = new Cuadrilatero(lado1);
        } else {
            c1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El perimetro es: "+ c1.getPerimetro());
        System.out.println("E area es: " + c1.getArea());
    }
}
