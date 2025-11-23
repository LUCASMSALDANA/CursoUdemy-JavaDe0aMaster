package seccion7_Switch_If;

import java.util.Scanner;

public class RetoEstacionDelAno {
    public static void main(String[] args) {
        System.out.println("*** Estacion del año ***");

        //Creo mi objeto scanner
        Scanner scanner = new Scanner(System.in);
        //Creo la variable estación;
        String estacion;

        System.out.print("Proporcione el valor del mes (1-12): ");
        int mes = Integer.parseInt(scanner.nextLine());

        if (mes==1 ||  mes==2 || mes==12){
            estacion = "Verano";
        }else if(mes==3 ||  mes==4 || mes==5){
            estacion = "Otoño";
        }else if(mes==6 ||  mes==7 || mes==8){
            estacion = "Invierno";
        }else if(mes==9 ||  mes==10 || mes==11){
            estacion = "Primavera";
        }else {
            estacion = "Estación desconocida... ";
        }
        //Mostramos el resultado por pantalla
        System.out.printf("La estación para el mes %d es : %s",mes,estacion);

        //Con switch mejorado
        estacion=switch (mes){
            case 1 , 2, 12 -> "Verano";
            case 3 , 4, 5 -> "Otoño";
            case 6, 7 , 8 -> "Invierno";
            case 9 , 10, 11 -> "Primavera";
            default -> "Estacion desconocida...";
        };

        System.out.println("Resultado con el switch mejorad: "+ estacion);
    }
}
