package seccion5;

import java.util.Scanner;

public class ValorDentroDeRango {
    public static void main(String[] args) {

        //Defino minimo y maximo
        final int min=0 , max=5 ;

        //Creo el objeto scanner para ingresar por consola
        Scanner scanner= new Scanner(System.in);
        //Pido que ingrese un valor y a continuacion utilizo .nextInt(), para asignar valor a mi variable.
        System.out.print("Ingrese un valor entero: ");
        int num = scanner.nextInt();

        //Creo la variable estadentrodelrango, y le asigno el valor segun la respuesta a mis operadores logicos
        boolean estaDentroDelRango = num>= min && num<=max;

        //Muestro si esta dentro o fuera del rango
        System.out.println("El valor ingresado esta dentro del rango? "+ estaDentroDelRango);
    }
}
