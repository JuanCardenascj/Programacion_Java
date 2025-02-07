package EntradaSalidaDatosConsola;

import java.util.Scanner;

public class EntradaSalidaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Input entrada de datos

        //Dato De Tipo Entero
        int numero; //No se le asgina valor para pedirlo al usuario

        System.out.println("Digite un numero: ");
        numero = scanner.nextInt(); //Se guarda el valor entero que digita el usuario

        System.out.println("El numero es: "+scanner);

        //Dato Tipo Flotante
        float segundoNumero;
        System.out.println("Digite un numero: ");
        segundoNumero = scanner.nextFloat();
        System.out.println("El numero es: "+scanner);

        //Dato Tipo Double
        double tercerNumero;
        System.out.println("digite un numero: ");
        tercerNumero = scanner.nextDouble();
        System.out.println("El numero es: "+scanner);

        //Dato Tipo Booleano
        boolean cuartoNumero;
        System.out.println("Aqui es verdadero o falso");
        cuartoNumero = scanner.nextBoolean();

        //Dato Tipo Char
        char letra;
        System.out.println("Digite su letra: ");
        letra = scanner.next().charAt(0); //Lee un solo caracter. el primer digito
        System.out.println("La letra es: "+scanner);


        //Dato Tipo Cadena
        String quintoCadena;
        System.out.println("Digite una cadena: ");
        quintoCadena = scanner.nextLine();
        System.out.println("La cadena es: "+scanner);



    }
}
