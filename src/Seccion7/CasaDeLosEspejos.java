package Seccion7;

import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Bienvenido a la casa de los Espejos ***");

        System.out.print("Que edad tienes? :");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Le tienes miedo a la oscuridad? (true/false): ");
        boolean tieneMiedoAlaOscuridad = Boolean.parseBoolean(scanner.nextLine());

        if(!tieneMiedoAlaOscuridad && edad>=10){
            System.out.println("Puedes entrar a la casa de los espejos");
        }else{
            System.out.println("La casa de los espejos podria ser espeluznante para ti !");
        }
    }
}
