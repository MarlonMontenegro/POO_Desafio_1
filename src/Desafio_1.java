import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio_1 {

    private static final Map<String, String> estudiantes = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Ingresar Alumno");
            System.out.println("2. Buscar Alumno");
            System.out.println("3. Eliminar Alumno");
            System.out.println("4. Mostrar Todos los Alumnos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    ingresarAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    eliminarAlumno();
                    break;
                case 4:
                    mostrarAlumnos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void ingresarAlumno() {
        System.out.print("Ingrese el carnet: ");
        String carnet = scanner.nextLine();
        System.out.print("Ingrese el nombre completo: ");
        String nombre = scanner.nextLine();

        estudiantes.put(carnet, nombre);
        System.out.println("Alumno ingresado exitosamente.");
    }

    private static void buscarAlumno() {
        System.out.print("Ingrese el carnet a buscar: ");
        String carnet = scanner.nextLine();

        if (estudiantes.containsKey(carnet)) {
            System.out.println("Alumno encontrado: " + estudiantes.get(carnet));
        } else {
            System.out.println("Alumno no encontrado, no se puede mostrar.");
        }
    }

    private static void eliminarAlumno() {
        System.out.print("Ingrese el carnet a eliminar: ");
        String carnet = scanner.nextLine();

        if (estudiantes.containsKey(carnet)) {
            estudiantes.remove(carnet);
            System.out.println("Alumno eliminado exitosamente.");
        } else {
            System.out.println("Alumno no encontrado, no se puede eliminar.");
        }
    }

    private static void mostrarAlumnos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            System.out.println("Lista de Alumnos:");
            estudiantes.forEach((carnet, nombre) -> System.out.println("Carnet: " + carnet + ", Nombre: " + nombre));
        }
    }
}