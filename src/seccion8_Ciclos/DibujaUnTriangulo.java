package seccion8_Ciclos;

import java.util.Scanner;

public class DibujaUnTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triangulo ***");
        //Creo mi objeto de tipo Scanenr, para el ingreso por consola
        Scanner scanner = new Scanner(System.in);

        System.out.print("Proporciona un número de filas: ");
        int numeroFilas = scanner.nextInt();

        for( int i = 1 ; i<=numeroFilas; i++){
            // Calculo los espacioes en blanco, para eso necesito restarle al numero total de filas,
            // la fila en la que estoy parado, eso me va a dar la cantidad de espacios para rellenar.
            String espaciosEnBlanco =" ".repeat(numeroFilas-i);
            // Luego voy a multiplicar por 2 la fila en la que estoy parado y restarle un 1
            // de esta manera se cuantos asteriscos dibujar
            String asteriscos = "*".repeat((2*i)-1);
            //por ultimo muestro las dos cosas juntas por pantalla.
            System.out.println(espaciosEnBlanco+asteriscos);
        }
    }
}
