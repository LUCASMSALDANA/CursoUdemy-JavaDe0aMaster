package Seccion11Funciones;

import java.util.Scanner;

public class FuncionEsPar {
    static boolean esPar(int num){
        return (num%2==0);
    }

    public static void main(String[] args) {
        System.out.println("*** Funcion es par? ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("El número ingresado es par? "+ esPar(numero));
    }
}
