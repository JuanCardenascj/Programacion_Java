package Arrays;

public class Bucle_For_Each {
    public static void main(String[] args) {

        String[] nombres = new String[6];

        nombres[0] = "Juan";
        nombres[1] = "Maria";
        nombres[2] = "Sophia";
        nombres[3] = "Marcela";
        nombres[4] = "Dayana";
        nombres[5] = "Charly";

        /*
        * Bucle ( variables iterador : nombres
        * */

        for (String i: nombres){
            System.out.println(i);
        }
    }
}
