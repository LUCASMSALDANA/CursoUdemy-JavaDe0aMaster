package Seccion8;

public class CicloWhile {
    public static void main(String[] args) {
        int contador = 1;

        System.out.println("Ciclo While con post incremento");
        while (contador<=5){
            System.out.println(contador++);
        }

        contador=1;
        System.out.println("Ciclo While con pre incremento");
        while (contador<=5){
            System.out.println("valor del contador : "+contador);
            System.out.println(++contador);
        }

    }
}
