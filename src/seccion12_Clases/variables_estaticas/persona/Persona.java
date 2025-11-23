package seccion12_Clases.variables_estaticas.persona;

public class Persona {
    private  String nombre, apellido;
    private static int contadorPersona = 0;
    private int idPersona;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", idPersona=" + idPersona +
                ", Dir. Memoria=" + super.toString() +
                '}';
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = ++Persona.contadorPersona;
    }

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

    public static int getContadorPersona() {
          return Persona.contadorPersona;
    }
}
