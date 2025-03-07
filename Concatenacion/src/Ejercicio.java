public class Ejercicio {
    /*Segun los ejemplos anteriormente vistos,
    * Cree variables donde evidencie las acciones
    * De concatenacion, puede utilizar cualquier
    * Tipo de variable.!
    *
    * Utilice la forma de concatenar de manera simple
    * Utilice la forma de concatenar de manera compleja
    * Utilice la forma de concatenar de manera .c!*/

    public static void main(String[] args) {

        String nombre = "Juan";
        String apellido = "Cardenas";
        String pregrado = "Ingenieria Software";

        int edad = 29;
        int peso = 80;

        double altura = 1.70;

        boolean estudiante = true;


        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        System.out.println(peso);
        System.out.println(altura);
        System.out.println(estudiante);

        System.out.println();

        System.out.println(nombre + " " + apellido + " " + pregrado);
        System.out.println(edad + " " + peso + " "+ altura);
        System.out.println(estudiante);

        System.out.println();

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Estudiante: " + pregrado);
        System.out.println("Online: " + estudiante);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);

        System.out.println();

        System.out.println(nombre.concat(apellido));

    }
}
