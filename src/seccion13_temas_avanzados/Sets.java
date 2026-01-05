package seccion13_temas_avanzados;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        //Set es otra forma de lista, pero este no permite duplicados.
        //Por lo tanto cuando se ingrese un dato que ya existe lo va a descartar automaticamente
        //Ademas otra caracteristica es que los ordena
        Set<String> conjuntoSet = new TreeSet<>();

        //Añadimos elementos al Set, repetimos un nombre y los desordenamos
        conjuntoSet.add("Carlos");
        conjuntoSet.add("Zaira");
        conjuntoSet.add("Carlos");
        conjuntoSet.add("Carla");
        conjuntoSet.add("Victoria");
        conjuntoSet.add("Maria");
        conjuntoSet.add("Adela");

        System.out.println("Elementos del Set:");
        conjuntoSet.forEach(System.out::println);

        //Removemos un dato
        conjuntoSet.remove("Maria");
        conjuntoSet.remove("Mariano");

        System.out.println("\nElementos del Set luego del remove:");
        conjuntoSet.forEach(System.out::println);
    }

}
