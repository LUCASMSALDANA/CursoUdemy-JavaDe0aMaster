package Seccion11Funciones;

public class Funciones {
    public static void main(String[] args) {

        saludar("Hola mundo pero desde una funcion");
        saludar("Bueno eso fue todo!\nAdios!");

    }

    static void saludar(String mensaje){
        System.out.println(mensaje);
    }
}
