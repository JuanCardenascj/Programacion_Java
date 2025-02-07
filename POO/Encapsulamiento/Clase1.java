package POO.Encapsulamiento;

/*Oculta los atributos y los metodos
*Solo pueden acceder desde la misma clase*/

public class Clase1 {
    private int edad;
    private String nombre;

    //Metodos Accesores

    /*Setters*/
    public void SetEdad(int edad){ //Set es establecer
        this.edad = edad; //Inicializa el metodo accesor
    }

    /*Getters*/
    public int GetEdad(){ //Get es Mostrar
        return edad;
    }

    //Segundo Atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
