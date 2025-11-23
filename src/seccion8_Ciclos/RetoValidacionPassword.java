package seccion8_Ciclos;

import java.util.Scanner;

public class RetoValidacionPassword {
    public static void main(String[] args) {
        System.out.println("*** Validación de Password ***");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una contraseña (Minimo 6 caracteres): ");
        String pass = scanner.nextLine();

        while (pass.length() <6){
            System.out.println("La contraseña debe tener al menos 6 caracteres.\n");
            System.out.print("Ingresa una contraseña (Minimo 6 caracteres): ");
            pass = scanner.nextLine();
        }

        System.out.println("Contraseña creada con Éxito! ");
    }
}
