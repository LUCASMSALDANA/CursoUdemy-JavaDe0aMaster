package seccion5_FormateoCadenas;
import java.util.Scanner;

public class TicketDeVenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double IVA=0.21;
        System.out.println("*** Generacion de Ticket de Venta ***");

        System.out.print("Precio del pan: ");
        double precioPan = Integer.parseInt(scanner.nextLine());

        System.out.print("Precio del Asado: ");
        double precioAsado = Integer.parseInt(scanner.nextLine());

        System.out.print("Precio del vino: ");
        double precioVino = Integer.parseInt(scanner.nextLine());

        System.out.print("Precio de la ensalada: ");
        double precioEnsalada = Integer.parseInt(scanner.nextLine());

        System.out.print("Precio del helado: ");
        double precioHelado = Integer.parseInt(scanner.nextLine());

        double subtotal = precioPan + precioAsado + precioVino + precioEnsalada + precioHelado ;

        double impuestos= subtotal*IVA;

        double total = subtotal + impuestos;

        System.out.printf("""
                %n*** Ticket de Venta ***
                -----------------------
                 Pan:      $%.2f
                 Asado:    $%.2f
                 Vino:     $%.2f
                 Ensalada: $%.2f
                 Helado:   $%.2f
                -----------------------
                subtotal:  $%.2f
                impuestos: $%.2f
                -----------------------
                \tTotal: $%.2f
                """,precioPan,precioAsado,precioVino,precioEnsalada,precioHelado,subtotal,impuestos,total);
    }
}
