package seccion13_temas_avanzados;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListasConArrays {
    // Utilizamos la clase Arrays, para crear una lista.

    public static void main(String[] args) {

        // Utilizamos el la Clase Arrays para crear una lista con arrays
        // Usaremos Arrays.asList, para crear una lista a traves de un array
        List<String> nombres = Arrays.asList("Lucas", "Matias", "Oscar");
        System.out.println("Lista de Nombres creada con .asList: ");
        nombres.forEach(System.out::println);

        // Tambien podemos usar Arrays.asList, y pasarle una array que ya exista en memoria
        String[] arrayNombres = {"Juan", "Pedro", "Maximiliano"};
        List<String> nombres2 = Arrays.asList(arrayNombres);
        System.out.println("\nLista creada con un Array en memoria");
        nombres2.forEach(System.out::println);
    }
}
