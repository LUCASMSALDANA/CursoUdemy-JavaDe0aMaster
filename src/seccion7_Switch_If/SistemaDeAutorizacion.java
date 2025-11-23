package seccion7_Switch_If;

import java.util.Scanner;

public class SistemaDeAutorizacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autorización ***");
        //Creo mi objeto de tipo Scanner
        Scanner scanner = new Scanner(System.in);
        //Defino mis variables
        final String USER = "admin";
        final String PASS = "123";
        //Pedimos los datos por consola
        System.out.print("Ingrese su usuario: ");
        String usuarioInput = scanner.nextLine().trim().toLowerCase();
        System.out.print("Ingrese su password: ");
        String passInput = scanner.nextLine();

        //Usamos switch en este reto para practicar
        String mensaje = switch (usuarioInput){
            case USER -> {
                if (PASS.equals(passInput)){
                    yield "Bienvenido al sistema!";
                }else{
                    yield "Contraseña incorrecta";
                }
            }
            default -> {
                if (PASS.equals(passInput)){
                    yield "Usuario incorrecto";
                }else{
                    yield "Usuario y contraseña incorrectos";
                }
            }
        };

        System.out.println(mensaje);
    }
}
