package Seccion7;

import java.util.Scanner;

public class EvaluarSiElNumeroEsPositivo {
    public static void main(String[] args) {
        //Creo mi objeto de tipo Scanner
        Scanner scanner = new Scanner(System.in);
        //Defino mi variable
        int num;

        System.out.println("*** Sistema para evaluar si el número es o no positivo ***");

        System.out.print("Ingrese un número: ");
        num = scanner.nextInt();

        if (num>0){
            System.out.println("El número ingresado es positivo");
        }else if(num<0){
            System.out.println("El número es negativo");
        }else {
            System.out.println("El número ingresado es 0");
        }
    }
}
