public class Concatenacion {

    public static void main(String[] args) {
        /*Creamos una variable de tipo String*/
        String nombre = "Homero"; //Declaramos y le damos un valor
        String apellido = "Simpson"; //Declaramos y le damos un valor

        /*Creamos una variable de tipo int*/
        int valor1 = 100; //Declaramos y le damos un valor
        int valor2 = 200; //Declaramos y le damos un valor
        int resultado = valor1 + valor2; //Declaramos la variable y sumamos las otras dos variables


        /*CONCATENACIONES EJEMPLOS*/

        /*CONCATENACIONES DE TIPO STRING*/
        /*Para concatenar utilizamos el signo del (+)*/
        System.out.println(nombre + " " + apellido); //Imprime mis dos variable cocatenadas

        /*Para imprimir solo el nombre*/
        System.out.println(nombre); //Imprime nombre

        /*Para imprimir solo el apellido*/
        System.out.println(apellido); //Imprime el apellido

        /*Para imprimir nombre mas el nombre*/
        System.out.println("Nombre: " + nombre);

        /*Para imprimir el apellido mas el el apellido*/
        System.out.println("Apellido: " + apellido);

        /*Para imprimir el resultado de las variables de tipo ENTERO - int*/
        System.out.println(resultado);

        /*Otra forma de concatenar es*/
        System.out.println(nombre.concat(apellido)); //Con concat - concatena las variables
    }
}
