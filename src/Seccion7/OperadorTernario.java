package Seccion7;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        String mensaje= (edad>=18) ? "Puede ingresar, es mayor de edad" : "No puede ingresar, es menor";
        System.out.println(mensaje);
    }
}
