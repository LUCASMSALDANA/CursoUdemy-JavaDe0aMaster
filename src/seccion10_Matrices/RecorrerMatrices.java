package seccion10_Matrices;

public class RecorrerMatrices {
    public static void main(String[] args) {
        System.out.println("*** Recorrer una Matriz ***");
        //Definimos una matriz
        int FILAS = 2 , COLUMNAS = 3;
        int[][] matriz= new int [FILAS][COLUMNAS];
        //Modificar los valores a mano:
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLUMNAS; col++) {
                System.out.print("Valor["+fil+"]["+col+"]: "+ matriz[fil][col]+" ");
            }
            System.out.println();
        }

    }
}
