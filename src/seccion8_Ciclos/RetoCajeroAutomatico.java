package seccion8_Ciclos;

import java.util.Scanner;

public class RetoCajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*** Cajero Automatico ***");

        //Creo mi objeto Scanner
        Scanner scanner = new Scanner(System.in);

        //Inicializo mi variable con un monto: $10.000
        double saldo = 10000;
        //Defino mi variable montoIngresado, para evaluar si puede retirar o depositar:
        double montoIngresado = 0;
        //Defino la variable Salir, para utilizar como flag
        boolean salir = false;
        //Defino mi variable de opcion:
        int opcion ;

        while(!salir){
            System.out.print("""
                    Operaciones que puedes realizar:
                    1. Consultar Saldo.
                    2. Retirar.
                    3. Depositar.
                    4. Salir
                    Escoja una opción:\s""");
            opcion = scanner.nextInt();
            System.out.println("-------------------");
            switch (opcion){
                case 1 -> System.out.printf("Su saldo es de: %.2f %n%n", saldo);
                case 2 -> {
                    System.out.print("Cuanto desea retirar: " );
                    montoIngresado = scanner.nextDouble();
                    if(montoIngresado<0){
                        System.out.println("Debe ingresar un número positivo\n");
                        break;
                    }
                    if ( saldo>=montoIngresado){
                        saldo-=montoIngresado;
                        System.out.printf("""
                                Usted acaba de retirar: $%.2f
                                Saldo disponible en cuenta: $%.2f %n
                                """,montoIngresado,saldo);
                    }else{
                        System.out.println("No tiene saldo disponible para realizar esa operacion\n");
                    }
                }
                case 3 -> {
                    System.out.print("Cuanto desea depositar: " );
                    montoIngresado = scanner.nextDouble();
                    if (montoIngresado>0){
                        saldo+=montoIngresado;
                        System.out.printf("""
                                Usted acaba de ingresar: $%.2f
                                Saldo disponible en cuenta: $%.2f %n
                                """,montoIngresado,saldo);
                    }else{
                        System.out.println("Usted debe ingresar un valor positivo");
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo del Sistema... " );
                    salir=true;
                }
                default -> System.out.println("No se reconoce la opción ingresada\n");
            }
        }
    }
}
