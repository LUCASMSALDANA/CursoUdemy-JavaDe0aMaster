package seccion3;
// El detalle a almacenar es:
//  Nombre del Cliente
//  Días de Estancia
//  Tarifa Diaria
//  Indicar si la habitación cuenta con vista al mar o no
//
// Asignar un valor a cada variable, escogiendo un nombre aplicando las buenas practicas y mandar a
// imprimir el valor de cada variable
//
// Por último modificar el valor de cada variable con nuevos datos y mostrarlos por pantalla. (utilizar var)

public class DetalleReservaHotel {
    public static void main(String[] args) {

        var nombreDelCliente= "Carlos Garcia";
        var diasEstancia = 11;
        var tarifaDiaria = 20000.00;
        var tieneVistaAlMar = false;

        System.out.println("Nombre de la reserva: " + nombreDelCliente);
        System.out.println("Días que se hospeda: " + diasEstancia);
        System.out.println("Tarifa: " + tarifaDiaria);
        System.out.println("Tiene vista al mar: " + tieneVistaAlMar);

        System.out.println("\n********************");
        System.out.println("Cambiando de valores");
        System.out.println("********************\n");

        nombreDelCliente= "Jose Izarralde";
        diasEstancia = 3;
        tarifaDiaria = 25000.00;
        tieneVistaAlMar = true;

        System.out.println("Nombre de la reserva: " + nombreDelCliente);
        System.out.println("Días que se hospeda: " + diasEstancia);
        System.out.println("Tarifa: " + tarifaDiaria);
        System.out.println("Tiene vista al mar:" + tieneVistaAlMar);

    }
}
