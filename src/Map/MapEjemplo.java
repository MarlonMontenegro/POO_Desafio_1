package Map;

import java.util.HashMap;
import java.util.Map;

public class MapEjemplo {

    public static void main(String[] args) {

        // Declarar un Map
        Map<String, String> personajes = new HashMap<>();

        /*asigarnar o declarar valores aun Map*/
        personajes.put("Goku", "Saiyajin criado en la Tierra.");
        personajes.put("Vegeta", "Príncipe de los Saiyajin.");

        printMap(personajes);

        // Obtener elementos (get)
        String descripcion = personajes.get("Goku"); // "Saiyajin criado en la Tierra."

        /* Eliminar un elemento de un Map */
        personajes.remove("Vegeta");  // Elimina a Vegeta del Map

        // Eliminar un valor solo si coincide con la clave y el valor
        personajes.remove("Vegeta", "Saiyajin criado en la Tierra."); // No eliminará Vegeta, porque el valor no coincide

        // Eliminar a Vegeta correctamente con el valor correcto
        personajes.remove("Vegeta", "Príncipe de los Saiyajin."); // Elimina a Vegeta correctamente

        /* Eliminar todo el contenido de un Map*/
        personajes.clear(); // Elimina todos los elementos

    }

    static void printMap(Map<String, String> personajes) {
        for (Map.Entry<String, String> entry : personajes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }





}
