package seccion7_Switch_If;

import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        // Constantes
        final int META_PASOS_DIARIOS = 10000;
        final float CALORIAS_POR_PASOS=0.04f;

        Scanner scanner = new Scanner(System.in);

        //Pido el ingreso de datos al usuario
        System.out.print("Cual es tu nombre? ");
        String nombre = scanner.nextLine();

        System.out.print("Cuantos pasos caminaste hoy? ");
        int pasos = scanner.nextInt();

        //Defino si la meta fue alcanzada o no.
        String metaAlcanzada = pasos>=META_PASOS_DIARIOS ? "Si, lo has logrado" : "Te falto un poco más!";

        //Calculamos las calorias gastadas
        float caloriasQuemadas=pasos * CALORIAS_POR_PASOS;

        //Mostramos por pantalla
        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzada?: %s
                """,nombre,pasos,caloriasQuemadas,metaAlcanzada);

    }
}
