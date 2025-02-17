package List;

import java.util.ArrayList;
/**
 *
 * @author mateo
 */
public class ListEjemplo {

    public static void main(String[] args) {
        ArrayList<String> Colores = new ArrayList<String>();

        Colores.add("Azul");
        Colores.add("Rojo");
        Colores.add("Verde");
        Colores.add("Morado");
        Colores.add("Celeste");

        System.out.println(Colores);

        //color 1 (rojo) cabia a morado
        Colores.set(1, "Morado");

        System.out.println(Colores);

        //color 0 (Azul) se eliminara
        Colores.remove(0);

        System.out.println(Colores);

        Colores.clear();

        // Muestra la lista vacia.
        System.out.println(Colores);
    }
}

