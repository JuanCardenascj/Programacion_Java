package POO.EjerciciosPOO.Ejercicio3;

/*Ejercicio 3:
* Construir un programa que dada una serie de vehículos caracterizados
* por su marca, modelo y precio, imprima las propiedades del vehículo más barato.
* Para ellos, se deberán leer por teclado las características a cada uno de ellos*/

public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    //Método Consctructor de la clase
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Método Getter precio
    public float getPrecio() {
        return precio;
    }

    //Método String
    public String mostrarDatos(){
        return "Marca: " + marca + "Mordelo: " +  modelo + "Precio: " + precio;

    }

}
