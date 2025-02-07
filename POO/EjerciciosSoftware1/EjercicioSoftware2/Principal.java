package POO.EjerciciosSoftware1.EjercicioSoftware2;

/*Ejercicio: Equipo de Fútbol
* Crear un programa para simular un equipo de fútbol
* (Futbolista, entrenador, doctor), para lo cual tendremos lo siguiente:
*
* 1. Una super clase Persona: DataType: Nombre, apellido, edad.
* 2. Una sub clase Futbolista: DataType: dorsal y posicion
* 3. Una sub clase Entrenador: DataType: estrategia Utiliza
* 4. Una sub clase Doctor: DataType: titulacion y los años experiencia
*
* Hacer un menú donde se tengan las siguientes opciones: Viaje de equipo,
* entrenamiento, partido de fútbol, planificar entrenamiento, entrevista,
* curar lesión.*/

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Futbolista futbolista = new Futbolista("Lionel", "Messi", 36, 10, "Delantero");
        Entrenador entrenador = new Entrenador("Pep", "Guardiola", 52, "Tiki-Taka");
        Doctor doctor = new Doctor("Juan", "Pérez", 45, "Médico Deportivo", 20);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de fútbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesión");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El equipo está viajando.");
                    break;
                case 2:
                    futbolista.entrenar();
                    break;
                case 3:
                    futbolista.jugarPartido();
                    break;
                case 4:
                    entrenador.planificarEntrenamiento();
                    break;
                case 5:
                    entrenador.darEntrevista();
                    break;
                case 6:
                    doctor.curarLesion();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, por favor elige otra.");
            }
        }
    }
}
