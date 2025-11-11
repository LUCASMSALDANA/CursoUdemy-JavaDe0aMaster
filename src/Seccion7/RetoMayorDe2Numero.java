package Seccion7;

import java.util.Scanner;

public class RetoMayorDe2Numero {
    public static void main(String[] args) {
        System.out.println("*** El mayor de 2 numeros ***");
        //Creo mi objeto scanner
        Scanner scanner = new Scanner(System.in);

        //Pido al  usuario ingresar los datos
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        //Uso el operador ternaria para descubrir el mayor
        int mayornumero = numero1>numero2 ? numero1 : numero2;
        //Tambien se puede usar el Math.max(numero1,numero2)
        int mayornumeroMax = Math.max(numero1, numero2);

        System.out.println("De los números que han sido ingresados el mayor es: "+ mayornumero);
        System.out.println("Mayor calculado con la funcion Math.Max(): "+ mayornumeroMax);
    }
}
