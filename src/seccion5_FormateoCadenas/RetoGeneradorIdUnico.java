package seccion5_FormateoCadenas;
// Se solicita un programa para generar un valor de Id único por persona
// El programa debe solicitar}
//      Nombre
//      Apellido
//      Año de nacimiento (yyyy)
// El programa deberá generar un valor aleatorio de 4 dígitos entre 1 y 9999. Si el número es menor de 5 dígitos
// se debe completar con ceros a la izquierda
// Finalmente con los datos obtenidos se debe generar el ID uniendo los valores de la siguiente forma:
//      Nombre: Juan (JU)       Apellido: Perez (PE)        Año: 1995 (95)      Aleatorio: 0736
//
//          ID UNICO: JUPE950736

import java.util.Random;
import java.util.Scanner;

public class RetoGeneradorIdUnico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("*** Sistema Generador de ID Único ***");

        System.out.print("Nombre del emplado: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido del emplado: ");
        String apellido = scanner.nextLine();

        System.out.print("Año de nacimiento (YYYY): ");
        int anioNacimiento = scanner.nextInt();

        int digitoAzar = random.nextInt(9999)+1;
        String digitoAzarFormateado = String.format("%04d",digitoAzar);

        String idEmpleado = nombre.toUpperCase().substring(0,2)  //Convierto a mayus y concateno las 2 primeras letras del nombre
                            .concat(apellido.toUpperCase().substring(0,2)) //Convierto a mayus y concateno las 2 primeras letras del apellido
                            .concat(String.valueOf(anioNacimiento) //Concateno la fecha de nacimiento
                            .concat(digitoAzarFormateado)); // por ultimo concateno el digito generado al azar ya formateado

        System.out.printf("""
                Hola %s,
                \tTu nuevo número de identificación (ID) generado por sistema es:
                \t\t%s
                \tFelicitaciones !
                """,nombre,idEmpleado);
    }
}
