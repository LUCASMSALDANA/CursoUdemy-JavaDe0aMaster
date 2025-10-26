package Seccion2;
//Se solicita crear una clase que se llame DetallePersona.java que realice lo siguiente:
// Declarar variables y asignarles sus valores correspondiente, seleccionando el tipo de dato correcto para
// cada variable. Las variables a crear son:
// Nombre Completo
// Edad
// Altura
// País de Origen
// Indicar con un caracter Estado civil. C - Casado, S - Soltero

public class DetallePersona {
    public static void main(String[] args) {
        String nombre = "Lucas Martin Saldaña";
        byte edad = 32;
        double altura = 1.65;
        String nacionalidad = "Argentina";
        char estadoCivil = 'S' ;

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(nacionalidad);
        System.out.println(estadoCivil);
    }
}
