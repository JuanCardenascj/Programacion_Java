package Arrays;

public class Arreglos_Arrays {
    //Sintaxis
    /*
    * Tipo_de_Variable[] Nombre_del_array = new Tipo_de_Variable[dimensión];
    *
    *  numero[0] = 1;
    *  numero[1] = 2;
    *  numero[2] = 3;
    *
    * Si olvida cuantos elementos escribio entonces:
    *    for (int i = 0; i < variable.length; i++){}
    * */
    public static void main(String[] args){

        //Define arreglo
        int[] numeros = new int[3];

        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;

        for (int i = 0; i < 3; i++){ //Empieza desde el indice i = 0 y llega hasta el indice i < 3
            System.out.println(numeros[i]); //El Iterador va dentro de los corchetes []
        }

    }
}
