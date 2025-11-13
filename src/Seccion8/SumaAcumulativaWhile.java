package Seccion8;

public class SumaAcumulativaWhile {
    public static void main(String[] args) {
        final int MAXIMO = 5;
        int acumulador=0;
        int contador = 1;

        while(contador<=MAXIMO) {
            System.out.println("(Acumulador + número) -> "+acumulador+" + " +contador);
            acumulador += contador;
            contador++;
            System.out.println("Suma parcial acumulada:  " + acumulador);
            System.out.println("----------------");

        }
    }
}
