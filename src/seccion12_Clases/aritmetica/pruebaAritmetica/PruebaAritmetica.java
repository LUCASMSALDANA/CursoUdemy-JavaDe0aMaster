package seccion12_Clases.aritmetica.pruebaAritmetica;

import seccion12_Clases.aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        System.out.println("Objeto Aritmetica1");
        Aritmetica aritmetica1 = new Aritmetica(5,7);
        aritmetica1.setOperando1(10);
        aritmetica1.sumar();
        aritmetica1.restar();

        System.out.println("\nObjeto Aritmetica2");
        Aritmetica aritmetica2 = new Aritmetica(12,6);
        aritmetica2.sumar();
        aritmetica2.restar();

    }
}
