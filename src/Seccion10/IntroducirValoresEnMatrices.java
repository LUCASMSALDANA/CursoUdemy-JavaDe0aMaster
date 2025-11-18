package Seccion10;

import java.util.Scanner;

public class IntroducirValoresEnMatrices {
    public static void main(String[] args) {
        System.out.println("*** Introducir valores a una matriz ***");
        Scanner scanner = new Scanner(System.in);
        int filas, columnas;

        //Pido ingresar filas y columnas al usuario
        System.out.print("Ingrese el numero de filas: ");
        filas = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el numero de filas: ");
        columnas = Integer.parseInt(scanner.nextLine());

        int[][] matriz = new int[filas][columnas];

        for (int fil = 0; fil < filas; fil++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Ingrese un Valor para matriz[" + fil + "][" + col + "]: ");
                matriz[fil][col] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Su matriz es la siguiente:");
        for (int fil = 0; fil < filas; fil++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print(matriz[fil][col]+"  ");
            }
            System.out.println("");
        }
    }
}
