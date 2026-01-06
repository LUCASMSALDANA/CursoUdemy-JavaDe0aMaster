package seccion13_temas_avanzados.ProyectoMaquinaSnacks;
import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnack = 0;
    private int idSnack;
    private String nombre;
    private double precio;

    public Snack(){
        this.idSnack = ++contadorSnack;
    }

    public Snack(String nombre, double precio) {
        this(); // Mando a llamar al constructor vacio para obbtener el idSnack. La llamada debe estar si o si la primer linea
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters & Setters

    public static int getContadorSnack() {
        return contadorSnack;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
