package Seccion8;

import java.util.Scanner;

public class RetoCalculadora {
    public static void main(String[] args) {
        System.out.println("*** Calculadora En Java ***");
        //Inicializo mi objeto Scanner
        Scanner scanner = new Scanner(System.in);
        //Inicializo mi variable Salir
        boolean salir = false;
        //Inicializo mi variable opcion
        int opcion;

        while(!salir){
            System.out.print("""
                    Operaciones que puedes realizar:
                    1. Suma.
                    2. Resta.
                    3. Multiplicación.
                    4. División.
                    5. Salir.
                    Escoja una opción:\s""");
            opcion = scanner.nextInt();
            System.out.println("-------------------");

            switch (opcion){

                case 5-> {
                    System.out.println("Saliendo de la calculadora...");
                    salir = true;
                }
                default -> System.out.println("No se reconoce la opción ingresada");
            }

        }
    }

}
