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
        //Inicializo mis variables valor1 valor 2, que son las que el usuario debe ingresar
        double valor1, valor2;

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
                case 1->{
                    System.out.print("Ingrese el valor 1 :");
                    valor1 = scanner.nextDouble();
                    System.out.print("Ingrese el valor 2 :");
                    valor2 = scanner.nextDouble();
                    System.out.println("Resultado suma: " + (valor1+valor2)+"\n");
                }
                case 2->{
                    System.out.print("Ingrese el valor 1 :");
                    valor1 = scanner.nextDouble();
                    System.out.print("Ingrese el valor 2 :");
                    valor2 = scanner.nextDouble();
                    System.out.println("Resultado suma: " + (valor1-valor2)+"\n");
                }
                case 3 ->{
                    System.out.print("Ingrese el valor 1 :");
                    valor1 = scanner.nextDouble();
                    System.out.print("Ingrese el valor 2 :");
                    valor2 = scanner.nextDouble();
                    System.out.println("Resultado suma: " + (valor1*valor2)+"\n");
                }
                case 4->{
                    System.out.print("Ingrese el valor 1 :");
                    valor1 = scanner.nextDouble();
                    System.out.print("Ingrese el valor 2 :");
                    valor2 = scanner.nextDouble();
                    System.out.println("Resultado suma: " + (valor1/valor2)+"\n");
                }
                case 5-> {
                    System.out.println("Saliendo de la calculadora...");
                    salir = true;
                }
                default -> System.out.println("No se reconoce la opción ingresada\n");
            }

        }
    }

}
