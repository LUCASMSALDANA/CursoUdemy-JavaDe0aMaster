package Seccion8;

public class RetoDoWhileNumerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Impares ***");

        int contador= 0;
        do{
            if (contador%2 ==1){
                System.out.print(contador+" ");
            }
            contador++;
        }while(contador<=20);
    }
}
