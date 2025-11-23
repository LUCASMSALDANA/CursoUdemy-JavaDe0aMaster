package seccion10_Matrices;

import java.util.Scanner;

public class RetoSumaDiagonalMatriz {
    public static void main(String[] args) {
        System.out.println("*** Suma de la diagonal de una matriz ***");

        Scanner scanner = new Scanner(System.in);
        int filas, columnas;

        //Pido ingresar filas y columnas al usuario
        System.out.print("Ingrese el numero de filas: ");
        filas = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el numero de filas: ");
        columnas = Integer.parseInt(scanner.nextLine());

        int[][] matriz = new int[filas][columnas];
        int suma=0;

        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz[fil].length; col++) {
                System.out.print("Ingrese un Valor para matriz[" + fil + "][" + col + "]: ");
                matriz[fil][col] = Integer.parseInt(scanner.nextLine());
                if(fil==col){
                    suma+=matriz[fil][col];
                }
            }
        }

        System.out.println("Resultado de la suma de la diagonal : "+suma);
    }
}
