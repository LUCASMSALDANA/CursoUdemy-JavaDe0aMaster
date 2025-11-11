package Seccion7;
import java.util.Scanner;

public class RetoSistemaDeReservaDeHotel {
    public static void main(String[] args) {
        //Titulo de la app
        System.out.println("*** Sistema de Reserva de Hotel");

        //Creo mi objeto Scanner
        Scanner scanner = new Scanner(System.in);
        //Defino el precio de los cuartos
        final float PRECIO_VISTA_AL_MAR = 190.5f;
        final float PRECIO_SIN_VISTA = 150.5f;

        //Pido datos al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Días de estadía: ");
        int diasDeEstadia = Integer.parseInt(scanner.nextLine());
        System.out.print("Con vista al mar? (true/false): ");
        boolean vistaAlMar = scanner.nextBoolean();

        //Defino el mensaje segun si tiene vista o no y ademas calculo el costo total de la estadia.
        String mensajeVistaAlMar = vistaAlMar? "Si" : "No";
        double costoTotal = vistaAlMar? diasDeEstadia * PRECIO_VISTA_AL_MAR : diasDeEstadia * PRECIO_SIN_VISTA;

        System.out.printf("""
                %nDetalles de la Reserva
                ----------------------
                Cliente: %s
                Días de la estadía: %d
                Costo Total: %.2f
                Habitación con vista al mar: %s
                """,nombre,diasDeEstadia,costoTotal,mensajeVistaAlMar);
    }
}
