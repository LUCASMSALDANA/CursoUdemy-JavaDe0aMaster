package Seccion9;

public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Arreglos en Java ***");
        //Declaro mi variable
        int[] numeros = new int[5];
        //recorro el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El arreglo en la posicion: "+i+" tiene el valor de: "+numeros[i]);
        }
        System.out.println("*****************");
        System.out.println("Como veran al declarar mi arreglo de tipo entero y definir cuantos elementos " +
                "tiene, Se crea el arreglo pero por default los elementos tienen valor 0");
        System.out.println("Veamos que pasa al cambiar algunos valores de mi arreglo:");
        System.out.println("*****************");

        numeros[0] = 1;
        numeros[2] = 3;
        numeros[4] = 5;

        //Vuelvo a recorrer el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El arreglo en la posicion: "+i+" tiene el valor de: "+numeros[i]);
        }

        System.out.println("*****************");
        System.out.println("Por ultimo veamos otra manera de crear un arreglo y recorrerla");
        System.out.println("*****************");

        int[] enteros = {0,42,66,33,120};

        //Recorro el arreglo
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("El arreglo en la posicion: "+i+" tiene el valor de: "+enteros[i]);
        }

        // Otra forma de usar el fort
        System.out.println("*****************");
        System.out.println("Otro tipo de for");
        System.out.println("*****************");
        //otra manera de usar el for:
        int contador= 0; // para este tipo de for necesitamos definir un contador para saber en que posicion estamos parados
        for (int numero :enteros){
            System.out.println("El arreglo en la posicion: "+contador++ +" tiene el valor de: "+numero);
        }
    }
}
