package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEjemplo {

    public static void main(String[] args) {
        
 
        // Paso 1: Declaracion 
        Collection<String> listaDeTareas = new ArrayList<>();

        // Paso 2: Asignacion de valores (Agregar nueva tarea)
        listaDeTareas.add("Entregar foro 1 de POO");

        // Muestra lista de tareas 
        System.out.println("Lista de Tareas: " + listaDeTareas);
        
       
        // Paso 3: Eliminacion de valores (Completar una tarea)
        listaDeTareas.remove("Entregar foro 1 de POO");

        
        System.out.println("Lista de Tareas después de completar una tarea: " + listaDeTareas);
        
    }
}

