package seccion13_temas_avanzados;

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Lucas");
        persona.setApellido("Saldaña");

        System.out.println("Persona: "+persona);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());

    }
}
// Para crear un javaBean la clase necesita implementar la interface Serializable
// y cumplir con las normas de encapsulamiento, es decir atributos privados, getters y setters y
// al menos un constructor vacio.

class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona(){}

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
