package Seccion8;

public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Números pares del 1 al 20 ***");
        //Declaro y asigno un valor a mi contador
        int contador= 1;

        while (contador<=20){ //Mientras que el contador sea menor o igual que 20 entonces...
            if (contador %2 == 0){ // Si divido al contador en dos y el resto es 0 entonces (significa que es par)
                System.out.printf("El número %d es par %n",contador); //Muestro un mensaje con el numero par
            }
            contador++; //Aumento mi contador en 1.
        }
    }
}
