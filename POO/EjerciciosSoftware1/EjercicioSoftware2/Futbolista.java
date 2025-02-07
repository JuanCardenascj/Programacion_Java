package POO.EjerciciosSoftware1.EjercicioSoftware2;

class Futbolista extends Persona {
    int dorsal;
    String posicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Posición: " + posicion);
    }

    public void entrenar() {
        System.out.println("El futbolista " + nombre + " está entrenando.");
    }

    public void jugarPartido() {
        System.out.println("El futbolista " + nombre + " está jugando un partido.");
    }
}