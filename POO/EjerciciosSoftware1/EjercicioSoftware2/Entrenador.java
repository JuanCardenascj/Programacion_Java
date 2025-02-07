package POO.EjerciciosSoftware1.EjercicioSoftware2;

class Entrenador extends Persona {
    String estrategia;

    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Estrategia utilizada: " + estrategia);
    }

    public void planificarEntrenamiento() {
        System.out.println("El entrenador " + nombre + " está planificando el entrenamiento.");
    }

    public void darEntrevista() {
        System.out.println("El entrenador " + nombre + " está dando una entrevista.");
    }
}
