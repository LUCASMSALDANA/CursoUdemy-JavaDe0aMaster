package seccion5;

import java.util.Scanner;

public class SistemaPrestamoLibro {
    public static void main(String[] args) {
        final int DISTANCIA_PERMITIDA= 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** SISTEMA DE PRESTAMOS DE LIBROS ***");
        System.out.print("Cuenta con tarjeta de estudiante (true/false): ");
        boolean tieneTarjeta = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("A cuantos km vive de la biblioteca?: ");
        int distanciaAlaBiblioteca = Integer.parseInt(scanner.nextLine());

        boolean esAptoParaPrestamo = tieneTarjeta || distanciaAlaBiblioteca <= DISTANCIA_PERMITIDA;

        System.out.printf("El usuario es elegible para el prestamo ? %b",esAptoParaPrestamo);
    }
}
