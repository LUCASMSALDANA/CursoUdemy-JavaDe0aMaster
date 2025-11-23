package seccion8_Ciclos;

import java.util.Random;
import java.util.Scanner;

public class RetoJuegoAdivinanza {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanza ***");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Generamos el numero aleatorio entre 1 y 50
        int numeroSecreto = random.nextInt(50)+1;
        int intentos= 0;
        final int INTENTOS_MAXIMOS = 5;
        int numeroIngresado = 0;

        while (numeroIngresado != numeroSecreto && intentos<INTENTOS_MAXIMOS){
            System.out.print("Ingrese un un numero (1-50): ");
            numeroIngresado = scanner.nextInt();
            if (numeroIngresado<numeroSecreto){
                System.out.println("El número secreto es mayor al número ingresado");
            }else{
                System.out.println("El número secreto es menor al número ingresado");
            }
            intentos++;
        }

        if (numeroIngresado==numeroSecreto){
            System.out.println("Felicidades! Adivinaste el número secreto!");
        }else{
            System.out.println("Lo lamento no lo has conseguido, mejor suerte para la próxima vez! " +
                    "\nEl número secreto era: " + numeroSecreto);
        }
    }
}
