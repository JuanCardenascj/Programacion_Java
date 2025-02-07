package POO.EjerciciosSoftware1.EjercicioSoftware2;

class Doctor extends Persona {
    String titulacion;
    int anosExperiencia;

    public Doctor(String nombre, String apellido, int edad, String titulacion, int anosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Titulación: " + titulacion);
        System.out.println("Años de experiencia: " + anosExperiencia);
    }

    public void curarLesion() {
        System.out.println("El doctor " + nombre + " está curando una lesión.");
    }
}