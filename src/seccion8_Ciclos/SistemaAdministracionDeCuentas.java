package seccion8_Ciclos;

import java.util.Scanner;

public class SistemaAdministracionDeCuentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Con la notación clasica del Switch
//        boolean salir = false;
//
//        while (!salir){
//            System.out.print("""
//                    *** Sistema de Administración de Cuentas ***
//                    1. Crear cuenta.
//                    2. Eliminar cuenta.
//                    3. Salir
//                    Escoja una opción :\s""");
//            int opcion = Integer.parseInt(scanner.nextLine());
//            switch (opcion){
//                case 1:
//                    System.out.println("Creando cuenta...\n");
//                    break;
//                case 2:
//                System.out.println("Eliminando cuenta...\n");
//                    break;
//                case 3:
//                    System.out.println("Saliendo del sistema...\n");
//                    salir=true;
//                    break;
//                default:
//                    System.out.println("Opción incorrecta.");
//                    break;
//            }
//        }
        // Con la notacion mejorada del switch:
        boolean salir = false;

        while (!salir) {
            System.out.print("""
                    *** Sistema de Administración de Cuentas ***
                    1. Crear cuenta.
                    2. Eliminar cuenta.
                    3. Salir
                    Escoja una opción :\s""");
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1 -> System.out.println("Creando cuenta...\n");
                case 2 -> System.out.println("Eliminando cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema...\n");
                    salir = true;
                }
                default -> System.out.println("Opción incorrecta.");

            }
        }
    }
}
