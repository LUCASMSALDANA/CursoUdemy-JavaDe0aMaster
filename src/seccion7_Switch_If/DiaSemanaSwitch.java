package seccion7_Switch_If;

import java.util.Scanner;

public class DiaSemanaSwitch {
    public static void main(String[] args) {
        System.out.println("*** Día de la Semana con Switch ***");
        //Creo mi objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero del día (1-7): ");
        int numeroDia= Integer.parseInt(scanner.nextLine());

        //Sintaxis clásica de Switch
        switch (numeroDia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No se reconoce ese numero de día : " + numeroDia);
                break;
        }

        //Sintaxis mejorada para versiones superiores a la 12
        String diaSemana= switch (numeroDia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Día Inválido";
        };
        System.out.println("Resultado con el switch mejorado: "+ diaSemana);
    }
}
