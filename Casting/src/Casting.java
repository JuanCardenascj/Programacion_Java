public class Casting {

    public static void main(String[] args) {

        /*Convertir una variable de tipo texto a entero*/
        String numeroTexto = "123";
        int numeroEntero;

        /*Hacemos el casting*/
        numeroEntero = Integer.parseInt(numeroTexto);

        System.out.println("Numero Entero: "+ numeroEntero);

        /*Convertir un entero a texto*/
        int numeroInt = 456;
        String numeroChar = String.valueOf(numeroInt);

        System.out.println("Texto cadena: " + numeroChar);

        /*Convetir de Double a Int*/
        double numeroD = 45.50;
        int numeroE = (int) numeroD;

        System.out.println("Numero Entero: " + numeroE);

        /*Convertir de entero a doble*/
        int numeroIn = 789;
        double numeroDo = (double) numeroIn;

        System.out.println("Numero Decimal: " + numeroDo);
     }
}
