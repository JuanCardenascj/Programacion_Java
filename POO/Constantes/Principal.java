package POO.Constantes;

public class Principal {
    public static void main(String[]args){
        Persona persona1 = new Persona("David Cardenas", 29);

        persona1.setEdad(30);
        System.out.println("La edad es: " + persona1.getEdad());
        persona1.mostrarDatos();
    }
}
