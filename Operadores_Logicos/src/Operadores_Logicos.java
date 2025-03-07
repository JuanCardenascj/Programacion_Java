public class Operadores_Logicos {

    /*Operadores Logicos: Son elementos fundamentales para realizar operaciones
    * de logica booleana.! */

    public static void main(String[] args) {

        /*Creamos dos Variables*/
        boolean a = true, b = false;

        /*Operador AND (Y) - Devuelve verdadero si ambas son verdaderas*/
        System.out.println(a && b);

        /*Operador OR (O) - Devuelve verdadero si una de las dos es verdadera*/
        System.out.println(a || b);

        /*Operador NOT (NO) - Devuelve verdadero si una de las dos es falsa*/
        System.out.println(!b); //B - es verdadera y el not la niega entonces sale verdadero

        /*XOR LOGICO - Devuelve verdadero si solo una de las dos sea verdadera*/
        System.out.println(a ^ b);

    }
}
