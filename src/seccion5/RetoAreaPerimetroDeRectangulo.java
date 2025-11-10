package seccion5;

import java.util.Scanner;

/// Se solicita calcular el area y el perimetro de un rectangulo
/// Los datos deben ser ingresados por consola

public class RetoAreaPerimetroDeRectangulo {
    public static void main(String[] args) {
        // Definimos las variables
        double base , altura , area , perimetro;
        // Creamos el objeto Scanner para poder ingresar por consola
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Calcular area y perimetro de un Rectangulo ***\n");

        //Pedimos ingresar el valor de la base
        System.out.print("Ingrese cuanto mide la base de su rectangulo: ");
        base = Double.parseDouble(scanner.nextLine());

        //Pedimos ingresar el valor de la base
        System.out.print("Ingrese cuanto mide la altura de su rectangulo: ");
        altura = Double.parseDouble(scanner.nextLine());

        //Calculamos y asignamos el valor para el area y el perimetro con los vaores ingresados
        area=base*altura;
        perimetro= 2*(base+altura);

        System.out.println("\nResultado de la operacion");
        System.out.println("-------------------------");
        System.out.printf("Area del rectangulo : %.2f" , area);
        System.out.printf("\nPerimetro del rectangulo : %.2f" , perimetro);

    }
}
