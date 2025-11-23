package seccion5_FormateoCadenas;

import java.util.Scanner;

public class RetoSistemaAutenticacion69 {
    public static void main(String[] args) {
        //Creo mi objeto Scanner para poder ingresar datos por consola
        Scanner scanner = new Scanner(System.in);
        //Creo y defino las variables user y pass, que son las que validan el ingreso
        final String USER= "admin";
        final String PASS="123";

        System.out.println("*** Sistema de Autenticación de Usuario ***");
        //Pedimos al usuario ingresar el user
        System.out.print("Ingrese su usuario: " );
        String userInput= scanner.nextLine().trim().toLowerCase(); // quitamos los espacios y pasamos a minusclas
        //Pedimos la usuario ingresar su password
        System.out.print("Ingrese su password: " );
        String passInput= scanner.nextLine().trim(); //Solo quitamos espacios, las contraseñas son SensibleCase

        //Creamos y asignamos un valor booleano que resulta de la comparacion de las variables ingresadas con las constantes
        boolean haIngresado = USER.equals(userInput) && PASS.equals(passInput);

        //Mostramos por pantalla el resultado
        System.out.println("Los datos son correctos? " + haIngresado );

    }
}
