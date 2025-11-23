package seccion12_Clases.Reto_encapsulamiento_persona.persona;

public class Persona {
    private String nombre , apellido;

    //Constructor
    public Persona (String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    // Getters & Setters

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void mostrarPersona(){
        System.out.printf("El nombre completo es: %s %s\n",this.nombre,this.apellido);
    }
}
