package seccion5;

import java.util.Random;

public class NumerosAleatoriosFloat {
    public static void main(String[] args) {
        Random random= new Random();
        // El nextFloat genera un numero aleatorio entre 0.0 y 1.0
        float numeroAlazar ;

        System.out.println("***  Numeros aleatorios entre 0 y 10 (random.nextFloat()");
        for(int i= 0 ;i<100;i++){
            numeroAlazar = random.nextFloat(10);
            System.out.printf("\nNumero al azar: %.2f", numeroAlazar);
        }

        System.out.println("\n***  Numeros aleatorios entre 1 y 11 (random.nextInt(10)+1");
        for(int i= 0 ;i<100;i++){
            numeroAlazar = random.nextFloat(10)+1;
            System.out.println("Numero al azar: " + numeroAlazar);
        }

    }


}
