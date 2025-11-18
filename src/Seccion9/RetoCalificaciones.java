package Seccion9;

import java.util.Scanner;

public class RetoCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas calificaciones desea agregar : ");
        int cantidadCalificaciones = Integer.parseInt(scanner.nextLine());

        double[] calificaciones = new double[cantidadCalificaciones];
        double sumaCalificaciones = 0 ;
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificacion ["+i+"]: ");
            calificaciones[i] = Double.parseDouble(scanner.nextLine());
            sumaCalificaciones+=calificaciones[i];
        }
        System.out.printf("El promedio de las calificacoines es : %.2f", sumaCalificaciones/calificaciones.length);

    }
}
