package seccion5;

import java.util.Random;

public class NumerosAleatoriosInt {
    public static void main(String[] args) {
        Random random= new Random();
        int numeroAlazar;
        System.out.println("***  Numeros aleatorios entre 0 y 9 (random.nextInt(10)");
        for(int i= 0 ;i<10;i++){
            numeroAlazar = random.nextInt(10);
            System.out.println("Numero al azar: " + numeroAlazar);
        }

        System.out.println("\n***  Numeros aleatorios entre 1 y 10 (random.nextInt(10)+1");
        for(int i= 0 ;i<10;i++){
            numeroAlazar = random.nextInt(10)+1;
            System.out.println("Numero al azar: " + numeroAlazar);
        }

    }


}
