package seccion7_Switch_If;
// Se nos pide crear un programa que calcule le costo de envío según el destino
// Nacional = 10 $/kg
// Internacional = 20 $/kg
// El programa debe solicitar tipo de envio y peso del envio.
// Finalmente imprimir el costo de envio.

import java.util.Scanner;

public class RetoSistemaDeEnvios {
    public static void main(String[] args) {
        //Defino y asigno valor a mis constantes
        final float PRECIO_KG_NACIONAL=10f;
        final float PRECIO_KG_INTERNACIONAL=20f;


        //Creo mi objeto tipo Scanner:
        Scanner scanner = new Scanner(System.in);

        // Muestro el titulo de mi sistema
        System.out.println("*** Sistema de Envíos ***");

        System.out.print("Peso de la encomienda: ");
        double peso = Double.parseDouble(scanner.nextLine());
        String error= peso <=0? "Peso. ": "" ;

        System.out.print("Que tipo de envio desea realizar? (nacional/internacional) ");
        String tipoEnvio = scanner.nextLine().trim().toLowerCase();

        double precioEnvio = switch (tipoEnvio){
            case "nacional"-> peso *PRECIO_KG_NACIONAL;
            case "internacional"-> peso *PRECIO_KG_INTERNACIONAL;
            default -> {
                error+="Tipo de envio.";
                yield -1;
            }
        };

        if(error.isEmpty() ){
            System.out.printf("El costo del envío es de: $%.2f",precioEnvio);
        }else{
            System.out.printf("""
                    %nUno o más datos fueron ingresados incorrectamente.
                    Recuerde que el peso debe ser mayor a 0 y el tipo de envío solo es nacional o internacional.
                    Datos erroneos: %s
                    """,error);
        }
    }
}
