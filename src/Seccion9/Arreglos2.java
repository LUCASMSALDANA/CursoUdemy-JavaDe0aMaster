package Seccion9;

import java.util.Scanner;

public class Arreglos2 {
    public static void main(String[] args) {
        System.out.println("*** Introducir valores por consola a mi arreglo ***");
        //Creo el objeto scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proporcione el largo del arreglo: ");
        int largo = Integer.parseInt(scanner.nextLine());
        int[] numeros= new int[largo];

        //Recorremos el largo pidiendo que se cargen los numeros
        for (int i = 0; i<numeros.length ; i++) {
            System.out.print("Ingrese el valor en la posicion ["+i+"]: ");
            numeros[i]=Integer.parseInt(scanner.nextLine());
        }

        //Recorremos el arregla para mostrar los datos:
        for (int i = 0; i<numeros.length ; i++) {
            System.out.println("El valor en la posicion ["+i+"] es de: "+numeros[i]);
        }
    }
}
