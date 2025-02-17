import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<String, String> students = new HashMap<>();

    public static void main(String[] args) {

        Desafio1();
    }

    private static void Desafio1() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            menu();

            System.out.print("Ingrese la opción (1-5): ");
            String op = scanner.nextLine().trim();

            switch (op) {
                case "1":
                    agregarEstudiante(scanner);
                    break;
                case "2":
                    eliminarEstudiante(scanner);
                    break;
                case "3":
                    mostrarTodosLosEstudiantes();
                    break;
                case "4":
                    buscarEstudiante(scanner);
                    break;
                case "5":
                    isRunning = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    public static void menu() {
        System.out.println("\n======= MENÚ =======");
        System.out.println("1. Añadir estudiante");
        System.out.println("2. Eliminar estudiante");
        System.out.println("3. Mostrar todos los estudiantes");
        System.out.println("4. Buscar estudiante por carnet");
        System.out.println("5. Salir");
        System.out.println("====================");
    }

    public static void agregarEstudiante(Scanner scanner) {
        System.out.print("Ingrese número de carnet: ");
        String carnet = scanner.nextLine().trim();

        if (students.containsKey(carnet)) {
            System.out.println("El alumno con carnet " + carnet + " ya está registrado.");
            return;
        }

        System.out.print("Ingrese nombre del alumno: ");
        String nombre = scanner.nextLine().trim();

        students.put(carnet, nombre);
        System.out.println("Alumno agregado exitosamente.");
    }

    public static void eliminarEstudiante(Scanner scanner) {
        System.out.print("Ingrese número de carnet: ");
        String carnet = scanner.nextLine().trim();

        if (students.remove(carnet) != null) {
            System.out.println("Alumno eliminado correctamente.");
        } else {
            System.out.println("Alumno no encontrado, no se puede eliminar.");
        }
    }

    public static void buscarEstudiante(Scanner scanner) {
        System.out.print("Ingrese número de carnet: ");
        String carnet = scanner.nextLine().trim();

        if (students.containsKey(carnet)) {
            System.out.println("Alumno encontrado: " + students.get(carnet) + " (Carnet: " + carnet + ")");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    public static void mostrarTodosLosEstudiantes() {
        System.out.println("\n======= Alumnos Inscritos =======");
        if (students.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            students.forEach((carnet, nombre) ->
                    System.out.println(nombre + " (Carnet: " + carnet + ")")
            );
        }
        System.out.println("==============================");
    }
}
