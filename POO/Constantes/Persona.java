package POO.Constantes;

/*Es un espacio de memoria donde se almancena un valor
*y no cambiara a lo largo del programa, no se puede alterar*/

public class Persona {
    private final String nombre; //Constantes no tienen Get ni Set
    private int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
