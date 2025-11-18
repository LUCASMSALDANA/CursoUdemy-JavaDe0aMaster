package Seccion10;

public class Matrices {
    public static void main(String[] args) {
        //Definimos una matriz
        int[][] matriz= new int [2][3];
        //Modificar los valores a mano:
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        System.out.println("Valor de [0][0]: "+matriz[0][0]);
        System.out.println("Valor de [0][1]: "+matriz[0][1]);
        System.out.println("Valor de [0][2]: "+matriz[0][2]);
        System.out.println("Valor de [1][0]: "+matriz[1][0]);
        System.out.println("Valor de [1][1]: "+matriz[1][1]);
        System.out.println("Valor de [1][2]: "+matriz[1][2]);
    }
}
