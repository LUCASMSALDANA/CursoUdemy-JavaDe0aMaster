package Seccion7;

import java.util.Scanner;

// Crear un programa que convierta las calificaciones númericas (0-10)
// a una letra (De la F a la A)
// A = entre 9 y 10
// B = entre 8 y 9
// C = entre 7 y 8
// D = entre 6 y 7
// F = entre 0 y 6

public class SistemaDeCalificaciones {
    public static void main(String[] args) {

        System.out.println("*** Sistema de Calificaciones ***");
        //Creamos el objeto scanner
        Scanner scanner = new Scanner(System.in);
        String calificacionEnLetra;

        //Pido al usuario la calificación:
        System.out.print("Ingrese una calificación entre 0 y 10: ");
        float calificacion = Float.parseFloat(scanner.nextLine());

        // Revisamos si esta dentro del rango y asignamos el valor
        if (calificacion>=9 && calificacion<=10){
            calificacionEnLetra="A";
        } else if (calificacion>=8 && calificacion<9) {
            calificacionEnLetra= "B";
        } else if (calificacion>=7 && calificacion < 8) {
            calificacionEnLetra= "C";
        } else if (calificacion>=6 && calificacion < 7){
            calificacionEnLetra="D";
        } else if (calificacion>=0 && calificacion < 6) {
            calificacionEnLetra="F";
        }else{
            calificacionEnLetra="Nota incorrecta, ingrese un valor del 0 al 10";
        }

        //Muestro resultado por pantalla
        System.out.printf("La nota %.2f es equivalente a %s",calificacion,calificacionEnLetra);
    }
}
