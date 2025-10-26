package seccion5;
// Se solicita crear un programa para pedir la información de un empleado.
// Los datos a introducir por consola son:
// Nombre del empleado.
// Edad (int)
// Salario (double)
// Es jefe de departamento (boolean)
// Luego mostrar por pantalla
// Usar nextLine y convertir segun corresponda

// Nota personal, falta el manejo de errores... asume que el usuario es perfecto...

import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Sistema de Empleados ***");
        // Comienzo a pedir datos

        //Nombre del empleado
        System.out.print("Nombre del empleado: ");
        String nombreEmpelado = scanner.nextLine();

        //Edad del empleado
        System.out.print("Edad del empleado: ");
        int edad = Integer.parseInt(scanner.nextLine());

        //Salario del empleado
        System.out.print("Salario del empleado: ");
        double salario = Double.parseDouble(scanner.nextLine());

        //Es jefe?
        System.out.print("Jefe de departamento: ");
        boolean esJefe = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("\nDatos del empleado\n");

        System.out.println("\tNombre: " +nombreEmpelado);
        System.out.println("\tEdad: " + edad);
        // System.out.println("Salario: " + salario);  Esta opción es válida pero vamos a ver como se formatea
        System.out.printf("\tSalario: $%.2f", salario); // De esta manera indico que voy a formatearlo .
        System.out.println("\tEs jefe de departamento: " + esJefe);

    }
}
