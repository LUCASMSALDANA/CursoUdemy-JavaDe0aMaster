package Seccion7;
import java.util.Scanner;

// En el reto pide hacer un descuento solo si:
// La compra es mayor a 1000 y es miembro = 10%
// la compra es menor a 1000 pero es miembro = 5%
// y si no es miembro 0%



public class RetoSistemaDeDescuentos {
    public static void main(String[] args) {
        //Creo el objeto Scanner y defino la variable
        Scanner scanner = new Scanner(System.in);
        float  montoDeLaCompra, montoNeto, descuentoPorcentaje=0, montoAdescontar=0;
        final float MONTO_MIN_DTO = 1000;
        String mensaje;

        System.out.println("*** Sistema de Descuentos ***");

        System.out.print("Cual fue el monto de la compra?: ");
        montoDeLaCompra = scanner.nextFloat();

        System.out.print("Eres miembro de la tienda? (true/false): ");
        boolean esMiembro = scanner.nextBoolean();

        if (montoDeLaCompra >= MONTO_MIN_DTO && esMiembro){
            descuentoPorcentaje = 10;
        }else if (esMiembro) {
            descuentoPorcentaje = 5;
        }

        if(descuentoPorcentaje !=0 ){
            montoAdescontar = montoDeLaCompra * (descuentoPorcentaje/100);
            montoNeto = montoDeLaCompra-montoAdescontar;
            mensaje = String.format("\n Felicidades has obtenido un descuento del: %.2f%%",descuentoPorcentaje);
        }else {
            montoNeto=montoDeLaCompra;
            mensaje = ("\n No obtuviste ningun descuento.\n Te invitamos a hacerte miembro de la tienda!");
        }

        System.out.println(mensaje);
        System.out.printf("\n Monto de la compra: $%.2f",montoDeLaCompra);
        System.out.printf("\n Monto del descuento: $%.2f",montoAdescontar);
        System.out.printf("\n Monto final de la compra con descuento: $%.2f",montoNeto);

        // Como ejercicio esta bien, como observacion habla de un monto minimo para hacer descuento, y el
        // ejercicio lo arma en base a eso, pero en realidad el descuento SOLO se aplica si es miembro.

    }
}
