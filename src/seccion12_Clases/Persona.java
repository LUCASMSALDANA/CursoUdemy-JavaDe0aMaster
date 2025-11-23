package seccion12_Clases;

public class Persona {
    String nombre, apellido;
    int edad;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    void mostrarNombre(){
        System.out.println("Nombre: "+nombre);
    }
    void mostrarApellido(){
        System.out.println("Apellido: "+apellido);
    }
    void mostrarPersona(){
        System.out.println("Nombre y apellido: "+nombre+" "+apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos del tipo Persona ***");

        Persona objeto1 = new Persona();
        objeto1.nombre="Lucas";
        objeto1.apellido="Saldaña";
        objeto1.edad= 33;
        Persona objeto2 = new Persona();
        objeto2.nombre="Camila";
        objeto2.apellido="Perez";
        objeto2.edad= 28;

        objeto1.mostrarPersona();
        objeto2.mostrarPersona();

        System.out.println(objeto1);
    }
}
