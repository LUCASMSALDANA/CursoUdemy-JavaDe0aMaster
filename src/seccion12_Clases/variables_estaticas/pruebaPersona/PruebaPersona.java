package seccion12_Clases.variables_estaticas.pruebaPersona;

import seccion12_Clases.variables_estaticas.persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Variables Estaticas ***");
        System.out.println("Variable Estatica: " + Persona.getContadorPersona());
        System.out.println("Creamos algunas personas...");
        Persona persona1= new Persona("Lucas","Saldaña");
        Persona persona2= new Persona("Lucas","Saldaña");
        System.out.println("Variable Estatica: " + Persona.getContadorPersona());

        // Mostramos todos los atributos
        System.out.println(persona1);
        System.out.println(persona2);

    }

}
