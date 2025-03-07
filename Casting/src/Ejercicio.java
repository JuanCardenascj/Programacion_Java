public class Ejercicio {

    /*Realice la conversion de las variables
    *
    * Ejemplo:   Entero a texto
    *            Texto a entero
    * etc.......!*/

    public static void main(String[] args) {

        int num1 = 234;
        String texto1 = String.valueOf(num1);
        System.out.println("Cadena: " + texto1);

        String texto2 = "432";
        int num2 = Integer.parseInt(texto2);
        System.out.println("Entero: "+ num2);

        double doble = 123.43;
        int num3 = (int) doble;
        System.out.println("Entero2: " + num3);

        int num4 = 5431;
        double doble2 = (double) num4;
        System.out.println("Doble: " + doble2);

    }
}
