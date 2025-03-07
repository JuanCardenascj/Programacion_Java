public class Operador_NOT {

    public static void main(String[] args) {

        System.out.println("===MONITOREO DEL SISTEMA====");
        var enlinea = true; //Var entiende cualquier tipo de variable - Solo de manera Local!

        /*Si es falsa - Sistema fuera de linea */
        if (!enlinea){ // ! signo para negar el valor de la variable
            System.out.println("Sistema fuera de linea");
        } else { //Sino es falsa entonces..!
            System.out.println("Sistema en linea");
        }
    }
}
