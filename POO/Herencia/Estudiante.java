package POO.Herencia;

//Hereda de la clase (Extends)
public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;

    //Constructor clase Hija no es igual ak de la clase padre
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad); //Para informar que ya estan inicializados en la clase principal
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("Nombre del estudiante: " + getNombre()
                + "Apellido: " + getApellido()
                + "Edad: " + getEdad()
                + "Codigo Estudiante: " + codigoEstudiante
                + "Nota Final: " + notaFinal);
    }

}
