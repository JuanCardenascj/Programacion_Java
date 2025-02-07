package POO.Encapsulamiento;

public class Clase2 {
    public static void main(String[]args){
        Clase1 objeto1 = new Clase1();

        objeto1.SetEdad(10);
        System.out.println("La edad es: " + objeto1.GetEdad());
        objeto1.setNombre("Juan_Cardenas");
        System.out.println("El nombre es: " + objeto1.getNombre());
    }
}
