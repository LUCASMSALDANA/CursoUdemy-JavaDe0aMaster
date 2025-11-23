package seccion5_FormateoCadenas;
// Crear un programa para solicitar  los valores de una receta de cocina.
// Los valores que debe introducir el usuario son:
//   Nombre de la receta.
//   Ingredientes principales. (Separados por coma)
//   Tiempo de preparacion. (En minutos)
//   Dificultad: Facil, Media, Alta.
// Una vez temrinado mostrar los valores ingresados por pantalla.

import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Recetas de Cocina ***");

        // Pedimos los valores

        // Nombre de la receta
        System.out.print("Nombre de la receta: ");
        String nombreDeLaReceta = scanner.nextLine();

        // Ingredientes
        System.out.print("Ingredientes principales (Separados por coma): ");
        String ingredientes = scanner.nextLine();

        // Tiempo de preparacion
        System.out.print("Tiempo de preparacion: ");
        int tiempoDePreparacion = Integer.parseInt(scanner.nextLine());

        // Dificultad
        System.out.print("Dificultad: ");
        String dificultad = scanner.nextLine();

        // Muestro por pantalla
        System.out.println("\n - Receta de Cocina -");
        System.out.println("\t Nombre de la receta: "+ nombreDeLaReceta);
        System.out.println("\t Ingredientes principales: "+ ingredientes);
        System.out.println("\t Tiempo de preparacion (en min): "+ tiempoDePreparacion);
        System.out.println("\t Dificultad: "+ dificultad);

    }
}
