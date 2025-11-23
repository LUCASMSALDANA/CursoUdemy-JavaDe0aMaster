package seccion12_Clases.Reto_encapsulamiento_persona.pruebapersona;

import seccion12_Clases.Reto_encapsulamiento_persona.persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objeto Persona ***");

        //Creamos nuestros objetos
        Persona persona1 = new Persona("Lucas", "Saldaña");
        Persona persona2 = new Persona("Florencia", "Garcia");

        //Mostramos sus nombres
        System.out.println("Persona 1 :");
        persona1.mostrarPersona();;
        System.out.println("Persona 2 :");
        persona2.mostrarPersona();

        //Modificamos el valor de sus atributos (nombre y apellido)
        System.out.println("----------------------------");
        System.out.println("Cambiamos los nombres");
        persona1.setNombre("Ricardo");
        persona1.setApellido("Ruben");
        persona2.setNombre("Belen");
        persona2.setApellido("de Jerusalen");

        System.out.println("----------------------------");
        System.out.println("Los mostramos con get");
        System.out.println("----------------------------");

        System.out.println("Persona 1 :");
        System.out.println("El nombre completo es: "+persona1.getNombre()+" "+persona1.getApellido());
        System.out.println("Persona 2 :");
        System.out.println("El nombre completo es: "+persona2.getNombre()+" "+persona2.getApellido());

    }
}
