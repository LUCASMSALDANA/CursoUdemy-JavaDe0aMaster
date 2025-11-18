package Seccion8;

import java.util.Scanner;

public class DibujaUnTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triangulo ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Proporciona un número de filas: ");
        int numeroFilas = scanner.nextInt();

        for( int i = 1 ; i<=numeroFilas; i++){
            String espaciosEnBlanco =" ".repeat(numeroFilas-i);
            String asteriscos = "*".repeat((2*i)-1);
            System.out.println(espaciosEnBlanco+asteriscos);
        }
    }
}
