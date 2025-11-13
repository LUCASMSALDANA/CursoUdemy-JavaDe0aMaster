package Seccion8;

public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Números pares del 1 al 20 ***");
        int contador= 1;
        while (contador<=20){
            if (contador %2 == 0){
                System.out.printf("El número %d es par %n",contador);
            }
            contador++;
        }
    }
}
